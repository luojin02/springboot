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

    @ApiModelProperty("批准文号编号")
    @Getter
    @Setter
    private Integer apprId;

    @ApiModelProperty("规格（或剂量）")
    @Getter
    @Setter
    private Integer spec;

    @ApiModelProperty("规格单位（或剂量单位）")
    @Getter
    @Setter
    private String specUnit;

    @ApiModelProperty("剂型编号")
    @Getter
    @Setter
    private Integer formId;

    @ApiModelProperty("用法编号")
    @Getter
    @Setter
    private Integer usageId;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

}
