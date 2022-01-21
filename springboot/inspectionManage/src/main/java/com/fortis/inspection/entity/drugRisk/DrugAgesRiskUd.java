package com.fortis.inspection.entity.drugRisk;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新药品年龄段风险实体")
public class DrugAgesRiskUd implements Serializable {
    private static final long serialVersionUID = 4493653861716126986L;

    @ApiModelProperty(value = "药品编号",dataType = "int",required = true)
    @NotBlank(message = "drugId 不能为空")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty(value = "年龄段编号",dataType = "int",required = true)
    @NotBlank(message = "agesId 不能为空")
    @Getter
    @Setter
    private Integer agesId;

    @ApiModelProperty(value = "风险等级（0-无风险，1-低风险：慎用，2-中风险：忌用，3-高风险：禁用）",dataType = "int",required = true)
    @NotBlank(message = "riskLevel 不能为空")
    @Getter
    @Setter
    private Integer riskLevel;

    @ApiModelProperty(value = "风险说明",dataType = "string",required = true)
    @NotBlank(message = "riskDesc 不能为空")
    @Getter
    @Setter
    private String riskDesc;

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;
}
