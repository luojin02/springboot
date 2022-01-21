package com.fortis.inspection.model.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("年龄段用量返回")
public class DosageDiseaAgesVo implements Serializable {
    private static final long serialVersionUID = 8369252625357849494L;

    @ApiModelProperty("药品编号")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty("规格编号")
    @Getter
    @Setter
    private Integer specId;

    @ApiModelProperty("疾病编号")
    @Getter
    @Setter
    private Integer diseaseId;

    @ApiModelProperty("年龄段编号（使用人群）")
    @Getter
    @Setter
    private Integer agesId;

    @ApiModelProperty("频次编号")
    @Getter
    @Setter
    private Integer freqId;

    @ApiModelProperty("每次常规剂量")
    @Getter
    @Setter
    private Float ordDose;

    @ApiModelProperty("每次最小剂量")
    @Getter
    @Setter
    private Float minDose;

    @ApiModelProperty("每次最大剂量")
    @Getter
    @Setter
    private Float maxDose;

    @ApiModelProperty("剂量单位")
    @Getter
    @Setter
    private String doseUnit;

    @ApiModelProperty("用药天数限制")
    @Getter
    @Setter
    private Integer limitDays;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;



    @ApiModelProperty("药品名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty("规格")
    @Getter
    @Setter
    private Integer spec;

    @ApiModelProperty("疾病名称")
    @Getter
    @Setter
    private String diseaseName;

    @ApiModelProperty("年龄段名称")
    @Getter
    @Setter
    private String agesName;

    @ApiModelProperty("频次名称")
    @Getter
    @Setter
    private String freqName;
}
