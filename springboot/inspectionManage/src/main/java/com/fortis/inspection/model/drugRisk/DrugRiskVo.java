package com.fortis.inspection.model.drugRisk;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("药品风险返回")
public class DrugRiskVo implements Serializable {
    private static final long serialVersionUID = 3266982708585667823L;

    @ApiModelProperty("药品风险编号")
    @Getter
    @Setter
    private Integer drugRiskId;

    @ApiModelProperty("药品编号")
    @Getter
    @Setter
    private Integer drugId;

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

    @ApiModelProperty("药品通用名称")
    @Getter
    @Setter
    private String commonName;


}
