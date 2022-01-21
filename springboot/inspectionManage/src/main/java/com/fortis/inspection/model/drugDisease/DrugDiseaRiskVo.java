package com.fortis.inspection.model.drugDisease;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("药品疾病风险返回")
public class DrugDiseaRiskVo implements Serializable {
    private static final long serialVersionUID = -8284360924504094103L;

    @ApiModelProperty("药品编号")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty("疾病编号")
    @Getter
    @Setter
    private Integer diseaseId;

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

    @ApiModelProperty("疾病名称")
    @Getter
    @Setter
    private String diseaseName;


}
