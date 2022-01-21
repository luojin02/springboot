package com.fortis.inspection.entity.drugBaseMsg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增规格实体")
public class ApprSpec implements Serializable {
    private static final long serialVersionUID = 6681560165956073062L;

    @ApiModelProperty(value = "批准文号编号",dataType = "int",required = true)
    @NotBlank(message = "apprId 不能为空")
    @Getter
    @Setter
    private Integer apprId;

    @ApiModelProperty(value = "规格（或剂量）",dataType = "int",required = true)
    @NotBlank(message = "spec 不能为空")
    @Getter
    @Setter
    private Integer spec;

    @ApiModelProperty(value = "规格单位（或剂量单位）",dataType = "string",required = true)
    @NotBlank(message = "specUnit 不能为空")
    @Getter
    @Setter
    private String specUnit;

    @ApiModelProperty(value = "剂型编号",dataType = "int",required = true)
    @NotBlank(message = "formId 不能为空")
    @Getter
    @Setter
    private Integer formId;

    @ApiModelProperty(value = "用法编号",dataType = "int",required = true)
    @NotBlank(message = "usageId 不能为空")
    @Getter
    @Setter
    private Integer usageId;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;

}
