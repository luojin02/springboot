package com.fortis.inspection.model.drugBaseMsg;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("规格返回")
public class ApprSpecVo implements Serializable {
    private static final long serialVersionUID = 7734946532435211729L;

    @ApiModelProperty("规格编号")
    @Getter
    @Setter
    private Integer specId;

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

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;

    @ApiModelProperty("批准文号")
    @Getter
    @Setter
    private String apprNo;

    @ApiModelProperty("剂型")
    @Getter
    @Setter
    private String form;

    @ApiModelProperty("用法")
    @Getter
    @Setter
    private String usage;

}
