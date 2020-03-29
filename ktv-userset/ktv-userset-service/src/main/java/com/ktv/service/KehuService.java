package com.ktv.service;

import com.ktv.bean.Kehu;
import com.ktv.bean.KehuExample;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.mapper.KehuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KehuService {

    @Autowired
    private KehuMapper mapper;

    public void updateOrSave(Kehu kehu){
        if(kehu==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        if(kehu.getKehuId()==null){
            mapper.insert(kehu);
        }else {
            mapper.updateByPrimaryKey(kehu);
        }

    }

    public List<Kehu> findAll(){
        return mapper.selectByExample(new KehuExample());
    }

    public Kehu findById(Long id){
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
