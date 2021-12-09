package com.fortis.inspection.entity.drug;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新药品实体")
public class DrugUd implements Serializable {
    private static final long serialVersionUID = -2575519559864892825L;

    @ApiModelProperty(value = "药品编号",dataType = "int",required = true)
    @NotBlank(message = "drugId 不能为空")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty(value = "通用名称",dataType = "int",required = true)
    @NotBlank(message = "commonName 不能为空")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty(value = "不良反应",dataType = "string")
    @Getter
    @Setter
    private String sideEffect;

    @ApiModelProperty(value = "禁忌",dataType = "string")
    @Getter
    @Setter
    private String taboo;

    @ApiModelProperty(value = "药品OTC类型（10-OTC，11-甲类OTC，12-乙类OTC，20-处方药）",dataType = "int",required = true)
    @NotBlank(message = "otcType 不能为空")
    @Getter
    @Setter
    private Integer otcType;

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;



}
