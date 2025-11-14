package com.example.datcao.service.impl;

import com.example.datcao.entity.AccountMember;
import com.example.datcao.repository.AccountMemberRepository;
import com.example.datcao.service.AccountMemberService;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AccountMemberServiceImpl implements AccountMemberService {
    private final AccountMemberRepository accountMemberRepository;

    @Override
    @Transactional
    public void deleteAccount(int id) {
        AccountMember curr = accountMemberRepository.findByMemberId(id);
        if (curr == null) {
            throw new EntityNotFoundException("AccountMember not found with id " + id);
        }
        accountMemberRepository.delete(curr);
    }

    @Override
    @Transactional
    public AccountMember updateAccountMember(int id, AccountMember updated) {
        AccountMember curr = accountMemberRepository.findByMemberId(id);
        if (curr == null) {
            throw new EntityNotFoundException("AccountMember not found with id " + id);
        }

        curr.setEmailAddress(updated.getEmailAddress());
        curr.setFullName(updated.getFullName());
        curr.setMemberPassword(updated.getMemberPassword());
        curr.setMemberRole(updated.getMemberRole());

        return curr;
    }

}
