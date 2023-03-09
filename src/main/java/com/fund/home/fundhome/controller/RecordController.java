package com.fund.home.fundhome.controller;


import com.fund.home.fundhome.mapper.RecordMapper;
import com.fund.home.fundhome.model.Account;
import com.fund.home.fundhome.model.Record;
import com.fund.home.fundhome.model.vo.RecordVO;
import com.fund.home.fundhome.service.RecordService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/record/")
public class RecordController {

    @Resource
    RecordMapper recordMapper;

    @GetMapping("/")
    public ModelAndView list(ModelAndView modelAndView){
        List<RecordVO> list = recordMapper.queryList();
        modelAndView.setViewName("list");
        modelAndView.addObject("data",list);
        return modelAndView;
    }

}
