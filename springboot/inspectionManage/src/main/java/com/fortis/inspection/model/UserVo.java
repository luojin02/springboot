package com.fortis.inspection.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "查询用户信息")
public class UserVo {
    private static final long serialVersionUID = 4220515347228129741L;

    @Getter
    @Setter
    @ApiModelProperty("用户ID")
    private Integer userId;

    @Getter
    @Setter
    @ApiModelProperty("角色ID")
    private Integer roleId;

    @Getter
    @Setter
    @ApiModelProperty(value = "用户名")
    private String userName;

    @Getter
    @Setter
    @ApiModelProperty(value = "用户帐号")
    private String userAcct;

    @Getter
    @Setter
    @ApiModelProperty(value = "用户状态（0-禁用，1-启用）")
    private Integer userStatus;


}
