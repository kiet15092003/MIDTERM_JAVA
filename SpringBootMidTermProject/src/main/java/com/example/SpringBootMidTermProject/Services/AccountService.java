package com.example.SpringBootMidTermProject.Services;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    @Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    public Account getAccount(Account account){
        Optional<Account> foundTK = accountRepository.findById(account.getUsername());
        return foundTK.isPresent() && account.getPassword().equals(foundTK.get().getPassword()) ?
                account : null;
    }
    public void save(Account account) {
         accountRepository.save(account);
    }
}
