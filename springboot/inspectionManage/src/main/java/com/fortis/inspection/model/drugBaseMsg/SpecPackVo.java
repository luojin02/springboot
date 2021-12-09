package com.fortis.inspection.model.drugBaseMsg;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("规格包装返回")
public class SpecPackVo implements Serializable {
    private static final long serialVersionUID = -4451934256717759064L;

    @ApiModelProperty("包装编号")
    @Getter
    @Setter
    private Integer packId;

    @ApiModelProperty("含量规格编号")
    @Getter
    @Setter
    private Integer specId;

    @ApiModelProperty("规格")
    @Getter
    @Setter
    private Integer spec;

    @ApiModelProperty("小包装数量")
    @Getter
    @Setter
    private Integer minPackNum;

    @ApiModelProperty("小包装单位")
    @Getter
    @Setter
    private String minPackUnit;

    @ApiModelProperty("大包装数量")
    @Getter
    @Setter
    private Integer maxPackNum;

    @ApiModelProperty("大包装单位")
    @Getter
    @Setter
    private String maxPackUnit;

    @ApiModelProperty("整包装规格")
    @Getter
    @Setter
    private String totalSpec;

    @ApiModelProperty("整包装生产日期")
    @Getter
    @Setter
    private String mfgDate;

    @ApiModelProperty("整包装有效期（有效天数）")
    @Getter
    @Setter
    private Integer validityDays;

    @ApiModelProperty("整包装生产批号")
    @Getter
    @Setter
    private String batchNo;

    @ApiModelProperty("整包装条码")
    @Getter
    @Setter
    private String barcode;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;

}
