package com.fortis.inspection.model.drugBaseMsg;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("用法返回")
public class UsageVo implements Serializable {
    private static final long serialVersionUID = -4451934256717759064L;

    @ApiModelProperty("用法编号")
    @Getter
    @Setter
    private Integer usageId;

    @ApiModelProperty("父用法编号")
    @Getter
    @Setter
    private Integer supUsageId;

    @ApiModelProperty("用法")
    @Getter
    @Setter
    private String usage;

    @ApiModelProperty("用法级别")
    @Getter
    @Setter
    private Integer usageLevel;


    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;

}
