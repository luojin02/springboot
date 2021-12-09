package com.fortis.inspection.model.drug;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("药品分类返回")
public class DrugclassVo implements Serializable {
    private static final long serialVersionUID = 337372817464066870L;

    @ApiModelProperty("药品分类编号")
    @Getter
    @Setter
    private Integer drugclassId;

    @ApiModelProperty("药品父分类编号")
    @Getter
    @Setter
    private Integer supDrugclassId;

    @ApiModelProperty("药品分类名称")
    @Getter
    @Setter
    private String drugclassName;

    @ApiModelProperty("药品分类级别")
    @Getter
    @Setter
    private Integer drugclassLevel;

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
