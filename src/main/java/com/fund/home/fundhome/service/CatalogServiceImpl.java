package com.fund.home.fundhome.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fund.home.fundhome.mapper.CatalogMapper;
import com.fund.home.fundhome.model.Catalog;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl extends ServiceImpl<CatalogMapper, Catalog> implements CatalogService{
}
