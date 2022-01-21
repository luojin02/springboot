package com.fortis.inspection.model.dosage;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询药品疾病年龄段体重段用量参数")
public class DosageDiseaAgesWeightParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -1286494913915394946L;

    @ApiModelProperty("药品名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty(value = "规格")
    @Getter
    @Setter
    private Integer spec;

    @ApiModelProperty(value = "疾病名称")
    @Getter
    @Setter
    private String diseaseName;

    @ApiModelProperty(value = "年龄段名称")
    @Getter
    @Setter
    private String agesName;

}
