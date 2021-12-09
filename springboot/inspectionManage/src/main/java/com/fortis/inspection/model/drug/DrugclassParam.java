package com.fortis.inspection.model.drug;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询药品分类参数")
public class DrugclassParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -8743438131594616940L;

    @ApiModelProperty("药品分类名称")
    @Getter
    @Setter
    private String drugclassName;

    @ApiModelProperty(value = "药品分类级别")
    @Getter
    @Setter
    private Integer drugclassLevel;

}
