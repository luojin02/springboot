package com.fortis.inspection.model.diseaseSym;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("症状返回")
public class SymptomVo implements Serializable {
    private static final long serialVersionUID = 7973844058891752179L;

    @ApiModelProperty("症状编号")
    @Getter
    @Setter
    private Integer symptomId;

    @ApiModelProperty("症状名称")
    @Getter
    @Setter
    private String symptomName;

    @ApiModelProperty("症状描述")
    @Getter
    @Setter
    private String symptomDesc;

    @ApiModelProperty("创建者（系统帐号）")
    @Getter
    @Setter
    private String creator;

    @ApiModelProperty("创建时间")
    @Getter
    @Setter
    private String createTime;


}
