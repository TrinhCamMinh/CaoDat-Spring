package com.example.datcao.repository;

import com.example.datcao.entity.AccountMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMemberRepository extends JpaRepository<AccountMember, Integer> { }
