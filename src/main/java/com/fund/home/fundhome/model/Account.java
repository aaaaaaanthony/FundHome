package com.fund.home.fundhome.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Account extends Model<Account> {
    @TableId(value = "id", type = IdType.AUTO)//指定自增策略
    private Integer id;
    private String name;
    private Integer currency;
    private BigDecimal amount;

    @Override
    public Serializable pkVal() {
        return id;
    }

}