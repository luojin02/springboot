package com.fortis.inspection.model.diseaseSym;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询疾病参数")
public class DiseaseParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -9095317745942485513L;

    @ApiModelProperty("疾病名称")
    @Getter
    @Setter
    private String diseaseName;

}
