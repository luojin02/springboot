package com.fortis.inspection.entity.drugBaseMsg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新标签实体")
public class LabelUd implements Serializable {
    private static final long serialVersionUID = -5229214591832170150L;

    @ApiModelProperty(value = "标签编号",dataType = "int",required = true)
    @NotBlank(message = "labelId 不能为空")
    @Getter
    @Setter
    private Integer labelId;

    @ApiModelProperty(value = "标签分类编号",dataType = "int",required = true)
    @NotBlank(message = "labelclassId 不能为空")
    @Getter
    @Setter
    private Integer labelclassId;

    @ApiModelProperty(value = "标签名称",dataType = "string",required = true)
    @NotBlank(message = "labelName 不能为空")
    @Getter
    @Setter
    private String labelName;

    @ApiModelProperty(value = "标签描述",dataType = "string")
    @Getter
    @Setter
    private String labelDesc;

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;
}
