package com.fortis.inspection.entity.drug;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新药品成分实体")
public class DrugIngrdtUd implements Serializable {
    private static final long serialVersionUID = 7576132999946374498L;

    @ApiModelProperty(value = "药品成分编号",dataType = "int",required = true)
    @NotBlank(message = "drugIngrdtId 不能为空")
    @Getter
    @Setter
    private Integer drugIngrdtId;

    @ApiModelProperty(value = "药品编号",dataType = "int",required = true)
    @NotBlank(message = "drugId 不能为空")
    @Getter
    @Setter
    private Integer drugId;

    @ApiModelProperty(value = "成分编号",dataType = "int",required = true)
    @NotBlank(message = "ingredientId 不能为空")
    @Getter
    @Setter
    private Integer ingredientId;

    @ApiModelProperty(value = "成分标示量",dataType = "int")
    @Getter
    @Setter
    private Integer num;

    @ApiModelProperty(value = "成分标示量单位",dataType = "string")
    @Getter
    @Setter
    private String unit;




}
