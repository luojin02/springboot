package com.fortis.inspection.model.drug;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("成分返回")
public class IngredientVo implements Serializable {
    private static final long serialVersionUID = 8745833649650123593L;

    @ApiModelProperty("成分编号")
    @Getter
    @Setter
    private Integer ingredientId;

    @ApiModelProperty("成分名称")
    @Getter
    @Setter
    private String ingredient;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;

}
