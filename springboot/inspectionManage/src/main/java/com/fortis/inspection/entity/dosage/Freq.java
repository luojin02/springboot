package com.fortis.inspection.entity.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增频次实体")
public class Freq implements Serializable {
    private static final long serialVersionUID = 4605394584489793291L;

    @ApiModelProperty(value = "频次名",dataType = "string",required = true)
    @NotBlank(message = "freqName 不能为空")
    @Getter
    @Setter
    private String freqName;

    @ApiModelProperty(value = "频次值",dataType = "int",required = true)
    @NotBlank(message = "freqValue 不能为空")
    @Getter
    @Setter
    private Integer freqValue;

    @ApiModelProperty(value = "频次值单位（如：次）",dataType = "string",required = true)
    @NotBlank(message = "freqValueUnit 不能为空")
    @Getter
    @Setter
    private String freqValueUnit;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;
}
