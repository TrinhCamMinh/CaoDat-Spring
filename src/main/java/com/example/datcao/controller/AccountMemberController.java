package com.example.datcao.controller;

import com.example.datcao.entity.AccountMember;
import com.example.datcao.service.AccountMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/account-members", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class AccountMemberController {
    private final AccountMemberService accountMemberService;

    @DeleteMapping("/{accId}")
    public ResponseEntity<String> deleteAccountMember(@PathVariable("accId") int accId) {
        accountMemberService.deleteAccount(accId);
        return ResponseEntity.ok("Account member removed successfully");
    }

    @PutMapping("/{accId}")
    public ResponseEntity<AccountMember> updateAccountMember(
        @PathVariable("accId") int accId,
        @RequestBody AccountMember accountMember
    ) {
        AccountMember updatedAcc = accountMemberService.updateAccountMember(accId, accountMember);
        return ResponseEntity.ok(updatedAcc);
    }
}
