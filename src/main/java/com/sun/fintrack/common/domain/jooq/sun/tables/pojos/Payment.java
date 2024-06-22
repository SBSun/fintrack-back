/*
 * This file is generated by jOOQ.
 */
package sun.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long pmSeq;
    private final Long mbSeq;
    private final String pmCtt;
    private final Long pmPrc;
    private final LocalDateTime pmDt;
    private final Long asSeq;
    private final Long ctgSeq;
    private final String pmImgPath;
    private final LocalDateTime creDt;
    private final LocalDateTime updDt;

    public Payment(Payment value) {
        this.pmSeq = value.pmSeq;
        this.mbSeq = value.mbSeq;
        this.pmCtt = value.pmCtt;
        this.pmPrc = value.pmPrc;
        this.pmDt = value.pmDt;
        this.asSeq = value.asSeq;
        this.ctgSeq = value.ctgSeq;
        this.pmImgPath = value.pmImgPath;
        this.creDt = value.creDt;
        this.updDt = value.updDt;
    }

    public Payment(
        Long pmSeq,
        Long mbSeq,
        String pmCtt,
        Long pmPrc,
        LocalDateTime pmDt,
        Long asSeq,
        Long ctgSeq,
        String pmImgPath,
        LocalDateTime creDt,
        LocalDateTime updDt
    ) {
        this.pmSeq = pmSeq;
        this.mbSeq = mbSeq;
        this.pmCtt = pmCtt;
        this.pmPrc = pmPrc;
        this.pmDt = pmDt;
        this.asSeq = asSeq;
        this.ctgSeq = ctgSeq;
        this.pmImgPath = pmImgPath;
        this.creDt = creDt;
        this.updDt = updDt;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_SEQ</code>. 결제 일련번호
     */
    public Long getPmSeq() {
        return this.pmSeq;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.MB_SEQ</code>. 회원 일련번호
     */
    public Long getMbSeq() {
        return this.mbSeq;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_CTT</code>. 결제 내용
     */
    public String getPmCtt() {
        return this.pmCtt;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_PRC</code>. 결제 금액
     */
    public Long getPmPrc() {
        return this.pmPrc;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_DT</code>. 결제일시
     */
    public LocalDateTime getPmDt() {
        return this.pmDt;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.AS_SEQ</code>. 자산 일련번호
     */
    public Long getAsSeq() {
        return this.asSeq;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.CTG_SEQ</code>. 카테고리 일련번호
     */
    public Long getCtgSeq() {
        return this.ctgSeq;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_IMG_PATH</code>. 이미지 경로
     */
    public String getPmImgPath() {
        return this.pmImgPath;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.CRE_DT</code>. 등록일시
     */
    public LocalDateTime getCreDt() {
        return this.creDt;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.UPD_DT</code>. 수정일시
     */
    public LocalDateTime getUpdDt() {
        return this.updDt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Payment other = (Payment) obj;
        if (this.pmSeq == null) {
            if (other.pmSeq != null)
                return false;
        }
        else if (!this.pmSeq.equals(other.pmSeq))
            return false;
        if (this.mbSeq == null) {
            if (other.mbSeq != null)
                return false;
        }
        else if (!this.mbSeq.equals(other.mbSeq))
            return false;
        if (this.pmCtt == null) {
            if (other.pmCtt != null)
                return false;
        }
        else if (!this.pmCtt.equals(other.pmCtt))
            return false;
        if (this.pmPrc == null) {
            if (other.pmPrc != null)
                return false;
        }
        else if (!this.pmPrc.equals(other.pmPrc))
            return false;
        if (this.pmDt == null) {
            if (other.pmDt != null)
                return false;
        }
        else if (!this.pmDt.equals(other.pmDt))
            return false;
        if (this.asSeq == null) {
            if (other.asSeq != null)
                return false;
        }
        else if (!this.asSeq.equals(other.asSeq))
            return false;
        if (this.ctgSeq == null) {
            if (other.ctgSeq != null)
                return false;
        }
        else if (!this.ctgSeq.equals(other.ctgSeq))
            return false;
        if (this.pmImgPath == null) {
            if (other.pmImgPath != null)
                return false;
        }
        else if (!this.pmImgPath.equals(other.pmImgPath))
            return false;
        if (this.creDt == null) {
            if (other.creDt != null)
                return false;
        }
        else if (!this.creDt.equals(other.creDt))
            return false;
        if (this.updDt == null) {
            if (other.updDt != null)
                return false;
        }
        else if (!this.updDt.equals(other.updDt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pmSeq == null) ? 0 : this.pmSeq.hashCode());
        result = prime * result + ((this.mbSeq == null) ? 0 : this.mbSeq.hashCode());
        result = prime * result + ((this.pmCtt == null) ? 0 : this.pmCtt.hashCode());
        result = prime * result + ((this.pmPrc == null) ? 0 : this.pmPrc.hashCode());
        result = prime * result + ((this.pmDt == null) ? 0 : this.pmDt.hashCode());
        result = prime * result + ((this.asSeq == null) ? 0 : this.asSeq.hashCode());
        result = prime * result + ((this.ctgSeq == null) ? 0 : this.ctgSeq.hashCode());
        result = prime * result + ((this.pmImgPath == null) ? 0 : this.pmImgPath.hashCode());
        result = prime * result + ((this.creDt == null) ? 0 : this.creDt.hashCode());
        result = prime * result + ((this.updDt == null) ? 0 : this.updDt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Payment (");

        sb.append(pmSeq);
        sb.append(", ").append(mbSeq);
        sb.append(", ").append(pmCtt);
        sb.append(", ").append(pmPrc);
        sb.append(", ").append(pmDt);
        sb.append(", ").append(asSeq);
        sb.append(", ").append(ctgSeq);
        sb.append(", ").append(pmImgPath);
        sb.append(", ").append(creDt);
        sb.append(", ").append(updDt);

        sb.append(")");
        return sb.toString();
    }
}
