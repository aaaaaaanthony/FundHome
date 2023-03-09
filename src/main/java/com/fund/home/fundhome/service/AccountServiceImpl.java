package com.fund.home.fundhome.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fund.home.fundhome.mapper.AccountMapper;
import com.fund.home.fundhome.mapper.CatalogMapper;
import com.fund.home.fundhome.model.Account;
import com.fund.home.fundhome.model.Catalog;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService{
}
