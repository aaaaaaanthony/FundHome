package com.fund.home.fundhome.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/report")
    public String report(){
        return "report";
    }

    @RequestMapping("/list")
    public String add(){
        return "list";
    }

    @RequestMapping("/account")
    public String account(){
        return "account";
    }

    @RequestMapping("/catalogAdd")
    public String catalogAdd(){
        return "catalog_add";
    }

}
