package com.fortis.inspection.model.drugBaseMsg;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("剂型返回")
public class FormVo implements Serializable {
    private static final long serialVersionUID = -5229214591832170150L;

    @ApiModelProperty("剂型编号")
    @Getter
    @Setter
    private Integer formId;

    @ApiModelProperty("父剂型编号")
    @Getter
    @Setter
    private Integer supFormId;

    @ApiModelProperty("剂型")
    @Getter
    @Setter
    private String form;

    @ApiModelProperty("剂型级别")
    @Getter
    @Setter
    private Integer formLevel;

    @ApiModelProperty("主要剂型标示量类型（1-重量（如固体制剂），2-效价（如生物制品或抗生素制剂），3-含量（如液体制剂），4-装量（如粉末制剂））")
    @Getter
    @Setter
    private Integer formType;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;


}
