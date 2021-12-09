package com.fortis.inspection.entity.drug;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新成分实体")
public class IngredientUd implements Serializable {
    private static final long serialVersionUID = 7754365205058010355L;

    @ApiModelProperty(value = "成分编号",dataType = "int",required = true)
    @NotBlank(message = "ingredientId 不能为空")
    @Getter
    @Setter
    private Integer ingredientId;

    @ApiModelProperty(value = "成分名称",dataType = "string",required = true)
    @NotBlank(message = "ingredient 不能为空")
    @Getter
    @Setter
    private String ingredient;

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;


}
