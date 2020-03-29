package com.ktv.web.controller;

import com.ktv.bean.Create;
import com.ktv.enums.ExceptionEnums;
import com.ktv.service.CreateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crt")
@Api(value = "ktv-userset",tags = {"创作管理"})
public class CreateController {

    @Autowired
    private CreateService service;

    @GetMapping("/selectAll")
    @ApiOperation("查询所有创作")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/update")
    @ApiOperation("修改创作信息")
    public ResponseEntity update(@RequestBody Create create){
        service.updateOrSave(create);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/selectById")
    @ApiOperation("根据ID查询创作")
    public ResponseEntity selectById(Long id){
        Create create = service.findById(id);
        return ResponseEntity.status(200).body(create);
    }

    @PostMapping("/save")
    @ApiOperation("新增创作")
    public ResponseEntity save(@RequestBody Create create){
        service.updateOrSave(create);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/delete")
    @ApiOperation("删除创作")
    public ResponseEntity delete(Long id){
        service.deleteById(id);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

}
