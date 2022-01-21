package com.fortis.inspection.model.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("频次返回")
public class FreqVo implements Serializable {
    private static final long serialVersionUI = 4833307570530176122L;

    @ApiModelProperty("频次编号")
    @Getter
    @Setter
    private Integer freqId;

    @ApiModelProperty("频次名（如：一日）")
    @Getter
    @Setter
    private String freqName;

    @ApiModelProperty("频次值")
    @Getter
    @Setter
    private String freqValue;

    @ApiModelProperty("频次值单位（如：次）")
    @Getter
    @Setter
    private String freqValueUnit;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;
}
