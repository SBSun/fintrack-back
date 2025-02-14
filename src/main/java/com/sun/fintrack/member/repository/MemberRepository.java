package com.sun.fintrack.member.repository;

import com.sun.fintrack.common.domain.enums.Valid;
import com.sun.fintrack.member.domain.Member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

  Optional<Member> findByEmailAndValid(String email, Valid valid);
}
