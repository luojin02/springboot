package com.fortis.inspection.service;

import com.fortis.inspection.exception.InspectException;
import com.fortis.inspection.exception.InspectExceptionTypeEnum;
import com.fortis.inspection.mapper.BaseMapper;
import com.fortis.inspection.model.SysMenuVo;
import com.fortis.inspection.model.UserVo;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.result.ResultTypeEnum;
import com.fortis.inspection.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class BaseService {

    @Autowired
    private BaseMapper baseMapper;

    /**
     *  登录
     */
    public ResultData<UserVo> login(String userAcct, String userPasswd, HttpSession session) {
        UserVo user = baseMapper.login(userAcct, MD5Util.md5(userPasswd));
        if(ObjectUtils.isEmpty(user)){
            return ResultData.fail(ResultTypeEnum.USER_NOT_EXIST.getCode(),ResultTypeEnum.USER_NOT_EXIST.getMsg(),null);
        }if(user.getUserStatus().equals(0)){
            return ResultData.fail(ResultTypeEnum.USER_FORBIDDEN.getCode(),ResultTypeEnum.USER_FORBIDDEN.getMsg(),null);
        }
        session.setAttribute("userSession", user);
        session.setMaxInactiveInterval(60*60*12);   //session超时时间12小时
        return ResultData.success(user);
    }

    public List<SysMenuVo> getMenuData(Integer roleId) {
        if(ObjectUtils.isEmpty(roleId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        List<SysMenuVo> list_level_1 = baseMapper.getMenuData_level_1(roleId);
        List<SysMenuVo> list_level_2 = baseMapper.getMenuData_level_2(roleId);
        for (SysMenuVo parent : list_level_1) {
            List<SysMenuVo> childrenMenu = parent.getChildrenMenu();
            Integer menuId = parent.getMenuId();
            for (SysMenuVo child : list_level_2) {
                Integer childMenuId = child.getMenuId();
                if(menuId.equals(childMenuId/100)){
                    childrenMenu.add(child);
                }
            }
        }
        return list_level_1;
    }

    public String thread() {

        new Thread(){
            @Override
            public void run() {

                try {
                    System.out.println("bb");

                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }.start();

        return "aa";

    }
}
