package com.ktv.service;

import com.ktv.bean.Song;
import com.ktv.bean.SongExample;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.mapper.SongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongMapper mapper;

    public void updateOrSave(Song song){
        if(song==null){
            throw new KtvException(ExceptionEnums.PRAM_IS_NULL);
        }
        if(song.getSongId()==null){
            mapper.insert(song);
        }else {
            mapper.updateByPrimaryKey(song);
        }

    }

    public List<Song> findAll(){
        return mapper.selectByExample(new SongExample());
    }

    public Song findById(Long id){
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
