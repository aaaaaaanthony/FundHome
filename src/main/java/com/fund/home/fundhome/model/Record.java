package com.fund.home.fundhome.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Record extends Model<Record> {
    @TableId(value = "id", type = IdType.AUTO)//指定自增策略
    private Integer id;
    private Integer catalogId;
    private BigDecimal amount;
    private String remark;
    private Date time;


    @Override
    public Serializable pkVal() {
        return id;
    }

}