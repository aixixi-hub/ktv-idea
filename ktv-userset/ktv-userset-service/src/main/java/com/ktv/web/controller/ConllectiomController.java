package com.ktv.web.controller;

import com.ktv.bean.Collectiom;
import com.ktv.enums.ExceptionEnums;
import com.ktv.service.CollectiomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/col")
@Api(value = "ktv-userset",tags = {"收藏管理"})
public class ConllectiomController {

    @Autowired
    private CollectiomService service;

    @GetMapping("/selectAll")
    @ApiOperation("查询所有收藏")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/update")
    @ApiOperation("修改收藏信息")
    public ResponseEntity update(@RequestBody Collectiom collectiom){
        service.updateOrSave(collectiom);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/selectById")
    @ApiOperation("根据ID查询收藏")
    public ResponseEntity selectById(Long id){
        Collectiom collectiom = service.findById(id);
        return ResponseEntity.status(200).body(collectiom);
    }

    @PostMapping("/save")
    @ApiOperation("新增收藏")
    public ResponseEntity save(@RequestBody Collectiom collectiom){
        service.updateOrSave(collectiom);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/delete")
    @ApiOperation("删除收藏")
    public ResponseEntity delete(Long id){
        service.deleteById(id);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

}
