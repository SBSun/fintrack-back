package com.sun.fintrack.trade.domain;

import com.sun.fintrack.asset.domain.Asset;
import com.sun.fintrack.category.domain.Category;
import com.sun.fintrack.common.domain.BaseTimeEntity;
import com.sun.fintrack.member.domain.Member;
import com.sun.fintrack.trade.domain.enums.TradeType;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 거래 내역 엔티티
 */
@Entity
@Getter
@NoArgsConstructor
@Table(name = "TRADE")
public class Trade extends BaseTimeEntity {

  /**
   * 거래 내역 일련번호
   */
  @Id
  @Column(name = "TRD_SEQ", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long tradeSeq;
  /**
   * 거래 내용
   */
  @Column(name = "TRD_CTT", nullable = false)
  private String content;
  /**
   * 거래 금액
   */
  @Column(name = "TRD_PRC", nullable = false)
  private Long price;
  /**
   * 거래일시
   */
  @Column(name = "TRD_DT", nullable = false)
  private LocalDateTime tradeDt;
  /**
   * 거래 타입
   */
  @Convert(converter = TradeType.TypeCodeConverter.class)
  @Column(name = "TRD_TYP", nullable = false)
  private TradeType type;
  /**
   * 내용 이미지
   */
  @Column(name = "TRD_IMG_PATH")
  private String imagePath;
  /**
   * 회원
   */
  @ManyToOne
  @JoinColumn(name = "MB_SEQ", nullable = false)
  private Member member;
  /**
   * 자산
   */
  @ManyToOne
  @JoinColumn(name = "AS_SEQ", nullable = false)
  private Asset asset;
  /**
   * 카테고리
   */
  @ManyToOne
  @JoinColumn(name = "CTG_SEQ", nullable = false)
  private Category category;

  public Trade(String content, Long price, LocalDateTime tradeDt, TradeType type, String imagePath, Member member,
      Asset asset, Category category) {
    this.content = content;
    this.price = price;
    this.tradeDt = tradeDt;
    this.type = type;
    this.imagePath = imagePath;
    this.member = member;
    this.asset = asset;
    this.category = category;
  }

  /**
   * 거래 내역 수정
   *
   * @param content  거래 내용
   * @param price    거래 금액
   * @param tradeDt  거래일시
   * @param asset    자산
   * @param category 카테고리
   */
  public void modify(String content, Long price, LocalDateTime tradeDt, TradeType type, Asset asset,
      Category category) {
    this.content = content;
    this.price = price;
    this.tradeDt = tradeDt;
    this.type = type;
    this.asset = asset;
    this.category = category;
  }
}
