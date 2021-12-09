package com.fortis.inspection.entity.drugBaseMsg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新剂型实体")
public class FormUd implements Serializable {
    private static final long serialVersionUID = 7217547205015243831L;

    @ApiModelProperty(value = "剂型编号",dataType = "int",required = true)
    @NotBlank(message = "formId 不能为空")
    @Getter
    @Setter
    private Integer formId;

    @ApiModelProperty(value = "父剂型编号",dataType = "int")
    @NotBlank(message = "supFormId 不能为空")
    @Getter
    @Setter
    private Integer supFormId;

    @ApiModelProperty(value = "剂型",dataType = "string",required = true)
    @NotBlank(message = "form 不能为空")
    @Getter
    @Setter
    private String form;

    @ApiModelProperty(value = "剂型级别",dataType = "int",required = true)
    @NotBlank(message = "formLevel 不能为空")
    @Getter
    @Setter
    private String formLevel;

    @ApiModelProperty(value = "主要剂型标示量类型",dataType = "int",required = true)
    @NotBlank(message = "formType 不能为空")
    @Getter
    @Setter
    private String formType;

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;



}
