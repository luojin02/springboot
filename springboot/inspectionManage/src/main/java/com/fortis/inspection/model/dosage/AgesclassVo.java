package com.fortis.inspection.model.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("年龄段分类返回")
public class AgesclassVo implements Serializable {
    private static final long serialVersionUID = 3591061634475906915L;

    @ApiModelProperty("年龄段分类编号")
    @Getter
    @Setter
    private Integer agesclassId;

    @ApiModelProperty("年龄段父分类编号")
    @Getter
    @Setter
    private Integer supAgesclassId;

    @ApiModelProperty("年龄段分类名称")
    @Getter
    @Setter
    private String agesclassName;

    @ApiModelProperty("年龄段分类级别")
    @Getter
    @Setter
    private Integer agesclassLevel;

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
