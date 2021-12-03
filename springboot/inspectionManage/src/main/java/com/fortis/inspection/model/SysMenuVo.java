package com.fortis.inspection.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@ApiModel(value = "查询全部菜单数据")
public class SysMenuVo {

    @Getter
    @Setter
    @ApiModelProperty("菜单ID")
    private Integer menuId;

    @Getter
    @Setter
    @ApiModelProperty("菜单名称")
    private String menuName;

    @Getter
    @Setter
    @ApiModelProperty("菜单等级")
    private Integer menuLevel;

    @Getter
    @Setter
    @ApiModelProperty("菜单图标")
    private String menuIcon;

    @Getter
    @Setter
    @ApiModelProperty("菜单链接")
    private String menuUrl;

    @Getter
    @Setter
    @ApiModelProperty("子菜单")
    private List<SysMenuVo> childrenMenu = new ArrayList<>();
}
