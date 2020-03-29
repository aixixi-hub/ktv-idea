package com.ktv.web.controller;

import com.ktv.bean.Singer;
import com.ktv.enums.ExceptionEnums;
import com.ktv.service.SingerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/singer")
@Api(value = "ktv-userset",tags = {"歌手管理"})
public class SingerController {

    @Autowired
    private SingerService service;

    @GetMapping("/selectAll")
    @ApiOperation("查询所有歌手")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/update")
    @ApiOperation("修改歌手信息")
    public ResponseEntity update(@RequestBody Singer singer){
        service.updateOrSave(singer);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/selectById")
    @ApiOperation("根据ID查询歌手")
    public ResponseEntity selectById(Long id){
        Singer singer = service.findById(id);
        return ResponseEntity.status(200).body(singer);
    }

    @PostMapping("/save")
    @ApiOperation("新增歌手")
    public ResponseEntity save(@RequestBody Singer singer){
        service.updateOrSave(singer);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/delete")
    @ApiOperation("删除歌手")
    public ResponseEntity delete(Long id){
        service.deleteById(id);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

}
