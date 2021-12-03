package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.drugBaseMsg.Label;
import com.fortis.inspection.entity.drugBaseMsg.LabelClass;
import com.fortis.inspection.entity.drugBaseMsg.LabelClassUd;
import com.fortis.inspection.entity.drugBaseMsg.LabelUd;
import com.fortis.inspection.model.drugBaseMsg.*;
import com.fortis.inspection.result.Result;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.DrugBaseMsgService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("drugMsg")
@Api(description = "药品包装规格信息管理")
@CrossOrigin
public class DrugBaseMsgController {

    private Logger logger = LoggerFactory.getLogger(DrugBaseMsgController.class);

    @Autowired
    private DrugBaseMsgService drugBaseMsgService;

    @PostMapping("labelClassList")
    @ApiOperation(value = "分页查询标签分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<LabelClassVo>> queryLabelClassList(@Validated @RequestBody LabelClassParam labelClass){
        PageInfo<LabelClassVo> pageInfo = drugBaseMsgService.queryLabelClassList(labelClass);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getLabelClass")
    @ApiOperation(value = "根据ID查询标签分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<LabelClassVo> getLableClassById(@ApiParam(name = "labelclassId", value = "标签分类ID", required = true) @RequestParam Integer labelclassId){
        LabelClassVo lable = drugBaseMsgService.getLabelClassById(labelclassId);
        return ResultData.success(lable);
    }

    @PostMapping("addLabelClass")
    @ApiOperation(value = "新增标签分类")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addLableClass(@Validated @RequestBody LabelClass labelClass){
        drugBaseMsgService.addLabelClass(labelClass);
        return Result.success();
    }

    @PostMapping("deleteLabelClass")
    @ApiOperation(value = "删除某个标签分类")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteLabelClass(@ApiParam(name = "labelclassId", value = "标签分类ID", required = true) @RequestParam Integer labelclassId){
        drugBaseMsgService.deleteLabelClass(labelclassId);
        return Result.success();
    }

    @PostMapping("updateLabelClass")
    @ApiOperation(value = "更新某个标签分类")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateLabelClass(@Validated @RequestBody LabelClassUd labelClass){
        drugBaseMsgService.updateLabelClass(labelClass);
        return Result.success();
    }

    /** 标签 **/
    @PostMapping("labelList")
    @ApiOperation(value = "分页查询标签")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<LabelVo>> getLabelData(@Validated @RequestBody LabelParam label){
        PageInfo<LabelVo> pageInfo = drugBaseMsgService.queryLabelList(label);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getLabel")
    @ApiOperation(value = "根据ID查询标签")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<LabelVo> getLableById(@ApiParam(name = "labelId", value = "标签ID", required = true) @RequestParam Integer labelId){
        LabelVo lable = drugBaseMsgService.getLabelById(labelId);
        return ResultData.success(lable);
    }

    @PostMapping("addLabel")
    @ApiOperation(value = "新增标签")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addLable(@Validated @RequestBody Label label){
        drugBaseMsgService.addLabel(label);
        return Result.success();
    }

    @PostMapping("deleteLabel")
    @ApiOperation(value = "删除某个标签")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteLabel(@ApiParam(name = "labelId", value = "标签ID", required = true) @RequestParam Integer labelId){
        drugBaseMsgService.deleteLabel(labelId);
        return Result.success();
    }

    @PostMapping("updateLabel")
    @ApiOperation(value = "更新某个标签")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateLabel(@Validated @RequestBody LabelUd label){
        drugBaseMsgService.updateLabe(label);
        return Result.success();
    }

    /** 剂型 **/
    @PostMapping("formList")
    @ApiOperation(value = "分页查询剂型")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<FormVo>> queryFormList(@Validated @RequestBody FormParam param){
        PageInfo<FormVo> pageInfo = drugBaseMsgService.queryFormList(param);
        return ResultData.success(pageInfo);
    }
}
