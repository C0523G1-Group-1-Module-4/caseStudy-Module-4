package com.example.cs4.account.model;



import com.example.cs4.role.model.Role;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;
    @Column(name = "username", nullable = false)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "is_deleted",columnDefinition = "boolean default false")
    private boolean isDeleted;
    @ManyToMany
    @JoinTable(name = "account_role")
    @JoinColumn(columnDefinition = "account_id",
    referencedColumnName = "role_id")
    private Set<Role> roleSet;

    public Account() {
    }

    public Account(int accountId, String userName, String password, boolean isDeleted) {
        this.accountId = accountId;
        this.userName = userName;
        this.password = password;
        this.isDeleted = isDeleted;
    }

    public Account(int accountId, String userName, String password, boolean isDeleted, Set<Role> roleSet) {
        this.accountId = accountId;
        this.userName = userName;
        this.password = password;
        this.isDeleted = isDeleted;
        this.roleSet = roleSet;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
