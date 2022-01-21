package com.fortis.inspection.entity.diseaseSym;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增疾病分类实体")
public class Diseaseclass implements Serializable {
    private static final long serialVersionUID = 4499892081263279254L;

    @ApiModelProperty(value = "疾病父分类编号",dataType = "int")
    @Getter
    @Setter
    private Integer supDiseaseclassId;

    @ApiModelProperty(value = "疾病分类名称",dataType = "string",required = true)
    @NotBlank(message = "diseaseclassName 不能为空")
    @Getter
    @Setter
    private String diseaseclassName;

    @ApiModelProperty(value = "疾病分类级别",dataType = "int",required = true)
    @NotBlank(message = "diseaseclassLevel 不能为空")
    @Getter
    @Setter
    private Integer diseaseclassLevel;

    @ApiModelProperty(value = "备注",dataType = "string")
    @Getter
    @Setter
    private String notes;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;
}
