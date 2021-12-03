package com.fortis.inspection.model.drugBaseMsg;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("标签返回")
public class LabelVo implements Serializable {
    private static final long serialVersionUID = -5229214591832170150L;

    @ApiModelProperty("标签编号")
    @Getter
    @Setter
    private Integer labelId;

    @ApiModelProperty("标签分类编号")
    @Getter
    @Setter
    private Integer labelclassId;

    @ApiModelProperty("标签分类名称")
    @Getter
    @Setter
    private String labelclassName;

    @ApiModelProperty("标签名称")
    @Getter
    @Setter
    private String labelName;

    @ApiModelProperty("标签描述")
    @Getter
    @Setter
    private String labelDesc;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;


}
