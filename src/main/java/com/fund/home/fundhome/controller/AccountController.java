package com.fund.home.fundhome.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fund.home.fundhome.model.Account;
import com.fund.home.fundhome.model.Catalog;
import com.fund.home.fundhome.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account/")
public class AccountController {

    @Resource
    AccountService accountService;

    @GetMapping("/")
    public ModelAndView list(ModelAndView modelAndView){
        modelAndView.setViewName("account");
        List<Account> list = accountService.list();


        modelAndView.addObject("data",list  );
        return modelAndView;
    }

}
