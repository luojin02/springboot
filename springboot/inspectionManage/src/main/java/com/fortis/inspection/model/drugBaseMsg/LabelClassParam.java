package com.fortis.inspection.model.drugBaseMsg;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询标签分类参数")
public class LabelClassParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -7812818892712594309L;

    @ApiModelProperty("标签分类名称")
    @Getter
    @Setter
    private String labelclassName;

    @ApiModelProperty("标签分类级别")
    @Getter
    @Setter
    private Integer labelclassLevel;

}
