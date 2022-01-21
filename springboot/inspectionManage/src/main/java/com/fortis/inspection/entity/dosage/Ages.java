package com.fortis.inspection.entity.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增年龄段实体")
public class Ages implements Serializable {
    private static final long serialVersionUID = 5838723141572032292L;

    @ApiModelProperty(value = "年龄段分类编号",dataType = "int",required = true)
    @NotBlank(message = "agesclassId 不能为空")
    @Getter
    @Setter
    private Integer agesclassId;

    @ApiModelProperty(value = "年龄段名称",dataType = "string",required = true)
    @NotBlank(message = "agesName 不能为空")
    @Getter
    @Setter
    private String agesName;

    @ApiModelProperty(value = "最小月龄（包含，下限：0.0）",dataType = "float",required = true)
    @NotBlank(message = "minMonthAge 不能为空")
    @Getter
    @Setter
    private Float minMonthAge;

    @ApiModelProperty(value = "最大月龄（不含，上限：1440.0）",dataType = "float",required = true)
    @NotBlank(message = "maxMonthAge 不能为空")
    @Getter
    @Setter
    private Float maxMonthAge;

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
