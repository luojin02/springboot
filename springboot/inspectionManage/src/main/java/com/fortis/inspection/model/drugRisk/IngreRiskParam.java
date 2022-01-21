package com.fortis.inspection.model.drugRisk;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询成分冲突风险参数")
public class IngreRiskParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -7660119228902635358L;

    @ApiModelProperty("药品成分名称1")
    @Getter
    @Setter
    private String ingredient1;

    @ApiModelProperty("药品成分名称2")
    @Getter
    @Setter
    private String ingredient2;

    @ApiModelProperty(value = "风险等级（0-无风险，1-低风险：慎用，2-中风险：忌用，3-高风险：禁用）")
    @Getter
    @Setter
    private Integer riskLevel;

}
