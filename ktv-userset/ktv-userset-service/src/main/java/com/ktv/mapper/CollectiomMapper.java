package com.ktv.mapper;

import com.ktv.bean.Collectiom;
import com.ktv.bean.CollectiomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectiomMapper {
    long countByExample(CollectiomExample example);

    int deleteByExample(CollectiomExample example);

    int deleteByPrimaryKey(Long colId);

    int insert(Collectiom record);

    int insertSelective(Collectiom record);

    List<Collectiom> selectByExample(CollectiomExample example);

    Collectiom selectByPrimaryKey(Long colId);

    int updateByExampleSelective(@Param("record") Collectiom record, @Param("example") CollectiomExample example);

    int updateByExample(@Param("record") Collectiom record, @Param("example") CollectiomExample example);

    int updateByPrimaryKeySelective(Collectiom record);

    int updateByPrimaryKey(Collectiom record);
}