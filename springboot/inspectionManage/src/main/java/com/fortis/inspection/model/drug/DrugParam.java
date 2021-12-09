package com.fortis.inspection.model.drug;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询药品参数")
public class DrugParam extends PageParam implements Serializable {
    private static final long serialVersionUID = -8743438131594616940L;

    @ApiModelProperty("通用名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty(value = "药品OTC类型（10-OTC，11-甲类OTC，12-乙类OTC，20-处方药）")
    @Getter
    @Setter
    private Integer otcType;

}
