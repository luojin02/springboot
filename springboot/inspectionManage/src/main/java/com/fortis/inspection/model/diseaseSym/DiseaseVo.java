package com.fortis.inspection.model.diseaseSym;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("疾病返回")
public class DiseaseVo implements Serializable {
    private static final long serialVersionUID = -4906786515002880720L;

    @ApiModelProperty("疾病编号")
    @Getter
    @Setter
    private Integer diseaseId;

    @ApiModelProperty("执行标准（0：ICD-10，1：微问诊平台）")
    @Getter
    @Setter
    private Integer normType;

    @ApiModelProperty("疾病名称")
    @Getter
    @Setter
    private String diseaseName;

    @ApiModelProperty("疾病编码")
    @Getter
    @Setter
    private String diseaseCode;

    @ApiModelProperty("是否慢性病（0-否，1-是）")
    @Getter
    @Setter
    private Integer isChronic;

    @ApiModelProperty("适用性别（0-不限，1-男性，2-女性）")
    @Getter
    @Setter
    private Integer applyGender;

    @ApiModelProperty("疾病描述")
    @Getter
    @Setter
    private String diseaseDesc;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;


}
