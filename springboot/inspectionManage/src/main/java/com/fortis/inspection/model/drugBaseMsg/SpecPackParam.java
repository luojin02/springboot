package com.fortis.inspection.model.drugBaseMsg;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询规格包装参数")
public class SpecPackParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -4451934256717759064L;

    @ApiModelProperty(value = "规格（或剂量）")
    @Getter
    @Setter
    private Integer spec;

}
