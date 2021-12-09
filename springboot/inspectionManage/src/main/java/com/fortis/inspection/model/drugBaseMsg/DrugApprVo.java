package com.fortis.inspection.model.drugBaseMsg;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("药品批准文号返回")
public class DrugApprVo implements Serializable {
    private static final long serialVersionUID = 796196503929005824L;

    @ApiModelProperty("批准文号编号")
    @Getter
    @Setter
    private Integer apprId;

    @ApiModelProperty("批准文号")
    @Getter
    @Setter
    private String apprNo;

    @ApiModelProperty("药品编号")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty("药品通用名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty("批准日期")
    @Getter
    @Setter
    private String apprDate;

    @ApiModelProperty("商品名称")
    @Getter
    @Setter
    private String tradeName;

    @ApiModelProperty("生产企业")
    @Getter
    @Setter
    private String manufacturer;

    @ApiModelProperty("备注")
    @Getter
    @Setter
    private String notes;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;

}
