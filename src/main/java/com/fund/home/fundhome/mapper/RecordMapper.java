package com.fund.home.fundhome.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fund.home.fundhome.model.Account;
import com.fund.home.fundhome.model.Record;
import com.fund.home.fundhome.model.vo.RecordVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordMapper extends BaseMapper<Record> {
    List<RecordVO> queryList();

}
