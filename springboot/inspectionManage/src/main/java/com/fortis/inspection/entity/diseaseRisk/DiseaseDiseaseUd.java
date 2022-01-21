package com.fortis.inspection.entity.diseaseRisk;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新疾病风险实体")
public class DiseaseDiseaseUd implements Serializable {
    private static final long serialVersionUID = 7612581202078089280L;

    @ApiModelProperty(value = "疾病风险编号",dataType = "int",required = true)
    @NotBlank(message = "diseaseRiskId 不能为空")
    @Getter
    @Setter
    private Integer diseaseRiskId;

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

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;
}
