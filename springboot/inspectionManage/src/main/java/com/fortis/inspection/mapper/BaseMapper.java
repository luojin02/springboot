package com.fortis.inspection.mapper;

import com.fortis.inspection.model.SysMenuVo;
import com.fortis.inspection.model.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseMapper {

    UserVo login(@Param("userAcct")String userAcct, @Param("userPasswd")String userPasswd);

    List<SysMenuVo> getMenuData_level_1(@Param("roleId")Integer roleId);
    List<SysMenuVo> getMenuData_level_2(@Param("roleId")Integer roleId);

}
