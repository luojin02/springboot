package com.fortis.inspection.entity.drugRisk;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新药品成分冲突实体")
public class IngreRiskUd implements Serializable {
    private static final long serialVersionUID = 1315968020587510030L;

    @ApiModelProperty(value = "药品成分编号1",dataType = "int",required = true)
    @NotBlank(message = "ingredientId1 不能为空")
    @Getter
    @Setter
    private Integer ingredientId1;

    @ApiModelProperty(value = "药品成分编号2",dataType = "int",required = true)
    @NotBlank(message = "ingredientId2 不能为空")
    @Getter
    @Setter
    private Integer ingredientId2;

    @ApiModelProperty(value = "成分之间是否冲突（0-否，1-是）",dataType = "int",required = true)
    @NotBlank(message = "isConflict 不能为空")
    @Getter
    @Setter
    private Integer isConflict;

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
