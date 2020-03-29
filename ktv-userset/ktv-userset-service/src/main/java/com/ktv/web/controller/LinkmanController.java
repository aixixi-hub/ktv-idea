package com.ktv.web.controller;

import com.ktv.bean.Linkman;
import com.ktv.enums.ExceptionEnums;
import com.ktv.service.LinkmanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lkm")
@Api(value = "ktv-userset",tags = {"演唱管理"})
public class LinkmanController {

    @Autowired
    private LinkmanService service;

    @GetMapping("/selectAll")
    @ApiOperation("查询所有演唱")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/update")
    @ApiOperation("修改演唱信息")
    public ResponseEntity update(@RequestBody Linkman linkman){
        service.updateOrSave(linkman);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/selectById")
    @ApiOperation("根据ID查询演唱")
    public ResponseEntity selectById(Long id){
        Linkman linkman = service.findById(id);
        return ResponseEntity.status(200).body(linkman);
    }

    @PostMapping("/save")
    @ApiOperation("新增演唱")
    public ResponseEntity save(@RequestBody Linkman linkman){
        service.updateOrSave(linkman);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/delete")
    @ApiOperation("删除演唱")
    public ResponseEntity delete(Long id){
        service.deleteById(id);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

}
