package com.ktv.service;

import com.ktv.bean.Album;
import com.ktv.bean.AlbumExample;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.mapper.AlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumMapper mapper;

    public void updateOrSave(Album album){
        if(album==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        if(album.getAlbunId()==null){
            mapper.insert(album);
        }else {
            mapper.updateByPrimaryKey(album);
        }

    }

    public List<Album> findAll(){
        return mapper.selectByExample(new AlbumExample());
    }

    public Album findById(Long id){
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
