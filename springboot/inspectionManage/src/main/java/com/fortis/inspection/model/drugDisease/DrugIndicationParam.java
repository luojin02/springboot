package com.fortis.inspection.model.drugDisease;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询药品适应症参数")
public class DrugIndicationParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 6961311282496615079L;

    @ApiModelProperty("药品名称")
    @Getter
    @Setter
    private String commonName;

    @ApiModelProperty("适应症名称")
    @Getter
    @Setter
    private String indicationName;

}
