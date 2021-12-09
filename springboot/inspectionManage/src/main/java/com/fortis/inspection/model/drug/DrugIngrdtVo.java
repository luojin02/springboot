package com.fortis.inspection.model.drug;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("药品成分返回")
public class DrugIngrdtVo implements Serializable {
    private static final long serialVersionUID = -5233231212753272400L;

    @ApiModelProperty("药品成分编号")
    @Getter
    @Setter
    private Integer drugIngrdtId;

    @ApiModelProperty("药品编号")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty("成分编号")
    @Getter
    @Setter
    private Integer ingredientId;

    @ApiModelProperty("成分标示量")
    @Getter
    @Setter
    private Integer num;

    @ApiModelProperty("成分标示量单位")
    @Getter
    @Setter
    private String unit;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;

    @ApiModelProperty("药品通用名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty("成分名称")
    @Getter
    @Setter
    private String ingredient;
}
