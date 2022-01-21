package com.fortis.inspection.entity.test;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 李许
 */
@ApiModel("导出盘点库存实体")
@Setter
@Getter
public class ExportStock {


  @ApiModelProperty("拆零转换率")
  private Float tinyUnitRate;

  @ApiModelProperty("药品名称")
  private String goodName;

  @ApiModelProperty("规格")
  private String standard;

  @ApiModelProperty("生产厂家")
  private String makerName;

  @ApiModelProperty("供应商")
  private String companyName;

  @ApiModelProperty("基础单位")
  private String baseUnit;

  @ApiModelProperty("拆零单位")
  private String tinyUnit;

  @ApiModelProperty("进货价格")
  private Float price;

  @ApiModelProperty("基础单位当前数量")
  private Float currentBaseCount;

  @ApiModelProperty("拆零单位当前数量")
  private Float currentTinyCount;



}
