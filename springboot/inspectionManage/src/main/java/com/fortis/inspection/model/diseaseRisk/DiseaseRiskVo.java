package com.fortis.inspection.model.diseaseRisk;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("疾病风险返回")
public class DiseaseRiskVo implements Serializable {
    private static final long serialVersionUID = -6293244118422728506L;

    @ApiModelProperty("疾病风险编号")
    @Getter
    @Setter
    private Integer diseaseRiskId;

    @ApiModelProperty("药品编号")
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

    @ApiModelProperty("疾病名称")
    @Getter
    @Setter
    private String diseaseName;


}
