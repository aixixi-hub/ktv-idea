package com.ktv.mapper;

import com.ktv.bean.Kehu;
import com.ktv.bean.KehuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KehuMapper {
    long countByExample(KehuExample example);

    int deleteByExample(KehuExample example);

    int deleteByPrimaryKey(Long kehuId);

    int insert(Kehu record);

    int insertSelective(Kehu record);

    List<Kehu> selectByExample(KehuExample example);

    Kehu selectByPrimaryKey(Long kehuId);

    int updateByExampleSelective(@Param("record") Kehu record, @Param("example") KehuExample example);

    int updateByExample(@Param("record") Kehu record, @Param("example") KehuExample example);

    int updateByPrimaryKeySelective(Kehu record);

    int updateByPrimaryKey(Kehu record);
}