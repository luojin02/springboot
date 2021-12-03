package com.fortis.inspection.model.drugBaseMsg;


import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询剂型参数")
public class FormParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 7772784920830685337L;

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
}
