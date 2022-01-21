package com.fortis.inspection.entity.diseaseSym;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增疾病实体")
public class DiseaseUd implements Serializable {
    private static final long serialVersionUID = 6084849486965971144L;

    @ApiModelProperty(value = "疾病编号",dataType = "int",required = true)
    @NotBlank(message = "diseaseId 不能为空")
    @Getter
    @Setter
    private Integer diseaseId;

    @ApiModelProperty(value = "执行标准（0：ICD-10，1：微问诊平台）",dataType = "int",required = true)
    @NotBlank(message = "normType 不能为空")
    @Getter
    @Setter
    private Integer normType;

    @ApiModelProperty(value = "疾病名称",dataType = "string",required = true)
    @NotBlank(message = "diseaseName 不能为空")
    @Getter
    @Setter
    private String diseaseName;

    @ApiModelProperty(value = "疾病编码",dataType = "string")
    @Getter
    @Setter
    private String diseaseCode;

    @ApiModelProperty(value = "是否慢性病（0-否，1-是）",dataType = "int",required = true)
    @NotBlank(message = "isChronic 不能为空")
    @Getter
    @Setter
    private Integer isChronic;

    @ApiModelProperty(value = "适用性别（0-不限，1-男性，2-女性）",dataType = "int",required = true)
    @NotBlank(message = "applyGender 不能为空")
    @Getter
    @Setter
    private Integer applyGender;

    @ApiModelProperty(value = "疾病描述",dataType = "string")
    @Getter
    @Setter
    private String diseaseDesc;

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;
}
