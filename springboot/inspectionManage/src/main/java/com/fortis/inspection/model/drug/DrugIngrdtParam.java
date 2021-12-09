package com.fortis.inspection.model.drug;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询药品成分参数")
public class DrugIngrdtParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -8743438131594616940L;

    @ApiModelProperty("药品通用名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty("成分名称")
    @Getter
    @Setter
    private String ingredient;

}
