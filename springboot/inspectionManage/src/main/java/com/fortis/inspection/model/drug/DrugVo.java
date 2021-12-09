package com.fortis.inspection.model.drug;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("药品返回")
public class DrugVo implements Serializable {
    private static final long serialVersionUID = -8743438131594616940L;

    @ApiModelProperty("药品编号")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty("通用名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty("不良反应")
    @Getter
    @Setter
    private String sideEffect;

    @ApiModelProperty("禁忌")
    @Getter
    @Setter
    private String taboo;

    @ApiModelProperty("药品OTC类型（10-OTC，11-甲类OTC，12-乙类OTC，20-处方药）")
    @Getter
    @Setter
    private Integer otcType;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;


}
