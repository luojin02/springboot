package com.fortis.inspection.model.dosage;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询年龄段用量参数")
public class DosageDiseaAgesParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 9090572994493650828L;

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
