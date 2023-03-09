package com.fund.home.fundhome.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.fund.home.fundhome.model.Catalog;
import com.fund.home.fundhome.service.CatalogService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/catalog/")
public class CatalogController {

    @Resource
    CatalogService catalogService;

    @GetMapping("/")
    public ModelAndView list(ModelAndView modelAndView){
        modelAndView.setViewName("catalog");

        LambdaQueryWrapper<Catalog> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Catalog::getType, 1);
        modelAndView.addObject("data",  catalogService.list(wrapper));


        LambdaQueryWrapper<Catalog> wrapper2 = new LambdaQueryWrapper<>();
        wrapper2.eq(Catalog::getType, 2);
        modelAndView.addObject("data2", catalogService.list(wrapper2));
        return modelAndView;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id){
        // TODO 查询分类下有没有流水

        // TODO 删除

        return "forward:/catalog/";
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("type") Integer type){

        Catalog catalog = new Catalog();
        catalog.setType(type);
        catalog.setParentId(id);
        catalog.setName(name);
        catalogService.save(catalog);
        return "forward:/catalog/";
    }
}
