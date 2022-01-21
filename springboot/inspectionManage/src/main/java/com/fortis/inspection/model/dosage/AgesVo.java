package com.fortis.inspection.model.dosage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("年龄段返回")
public class AgesVo implements Serializable {
    private static final long serialVersionUID = 8369252625357849494L;

    @ApiModelProperty("年龄段编号")
    @Getter
    @Setter
    private Integer agesId;

    @ApiModelProperty("年龄段")
    @Getter
    @Setter
    private String agesName;

    @ApiModelProperty("年龄段分类编号")
    @Getter
    @Setter
    private Integer agesclassId;

    @ApiModelProperty("年龄段分类名称")
    @Getter
    @Setter
    private String agesclassName;

    @ApiModelProperty("最小月龄（包含，下限：0.0）")
    @Getter
    @Setter
    private Float minMonthAge;

    @ApiModelProperty("最大月龄（不含，上限：1440.0）")
    @Getter
    @Setter
    private Float maxMonthAge;

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
