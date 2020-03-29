package com.ktv.web.controller;

import com.ktv.bean.Album;
import com.ktv.enums.ExceptionEnums;
import com.ktv.service.AlbumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/album")
@Api(value = "ktv-userset",tags = {"专辑管理"})
public class AlbumController {

    @Autowired
    private AlbumService service;

    @GetMapping("/selectAll")
    @ApiOperation("查询所有专辑")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/update")
    @ApiOperation("修改专辑信息")
    public ResponseEntity update(@RequestBody Album album){
        service.updateOrSave(album);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/selectById")
    @ApiOperation("根据ID查询专辑")
    public ResponseEntity selectById(Long id){
        Album album = service.findById(id);
        return ResponseEntity.status(200).body(album);
    }

    @PostMapping("/save")
    @ApiOperation("新增专辑")
    public ResponseEntity save(@RequestBody Album album){
        service.updateOrSave(album);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/delete")
    @ApiOperation("删除专辑")
    public ResponseEntity delete(Long id){
        service.deleteById(id);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }
}
