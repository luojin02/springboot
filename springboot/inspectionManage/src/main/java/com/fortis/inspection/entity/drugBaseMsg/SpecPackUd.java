package com.fortis.inspection.entity.drugBaseMsg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel("更新包装实体")
public class SpecPackUd implements Serializable {
    private static final long serialVersionUID = -7896208085281824633L;

    @ApiModelProperty(value = "包装编号",dataType = "int",required = true)
    @NotBlank(message = "packId 不能为空")
    @Getter
    @Setter
    private Integer packId;

    @ApiModelProperty(value = "规格编号",dataType = "int",required = true)
    @NotBlank(message = "specId 不能为空")
    @Getter
    @Setter
    private Integer specId;

    @ApiModelProperty(value = "小包装数量",dataType = "int",required = true)
    @NotBlank(message = "minPackNum 不能为空")
    @Getter
    @Setter
    private Integer minPackNum;

    @ApiModelProperty(value = "小包装单位",dataType = "string",required = true)
    @NotBlank(message = "minPackUnit 不能为空")
    @Getter
    @Setter
    private String minPackUnit;

    @ApiModelProperty(value = "大包装数量",dataType = "int",required = true)
    @NotBlank(message = "maxPackNum 不能为空")
    @Getter
    @Setter
    private Integer maxPackNum;

    @ApiModelProperty(value = "大包装单位",dataType = "string",required = true)
    @NotBlank(message = "maxPackUnit 不能为空")
    @Getter
    @Setter
    private String maxPackUnit;

    @ApiModelProperty(value= "整包装规格",dataType = "string",required = true)
    @NotBlank(message = "totalSpec 不能为空")
    @Getter
    @Setter
    private String totalSpec;

    @ApiModelProperty(value = "整包装生产日期",dataType = "string")
    @Getter
    @Setter
    private String mfgDate;

    @ApiModelProperty(value = "整包装有效期（有效天数）",dataType = "int")
    @Getter
    @Setter
    private Integer validityDays;

    @ApiModelProperty(value = "整包装生产批号",dataType = "string")
    @Getter
    @Setter
    private String batchNo;

    @ApiModelProperty(value = "整包装条码",dataType = "string")
    @Getter
    @Setter
    private String barcode;

    @ApiModelProperty(value = "修改者（系统帐号）",dataType = "string",required = true)
    @NotBlank(message = "modifier 不能为空")
    @Getter
    @Setter
    private String modifier;

}
