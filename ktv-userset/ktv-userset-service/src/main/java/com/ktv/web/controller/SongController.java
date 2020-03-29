package com.ktv.web.controller;

import com.ktv.bean.Song;
import com.ktv.enums.ExceptionEnums;
import com.ktv.service.SongService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/song")
@Api(value = "ktv-userset",tags = {"歌曲管理"})
public class SongController {

    @Autowired
    private SongService service;

    @GetMapping("/selectAll")
    @ApiOperation("查询所有歌曲")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/update")
    @ApiOperation("修改收藏歌曲")
    public ResponseEntity update(@RequestBody Song song){
        service.updateOrSave(song);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/selectById")
    @ApiOperation("根据ID查询歌曲")
    public ResponseEntity selectById(Long id){
        Song song = service.findById(id);
        return ResponseEntity.status(200).body(song);
    }

    @PostMapping("/save")
    @ApiOperation("新增歌曲")
    public ResponseEntity save(@RequestBody Song song){
        service.updateOrSave(song);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/delete")
    @ApiOperation("删除歌曲")
    public ResponseEntity delete(Long id){
        service.deleteById(id);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

}
