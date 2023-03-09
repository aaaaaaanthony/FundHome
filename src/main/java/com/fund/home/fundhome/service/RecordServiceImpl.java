package com.fund.home.fundhome.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fund.home.fundhome.mapper.AccountMapper;
import com.fund.home.fundhome.mapper.RecordMapper;
import com.fund.home.fundhome.model.Account;
import com.fund.home.fundhome.model.Record;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements RecordService{
}
