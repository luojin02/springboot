package com.fortis.inspection.entity.drugBaseMsg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增批准文号实体")
public class DrugAppr implements Serializable {
    private static final long serialVersionUID = 7217547205015243831L;

    @ApiModelProperty(value = "药品编号",dataType = "int",required = true)
    @NotBlank(message = "drugId 不能为空")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty(value = "批准文号",dataType = "string",required = true)
    @NotBlank(message = "apprNo 不能为空")
    @Getter
    @Setter
    private String apprNo;

    @ApiModelProperty(value = "批准日期",dataType = "string")
    @Getter
    @Setter
    private String apprDate;

    @ApiModelProperty(value = "商品名称",dataType = "string")
    @Getter
    @Setter
    private String tradeName;

    @ApiModelProperty(value = "生产企业",dataType = "string")
    @Getter
    @Setter
    private String manufacturer;

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
