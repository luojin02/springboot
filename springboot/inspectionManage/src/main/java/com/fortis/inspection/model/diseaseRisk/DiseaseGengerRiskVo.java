package com.fortis.inspection.model.diseaseRisk;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("疾病性别风险返回")
public class DiseaseGengerRiskVo implements Serializable {
    private static final long serialVersionUID = 4543796561096313577L;

    @ApiModelProperty("疾病编号")
    @Getter
    @Setter
    private Integer diseaseId;

    @ApiModelProperty("性别（1-男，2-女）")
    @Getter
    @Setter
    private Integer gender;

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
