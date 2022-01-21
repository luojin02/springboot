package com.fortis.inspection.model.diseaseSym;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("疾病分类返回")
public class DiseaseclassVo implements Serializable {
    private static final long serialVersionUID = -2476041618213945582L;

    @ApiModelProperty("疾病分类编号")
    @Getter
    @Setter
    private Integer diseaseclassId;

    @ApiModelProperty("疾病父分类编号")
    @Getter
    @Setter
    private Integer supDiseaseclassId;

    @ApiModelProperty("疾病分类名称")
    @Getter
    @Setter
    private String diseaseclassName;

    @ApiModelProperty("疾病分类级别")
    @Getter
    @Setter
    private Integer diseaseclassLevel;

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
