package com.fortis.inspection.entity.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增年龄段分类实体")
public class Agesclass implements Serializable {
    private static final long serialVersionUID = -487323548074686436L;

    @ApiModelProperty(value = "年龄段父分类编号",dataType = "int")
    @Getter
    @Setter
    private Integer supAgesclassId;

    @ApiModelProperty(value = "年龄段分类名称",dataType = "string",required = true)
    @NotBlank(message = "agesclassName 不能为空")
    @Getter
    @Setter
    private String agesclassName;

    @ApiModelProperty(value = "年龄段分类级别",dataType = "int",required = true)
    @NotBlank(message = "agesclassLevel 不能为空")
    @Getter
    @Setter
    private Integer agesclassLevel;

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
