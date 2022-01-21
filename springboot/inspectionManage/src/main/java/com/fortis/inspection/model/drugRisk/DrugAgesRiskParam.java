package com.fortis.inspection.model.drugRisk;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询药品年龄段风险参数")
public class DrugAgesRiskParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -8445067066367049976L;

    @ApiModelProperty("药品通用名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty("年龄段")
    @Getter
    @Setter
    private String agesName;

    @ApiModelProperty(value = "风险等级（0-无风险，1-低风险：慎用，2-中风险：忌用，3-高风险：禁用）")
    @Getter
    @Setter
    private Integer riskLevel;

}
