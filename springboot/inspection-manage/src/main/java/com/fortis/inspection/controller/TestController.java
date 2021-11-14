package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.entity.SysChannelEntity;
import com.fortis.inspection.service.InspectionService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("cc")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private InspectionService inspectionService;

    @GetMapping("hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("channel")
    @ApiOperation(value = "获取渠道信息")
    public SysChannelEntity getHello(@RequestParam("sysId") Integer sysId){
        SysChannelEntity channel = inspectionService.getChannel(sysId);
        logger.info("aaaaaaaaaaaaa");
        return channel;
    }

    @SercurValidate(name="visitor",pwd = "123456")
    @GetMapping("aop")
    public String login(@RequestParam("name")String name,@RequestParam("password")String password) {
        String massage = inspectionService.getMassage();
        System.out.println(massage+"BBBBBBBBBBB");
        return "用户名："+name+";密码："+password;
    }

}
