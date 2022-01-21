package com.fortis.inspection.model.drugRisk;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("药品成分风险返回")
public class IngreRiskVo implements Serializable {
    private static final long serialVersionUID = -7205819669493412865L;

    @ApiModelProperty("药品成分编号1")
    @Getter
    @Setter
    private Integer ingredientId1;

    @ApiModelProperty("药品成分编号2")
    @Getter
    @Setter
    private Integer ingredientId2;

    @ApiModelProperty("成分之间是否冲突（0-否，1-是）")
    @Getter
    @Setter
    private Integer isConflict;

    @ApiModelProperty("风险等级（0-无风险，1-低风险：慎用，2-中风险：忌用，3-高风险：禁用）")
    @Getter
    @Setter
    private Integer riskLevel;

    @ApiModelProperty("风险说明")
    @Getter
    @Setter
    private String riskDesc;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;

    @ApiModelProperty("药品成分名称1")
    @Getter
    @Setter
    private String ingredient1;

    @ApiModelProperty("药品成分名称2")
    @Getter
    @Setter
    private String ingredient2;


}
