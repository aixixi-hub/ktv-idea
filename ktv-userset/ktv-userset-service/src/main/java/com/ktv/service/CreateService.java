package com.ktv.service;

import com.ktv.bean.Create;
import com.ktv.bean.CreateExample;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.mapper.CreateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateService {

    @Autowired
    private CreateMapper mapper;

    public void updateOrSave(Create create){
        if(create==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        if(create.getCrtId()==null){
            mapper.insert(create);
        }else {
            mapper.updateByPrimaryKey(create);
        }

    }

    public List<Create> findAll(){
        return mapper.selectByExample(new CreateExample());
    }

    public Create findById(Long id){
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
