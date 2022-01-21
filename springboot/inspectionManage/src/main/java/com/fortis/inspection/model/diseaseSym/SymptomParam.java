package com.fortis.inspection.model.diseaseSym;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询症状参数")
public class SymptomParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 747298652302938620L;

    @ApiModelProperty("症状名")
    @Getter
    @Setter
    private String symptomName;

}
