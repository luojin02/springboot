package com.fortis.inspection.entity.drugBaseMsg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("新增标签分类实体")
public class LabelClass implements Serializable {
    private static final long serialVersionUID = -5229214591832170150L;

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

    @ApiModelProperty(value = "创建者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "creator 不能为空")
    @Getter
    @Setter
    private String creator;



}
