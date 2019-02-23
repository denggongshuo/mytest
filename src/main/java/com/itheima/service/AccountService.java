package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    // 查询所有账户
    public List<Account> findAll();

    // 保存帐户信息
    public void saveAccount(Account account);
}
