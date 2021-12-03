package com.fortis.inspection.entity.drugBaseMsg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新标签分类实体")
public class LabelClassUd implements Serializable {
    private static final long serialVersionUID = -5229214591832170150L;

    @ApiModelProperty(value = "标签分类编号",dataType = "int",required = true)
    @NotBlank(message = "labelclassId 不能为空")
    @Getter
    @Setter
    private Integer labelclassId;

    @ApiModelProperty(value = "标签父分类编号",dataType = "int")
    @Getter
    @Setter
    private Integer supLabelclassId;

    @ApiModelProperty(value = "标签分类名称",dataType = "string",required = true)
    @NotBlank(message = "labelclassName 不能为空")
    @Getter
    @Setter
    private String labelclassName;

    @ApiModelProperty(value = "标签分类级别",dataType = "int",required = true)
    @NotBlank(message = "labelclassLevel 不能为空")
    @Getter
    @Setter
    private Integer labelclassLevel;

    @ApiModelProperty(value = "备注",dataType = "string")
    @Getter
    @Setter
    private String notes;

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "int",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;
}
