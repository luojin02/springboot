package com.fortis.inspection.entity.drug;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增成分实体")
public class Ingredient implements Serializable {
    private static final long serialVersionUID = -6576677631647605026L;

    @ApiModelProperty(value = "成分名称",dataType = "string",required = true)
    @NotBlank(message = "ingredient 不能为空")
    @Getter
    @Setter
    private String ingredient;

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;


}
