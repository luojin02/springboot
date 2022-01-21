package com.fortis.inspection.entity.drugDisease;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增药品疾病风险实体")
public class DrugDiseaRisk implements Serializable {
    private static final long serialVersionUID = 7930162934859766679L;

    @ApiModelProperty(value = "药品编号",dataType = "int",required = true)
    @NotBlank(message = "drugId 不能为空")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty(value = "疾病编号",dataType = "int",required = true)
    @NotBlank(message = "diseaseId 不能为空")
    @Getter
    @Setter
    private Integer diseaseId;

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

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;
}
