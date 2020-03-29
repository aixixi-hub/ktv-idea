package com.ktv.mapper;

import com.ktv.bean.Create;
import com.ktv.bean.CreateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CreateMapper {
    long countByExample(CreateExample example);

    int deleteByExample(CreateExample example);

    int deleteByPrimaryKey(Long crtId);

    int insert(Create record);

    int insertSelective(Create record);

    List<Create> selectByExample(CreateExample example);

    Create selectByPrimaryKey(Long crtId);

    int updateByExampleSelective(@Param("record") Create record, @Param("example") CreateExample example);

    int updateByExample(@Param("record") Create record, @Param("example") CreateExample example);

    int updateByPrimaryKeySelective(Create record);

    int updateByPrimaryKey(Create record);
}