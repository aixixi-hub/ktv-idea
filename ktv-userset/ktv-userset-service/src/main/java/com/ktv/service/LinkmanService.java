package com.ktv.service;

import com.ktv.bean.Linkman;
import com.ktv.bean.LinkmanExample;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.mapper.LinkmanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkmanService {

    @Autowired
    private LinkmanMapper mapper;

    public void updateOrSave(Linkman linkman){
        if(linkman==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        if(linkman.getLkmId()==null){
            mapper.insert(linkman);
        }else {
            mapper.updateByPrimaryKey(linkman);
        }

    }

    public List<Linkman> findAll(){
        return mapper.selectByExample(new LinkmanExample());
    }

    public Linkman findById(Long id){
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
