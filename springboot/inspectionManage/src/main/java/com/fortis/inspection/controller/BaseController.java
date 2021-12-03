package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.model.SysMenuVo;
import com.fortis.inspection.model.UserVo;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.BaseService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("base")
@Api(description = "基础接口")
@CrossOrigin
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private BaseService baseService;

    /*@Autowired
    private RedisUtil redisUtil;*/

    @PostMapping("login")
    @ApiOperation(value = "用户登录")
    public ResultData<UserVo> login(@ApiParam(name = "userAcct", value = "用户账号", required = true, example = "admin") @RequestParam String userAcct,
                                  @ApiParam(name = "userPasswd", value = "密码", required = true, example = "111111") @RequestParam String userPasswd,
                                    @ApiIgnore HttpSession session){
        return baseService.login(userAcct, userPasswd,session);
    }

    @PostMapping("menuData")
    @ApiOperation(value = "获取菜单")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<List<SysMenuVo>> getMenuData(@ApiParam(name = "roleId", value = "角色ID", required = true, example = "2") @RequestParam Integer roleId){
        List<SysMenuVo> list = baseService.getMenuData(roleId);
        return ResultData.success(list);
    }
}
