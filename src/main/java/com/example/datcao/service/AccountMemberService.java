package com.example.datcao.service;

import com.example.datcao.entity.AccountMember;

public interface AccountMemberService {
    void deleteAccount(int id);
    AccountMember updateAccountMember(int id, AccountMember accountMember);
}
