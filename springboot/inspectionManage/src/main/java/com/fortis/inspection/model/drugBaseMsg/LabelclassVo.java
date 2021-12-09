package com.fortis.inspection.model.drugBaseMsg;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("标签分类返回")
public class LabelclassVo implements Serializable {
    private static final long serialVersionUID = -5229214591832170150L;

    @ApiModelProperty("标签分类编号")
    @Getter
    @Setter
    private Integer labelclassId;

    @ApiModelProperty("标签父分类编号")
    @Getter
    @Setter
    private Integer supLabelclassId;

    @ApiModelProperty("标签分类名称")
    @Getter
    @Setter
    private String labelclassName;

    @ApiModelProperty("标签分类级别")
    @Getter
    @Setter
    private Integer labelclassLevel;

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
