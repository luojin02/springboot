package com.fortis.inspection.entity.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增药品疾病年龄段用量实体")
public class DosageDiseaAges implements Serializable {
    private static final long serialVersionUID = 6233017311348722081L;

    @ApiModelProperty(value = "药品编号",dataType = "int",required = true)
    @NotBlank(message = "drugId 不能为空")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty(value = "规格编号",dataType = "int",required = true)
    @NotBlank(message = "specId 不能为空")
    @Getter
    @Setter
    private Integer specId;

    @ApiModelProperty(value = "疾病编号",dataType = "int",required = true)
    @NotBlank(message = "diseaseId 不能为空")
    @Getter
    @Setter
    private Integer diseaseId;

    @ApiModelProperty(value = "年龄段编号",dataType = "int",required = true)
    @NotBlank(message = "agesId 不能为空")
    @Getter
    @Setter
    private Integer agesId;

    @ApiModelProperty(value = "频次编号",dataType = "int",required = true)
    @NotBlank(message = "freqId")
    @Getter
    @Setter
    private Integer freqId;

    @ApiModelProperty(value = "每次常规剂量",dataType = "float",required = true)
    @NotBlank(message = "ordDose")
    @Getter
    @Setter
    private Float ordDose;

    @ApiModelProperty(value = "每次最小剂量",dataType = "float",required = true)
    @NotBlank(message = "minDose")
    @Getter
    @Setter
    private Float minDose;

    @ApiModelProperty(value = "每次最大剂量",dataType = "string",required = true)
    @NotBlank(message = "maxDose")
    @Getter
    @Setter
    private Float maxDose;

    @ApiModelProperty(value = "剂量单位",dataType = "string",required = true)
    @NotBlank(message = "doseUnit")
    @Getter
    @Setter
    private String doseUnit;

    @ApiModelProperty(value = "用药天数限制",dataType = "int",required = true)
    @NotBlank(message = "limitDays")
    @Getter
    @Setter
    private Integer limitDays;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;

}
