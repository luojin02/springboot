package com.fortis.inspection.model.drugDisease;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("药品适应症返回")
public class DrugIndicationVo implements Serializable {
    private static final long serialVersionUID = -4916325633269332156L;

    @ApiModelProperty("药品编号")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty("适应证类型（1-疾病，2-症状）")
    @Getter
    @Setter
    private Integer indicationType;

    @ApiModelProperty("适应证编号（疾病或症状编号）")
    @Getter
    @Setter
    private Integer indicationId;

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

    @ApiModelProperty("适应症名称")
    @Getter
    @Setter
    private String indicationName;


}
