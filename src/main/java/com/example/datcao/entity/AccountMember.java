package com.example.datcao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AccountMember")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountMember {
    @Id
    @Column(name = "MemberID")
    private Integer memberId;

    @Column(name = "MemberPassword", nullable = false, length = 255)
    private String memberPassword;

    @Column(name = "FullName", length = 100)
    private String fullName;

    @Column(name = "EmailAddress", length = 100)
    private String emailAddress;

    @Column(name = "MemberRole", length = 50)
    private String memberRole;
}
