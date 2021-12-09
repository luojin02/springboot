package com.fortis.inspection.model.drugBaseMsg;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询药品批准文号参数")
public class DrugApprParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 7772784920830685337L;

    @ApiModelProperty("批准文号")
    @Getter
    @Setter
    private String apprNo;

    @ApiModelProperty("药品通用名称")
    @Getter
    @Setter
    private String commonName;


}
