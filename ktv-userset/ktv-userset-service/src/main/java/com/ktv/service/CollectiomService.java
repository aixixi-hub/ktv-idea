package com.ktv.service;

import com.ktv.bean.Collectiom;
import com.ktv.bean.CollectiomExample;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.mapper.CollectiomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectiomService {

    @Autowired
    private CollectiomMapper mapper;

    public void updateOrSave(Collectiom collectiom){
        if(collectiom==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        if(collectiom.getColId()==null){
            mapper.insert(collectiom);
        }else {
            mapper.updateByPrimaryKey(collectiom);
        }

    }

    public List<Collectiom> findAll(){
        return mapper.selectByExample(new CollectiomExample());
    }

    public Collectiom findById(Long id){
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
