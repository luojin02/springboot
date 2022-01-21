package com.fortis.inspection.model.dosage;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询年龄段分类参数")
public class AgesclassParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -8600432686378917578L;

    @ApiModelProperty("年龄段分类名称")
    @Getter
    @Setter
    private String agesclassName;

}
