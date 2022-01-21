package com.fortis.inspection.model.diseaseSym;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询疾病分类参数")
public class DiseaseclassParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -2929986656001531094L;

    @ApiModelProperty("疾病分类名称")
    @Getter
    @Setter
    private String diseaseclassName;

    @ApiModelProperty("疾病分类级别")
    @Getter
    @Setter
    private String diseaseclassLevel;
}
