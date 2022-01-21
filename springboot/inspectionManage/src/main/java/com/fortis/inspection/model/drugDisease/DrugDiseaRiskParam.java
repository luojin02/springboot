package com.fortis.inspection.model.drugDisease;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询药品疾病风险参数")
public class DrugDiseaRiskParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 7903182252250413417L;

    @ApiModelProperty("药品名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty("疾病名称")
    @Getter
    @Setter
    private String diseaseName;

    @ApiModelProperty(value = "风险等级（0-无风险，1-低风险：慎用，2-中风险：忌用，3-高风险：禁用）")
    @Getter
    @Setter
    private Integer riskLevel;

}
