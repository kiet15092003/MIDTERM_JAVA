package com.example.SpringBootMidTermProject.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tbl_account")
@Getter
@Setter
@Builder
public class Account {
    @Id
    private String username;
    private String password;
    public Account(){

    }
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
}
