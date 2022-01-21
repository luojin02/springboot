package com.fortis.inspection.entity.drugDisease;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增药品适应症实体")
public class DrugIndication implements Serializable {
    private static final long serialVersionUID = 8942831832906942315L;

    @ApiModelProperty(value = "药品编号",dataType = "int",required = true)
    @NotBlank(message = "drugId 不能为空")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty(value = "适应证类型（1-疾病，2-症状）",dataType = "int",required = true)
    @NotBlank(message = "indicationType 不能为空")
    @Getter
    @Setter
    private Integer indicationType;

    @ApiModelProperty(value = "适应证编号（疾病或症状编号）",dataType = "int",required = true)
    @NotBlank(message = "indicationId 不能为空")
    @Getter
    @Setter
    private Integer indicationId;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;
}
