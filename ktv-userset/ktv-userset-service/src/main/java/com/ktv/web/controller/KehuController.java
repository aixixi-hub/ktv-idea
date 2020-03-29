package com.ktv.web.controller;

import com.ktv.bean.Kehu;
import com.ktv.enums.ExceptionEnums;
import com.ktv.service.KehuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kehu")
@Api(value = "ktv-userset",tags = {"客户管理"})
public class KehuController {

    @Autowired
    private KehuService service;

    @GetMapping("/selectAll")
    @ApiOperation("查询所有客户")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/update")
    @ApiOperation("修改客户信息")
    public ResponseEntity update(@RequestBody Kehu kehu){
        service.updateOrSave(kehu);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/selectById")
    @ApiOperation("根据ID查询客户")
    public ResponseEntity selectById(Long id){
        Kehu kehu = service.findById(id);
        return ResponseEntity.status(200).body(kehu);
    }

    @PostMapping("/save")
    @ApiOperation("新增客户")
    public ResponseEntity save(@RequestBody Kehu kehu){
        service.updateOrSave(kehu);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

    @GetMapping("/delete")
    @ApiOperation("删除客户")
    public ResponseEntity delete(Long id){
        service.deleteById(id);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

}
