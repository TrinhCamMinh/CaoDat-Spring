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
@Table(name = "accountmember")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountMember {
    @Id
    @Column(name = "memberid")
    private Integer memberId;

    @Column(name = "memberpassword", nullable = false, length = 255)
    private String memberPassword;

    @Column(name = "fullname", length = 100)
    private String fullName;

    @Column(name = "emailaddress", length = 100)
    private String emailAddress;

    @Column(name = "memberrole", length = 50)
    private String memberRole;
}
