package com.fortis.inspection.model.dosage;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询频次参数")
public class FreqParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 8665746571547836134L;

    @ApiModelProperty("频次名（如：一日）")
    @Getter
    @Setter
    private String freqName;

    @ApiModelProperty(value = "频次值")
    @Getter
    @Setter
    private Integer freqValue;
}
