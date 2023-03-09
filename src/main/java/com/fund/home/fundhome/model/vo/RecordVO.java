package com.fund.home.fundhome.model.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class RecordVO {

    private Integer id;
    private String catalogName;
    private Integer catalogType;
    private BigDecimal amount;
    private String remark;
    private Date time;
}
