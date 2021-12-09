package com.fortis.inspection.model.drugBaseMsg;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询批准文号规格参数")
public class ApprSpecParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 7772784920830685337L;

    @ApiModelProperty(value = "规格（或剂量）")
    @Getter
    @Setter
    private Integer spec;

    @ApiModelProperty("批准文号")
    @Getter
    @Setter
    private String apprNo;

    @ApiModelProperty("剂型")
    @Getter
    @Setter
    private String form;

    @ApiModelProperty("用法")
    @Getter
    @Setter
    private String usage;
}
