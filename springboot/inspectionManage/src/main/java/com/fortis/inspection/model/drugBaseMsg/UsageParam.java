package com.fortis.inspection.model.drugBaseMsg;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询用法参数")
public class UsageParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -4451934256717759064L;

    @ApiModelProperty("用法")
    @Getter
    @Setter
    private String usage;

    @ApiModelProperty(value = "用法级别")
    @Getter
    @Setter
    private Integer usageLevel;

}
