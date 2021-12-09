package com.fortis.inspection.entity.drug;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增药品分类实体")
public class Drugclass implements Serializable {
    private static final long serialVersionUID = -4472655479055805549L;

    @ApiModelProperty(value = "药品父分类编号",dataType = "int")
    @Getter
    @Setter
    private Integer supDrugclassId;

    @ApiModelProperty(value = "药品分类名称",dataType = "string",required = true)
    @NotBlank(message = "drugclassName 不能为空")
    @Getter
    @Setter
    private String drugclassName;

    @ApiModelProperty(value = "药品分类级别",dataType = "int",required = true)
    @NotBlank(message = "drugclassLevel 不能为空")
    @Getter
    @Setter
    private Integer drugclassLevel;

    @ApiModelProperty(value = "备注",dataType = "string")
    @Getter
    @Setter
    private String notes;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;



}
