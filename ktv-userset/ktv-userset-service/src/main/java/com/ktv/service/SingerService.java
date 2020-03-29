package com.ktv.service;

import com.ktv.bean.Singer;
import com.ktv.bean.SingerExample;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.mapper.SingerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerService {

    @Autowired
    private SingerMapper mapper;

    public void updateOrSave(Singer singer){
        if(singer==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        if(singer.getSingerId()==null){
            mapper.insert(singer);
        }else {
            mapper.updateByPrimaryKey(singer);
        }

    }

    public List<Singer> findAll(){
        return mapper.selectByExample(new SingerExample());
    }

    public Singer findById(Long id){
        if(id==null){
            throw new KtvException((ExceptionEnums.PRAM_IS_NULL));
        }
        return mapper.selectByPrimaryKey(id);
    }

    public void deleteById(Long id){
        if(id==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        mapper.deleteByPrimaryKey(id);
    }

}
