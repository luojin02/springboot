package com.fortis.inspection.controller;

import com.fortis.inspection.entity.SysChannelEntity;
import com.fortis.inspection.service.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cc")
public class TestController {

    @Autowired
    private InspectionService inspectionService;

    @GetMapping("hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("channel")
    public SysChannelEntity getHello(@RequestParam("sysId") Integer sysId){
        SysChannelEntity channel = inspectionService.getChannel(sysId);
        return channel;
    }
}
