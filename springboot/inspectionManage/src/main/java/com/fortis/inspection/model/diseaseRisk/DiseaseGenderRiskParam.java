package com.fortis.inspection.model.diseaseRisk;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询疾病性别风险参数")
public class DiseaseGenderRiskParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 5606095520980752429L;

    @ApiModelProperty("疾病名称")
    @Getter
    @Setter
    private String diseaseName;

    @ApiModelProperty(value = "性别（1-男，2-女）")
    @Getter
    @Setter
    private Integer gender;

    @ApiModelProperty(value = "风险等级（0-无风险，1-低风险：慎用，2-中风险：忌用，3-高风险：禁用）")
    @Getter
    @Setter
    private Integer riskLevel;

}
