package com.fortis.inspection.entity.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增药品疾病体重段用量实体")
public class DosageDiseaWeight implements Serializable {
    private static final long serialVersionUID = -2082601073184665975L;

    @ApiModelProperty(value = "药品编号",dataType = "int",required = true)
    @NotBlank(message = "drugId 不能为空")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty(value="规格编号",dataType = "int",required = true)
    @NotBlank(message = "specId 不能为空")
    @Getter
    @Setter
    private Integer specId;

    @ApiModelProperty(value="疾病编号",dataType = "int",required = true)
    @NotBlank(message = "diseaseId 不能为空")
    @Getter
    @Setter
    private Integer diseaseId;

    @ApiModelProperty(value="频次编号",dataType = "int",required = true)
    @NotBlank(message = "freqId 不能为空")
    @Getter
    @Setter
    private Float freqId;

    @ApiModelProperty(value="最小体重（kg）",dataType = "float",required = true)
    @NotBlank(message = "minWeight 不能为空")
    @Getter
    @Setter
    private Float minWeight;

    @ApiModelProperty(value="最大体重（kg）",dataType = "float",required = true)
    @NotBlank(message = "maxWeight 不能为空")
    @Getter
    @Setter
    private Float maxWeight;

    @ApiModelProperty(value="每次常规剂量",dataType = "float",required = true)
    @NotBlank(message = "ordDose 不能为空")
    @Getter
    @Setter
    private Float ordDose;

    @ApiModelProperty(value="每次最小剂量",dataType = "float",required = true)
    @NotBlank(message = "minDose 不能为空")
    @Getter
    @Setter
    private Float minDose;

    @ApiModelProperty(value="每次最大剂量",dataType = "float",required = true)
    @NotBlank(message = "maxDose 不能为空")
    @Getter
    @Setter
    private Float maxDose;

    @ApiModelProperty(value="剂量单位",dataType = "string",required = true)
    @NotBlank(message = "doseUnit 不能为空")
    @Getter
    @Setter
    private String doseUnit;

    @ApiModelProperty(value="用药天数限制",dataType = "int",required = true)
    @NotBlank(message = "limitDays 不能为空")
    @Getter
    @Setter
    private Integer limitDays;

    @ApiModelProperty(value="创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;

}
