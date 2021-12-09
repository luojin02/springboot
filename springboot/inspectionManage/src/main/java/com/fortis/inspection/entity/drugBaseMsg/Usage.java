package com.fortis.inspection.entity.drugBaseMsg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增用法实体")
public class Usage implements Serializable {
    private static final long serialVersionUID = 2737496622400850627L;

    @ApiModelProperty(value = "父用法编号",dataType = "int")
    @NotBlank(message = "supUsageId 不能为空")
    @Getter
    @Setter
    private Integer supUsageId;

    @ApiModelProperty(value = "用法",dataType = "string",required = true)
    @NotBlank(message = "usage 不能为空")
    @Getter
    @Setter
    private String usage;

    @ApiModelProperty(value = "用法级别",dataType = "int",required = true)
    @NotBlank(message = "usageLevel 不能为空")
    @Getter
    @Setter
    private Integer usageLevel;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;

}
