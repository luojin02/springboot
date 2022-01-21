package com.fortis.inspection.model.dosage;

import com.fortis.inspection.model.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("查询年龄段参数")
public class AgesParam extends PageParam implements Serializable {
    private static final long serialVersionUID = 7012425259315462598L;

    @ApiModelProperty("年龄段名称")
    @Getter
    @Setter
    private String agesName;

}
