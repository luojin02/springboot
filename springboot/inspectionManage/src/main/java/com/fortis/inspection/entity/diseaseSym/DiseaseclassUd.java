package com.fortis.inspection.entity.diseaseSym;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增疾病分类实体")
public class DiseaseclassUd implements Serializable {
    private static final long serialVersionUID = -3271947462625265127L;

    @ApiModelProperty(value = "疾病分类编号",dataType = "int",required = true)
    @NotBlank(message = "diseaseclassId 不能为空")
    @Getter
    @Setter
    private Integer diseaseclassId;

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

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;
}
