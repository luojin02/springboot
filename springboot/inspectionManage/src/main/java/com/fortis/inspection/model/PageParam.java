package com.fortis.inspection.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@ApiModel("分页请求参数")
public class PageParam {

    @ApiModelProperty(value = "当前页码", required = true)
    @NotNull(message = "当前页码不能为空")
    @Min(1)
    @Getter
    @Setter
    private Integer pageNum;

    @ApiModelProperty(value = "一页的数据量", required = true)
    @NotNull(message = "一页的数据量不能为空")
    @Min(1)
    @Getter
    @Setter
    private Integer pageSize;

}
