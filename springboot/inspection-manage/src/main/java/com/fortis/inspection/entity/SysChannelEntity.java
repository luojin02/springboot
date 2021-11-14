package com.fortis.inspection.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "系统渠道")
public class SysChannelEntity {
    @Getter
    @Setter
    @ApiModelProperty(value = "渠道ID",dataType = "int",required = true)
    private Integer channelId;
    @Getter
    @Setter
    @ApiModelProperty(value = "渠道名称",dataType = "string",required = true)
    private String channelName;     //渠道名称
    @Getter
    @Setter
    @ApiModelProperty(value = "电子邮箱",dataType = "string",required = true)
    private String email;       //电子邮箱
    @Getter
    @Setter
    @ApiModelProperty(value = "手机号码",dataType = "bigint",required = true)
    private Long phone;      //手机号码
    @Getter
    @Setter
    @ApiModelProperty(value = "企业名称",dataType = "string",required = true)
    private String enterprise;  //企业名称
    @Getter
    @Setter
    @ApiModelProperty(value = "统一社会信用代码",dataType = "string",required = true)
    private String creditCode;  //统一社会信用代码
    @Getter
    @Setter
    @ApiModelProperty(value = "系统分配的 AccessKeyID",dataType = "string",required = true)
    private String accessKeyId; //系统分配的 AccessKeyID
    @Getter
    @Setter
    @ApiModelProperty(value = "系统分配的 AccessKeySecret",dataType = "string",required = true)
    private String accessKeySecret;     //系统分配的 AccessKeySecret
    @Getter
    @Setter
    @ApiModelProperty(value = "请求访问状态（0-禁用，1-启用）",dataType = "tinyint",required = true)
    private Byte accessStatus;        //请求访问状态（0-禁用，1-启用）
    @Getter
    @Setter
    @ApiModelProperty(value = "创建者（超级管理员帐号）",dataType = "string",required = true)
    private String creator;     //创建者（超级管理员帐号）
    @Getter
    @Setter
    @ApiModelProperty(value = "创建时间",dataType = "string",required = true)
    private String createTime;  //创建时间
    @Getter
    @Setter
    @ApiModelProperty(value = "修改者（超级管理员帐号）",dataType = "string")
    private String modifier;    //修改者（超级管理员帐号）
    @Getter
    @Setter
    @ApiModelProperty(value = "修改时间",dataType = "string")
    private String modifyTime;      //修改时间

}
