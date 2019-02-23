package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao dao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层findAll方法执行...");
        return dao.findAll();
    }

    /**
     * 保存账号信息
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层saveAccount方法执行...");
        dao.saveAccount(account);
    }
}
