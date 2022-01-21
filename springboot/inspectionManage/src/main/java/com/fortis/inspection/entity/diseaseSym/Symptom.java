package com.fortis.inspection.entity.diseaseSym;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增症状实体")
public class Symptom implements Serializable {
    private static final long serialVersionUID = -7901352419869847285L;

    @ApiModelProperty(value = "症状名称",dataType = "string",required = true)
    @NotBlank(message = "symptomName 不能为空")
    @Getter
    @Setter
    private String symptomName;

    @ApiModelProperty(value = "症状描述",dataType = "string")
    @Getter
    @Setter
    private String symptomDesc;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;
}
