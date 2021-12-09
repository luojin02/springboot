package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.drugBaseMsg.*;
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
    public ResultData<PageInfo<LabelclassVo>> queryLabelClassList(@Validated @RequestBody LabelclassParam labelClass){
        PageInfo<LabelclassVo> pageInfo = drugBaseMsgService.queryLabelClassList(labelClass);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getLabelClass")
    @ApiOperation(value = "根据ID查询标签分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<LabelclassVo> getLableClassById(@ApiParam(name = "labelclassId", value = "标签分类ID", required = true) @RequestParam Integer labelclassId){
        LabelclassVo lable = drugBaseMsgService.getLabelClassById(labelclassId);
        return ResultData.success(lable);
    }

    @PostMapping("addLabelClass")
    @ApiOperation(value = "新增标签分类")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addLableClass(@Validated @RequestBody Labelclass labelClass){
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
    public Result updateLabelClass(@Validated @RequestBody LabelclassUd labelClass){
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

    @PostMapping("getForm")
    @ApiOperation(value = "根据ID查询剂型")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<FormVo> getFormById(@ApiParam(name = "formId", value = "剂型ID", required = true) @RequestParam Integer formId){
        FormVo lable = drugBaseMsgService.getFormById(formId);
        return ResultData.success(lable);
    }

    @PostMapping("addForm")
    @ApiOperation(value = "新增剂型")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addForm(@Validated @RequestBody Form form){
        drugBaseMsgService.addForm(form);
        return Result.success();
    }

    @PostMapping("deleteForm")
    @ApiOperation(value = "删除某个剂型")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteForm(@ApiParam(name = "formId", value = "剂型ID", required = true) @RequestParam Integer formId){
        drugBaseMsgService.deleteForm(formId);
        return Result.success();
    }

    @PostMapping("updateForm")
    @ApiOperation(value = "更新某个剂型")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateForm(@Validated @RequestBody FormUd form){
        drugBaseMsgService.updateForm(form);
        return Result.success();
    }

    /** 批准文号 **/
    @PostMapping("drugApprList")
    @ApiOperation(value = "分页查询药品批准文号")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DrugApprVo>> queryDrugApprList(@Validated @RequestBody DrugApprParam param){
        PageInfo<DrugApprVo> pageInfo = drugBaseMsgService.queryDrugApprList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDrugAppr")
    @ApiOperation(value = "根据ID查询批准文号")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DrugApprVo> getDrugApprById(@ApiParam(name = "apprId", value = "批准文号ID", required = true) @RequestParam Integer apprId){
        DrugApprVo appr = drugBaseMsgService.getDrugApprById(apprId);
        return ResultData.success(appr);
    }

    @PostMapping("addDrugAppr")
    @ApiOperation(value = "新增批准文号")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addDrugAppr(@Validated @RequestBody DrugAppr appr){
        drugBaseMsgService.addDrugAppr(appr);
        return Result.success();
    }

    @PostMapping("deleteDrugAppr")
    @ApiOperation(value = "删除某个批准文号")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteDrugAppr(@ApiParam(name = "apprId", value = "批准文号ID", required = true) @RequestParam Integer apprId){
        drugBaseMsgService.deleteDrugAppr(apprId);
        return Result.success();
    }

    @PostMapping("updateDrugAppr")
    @ApiOperation(value = "更新某个批准文号")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateDrugAppr(@Validated @RequestBody DrugApprUd appr){
        drugBaseMsgService.updateDrugAppr(appr);
        return Result.success();
    }

    /** 用法 **/
    @PostMapping("usageList")
    @ApiOperation(value = "分页查询用法")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<UsageVo>> queryUsageList(@Validated @RequestBody UsageParam param){
        PageInfo<UsageVo> pageInfo = drugBaseMsgService.queryUsageList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getUsage")
    @ApiOperation(value = "根据ID查询用法")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<UsageVo> getUsageById(@ApiParam(name = "usageId", value = "用法ID", required = true) @RequestParam Integer usageId){
        UsageVo usage = drugBaseMsgService.getUsageById(usageId);
        return ResultData.success(usage);
    }

    @PostMapping("addUsage")
    @ApiOperation(value = "新增用法")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addUsage(@Validated @RequestBody Usage usage){
        drugBaseMsgService.addUsage(usage);
        return Result.success();
    }

    @PostMapping("deleteUsage")
    @ApiOperation(value = "删除用法")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteUsage(@ApiParam(name = "usageId", value = "用法ID", required = true) @RequestParam Integer usageId){
        drugBaseMsgService.deleteUsage(usageId);
        return Result.success();
    }

    @PostMapping("updateUsage")
    @ApiOperation(value = "更新某个用法")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateUsage(@Validated @RequestBody UsageUd usage){
        drugBaseMsgService.updateUsage(usage);
        return Result.success();
    }

    /** 批准文号规格 **/
    @PostMapping("apprSpecList")
    @ApiOperation(value = "分页查询规格")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<ApprSpecVo>> queryApprSpecList(@Validated @RequestBody ApprSpecParam param){
        PageInfo<ApprSpecVo> pageInfo = drugBaseMsgService.queryApprSpecList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getApprSpec")
    @ApiOperation(value = "根据ID查询规格")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<ApprSpecVo> getApprSpecById(@ApiParam(name = "specId", value = "规格ID", required = true) @RequestParam Integer specId){
        ApprSpecVo apprSpec = drugBaseMsgService.getApprSpecById(specId);
        return ResultData.success(apprSpec);
    }

    @PostMapping("addApprSpec")
    @ApiOperation(value = "新增规格")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addApprSpec(@Validated @RequestBody ApprSpec apprSpec){
        drugBaseMsgService.addApprSpec(apprSpec);
        return Result.success();
    }

    @PostMapping("deleteApprSpec")
    @ApiOperation(value = "删除规格")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteApprSpec(@ApiParam(name = "specId", value = "规格ID", required = true) @RequestParam Integer specId){
        drugBaseMsgService.deleteApprSpec(specId);
        return Result.success();
    }

    @PostMapping("updateApprSpec")
    @ApiOperation(value = "更新某个规格")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateApprSpec(@Validated @RequestBody ApprSpecUd apprSpec){
        drugBaseMsgService.updateApprSpec(apprSpec);
        return Result.success();
    }

    /** 包装 **/
    @PostMapping("specPackList")
    @ApiOperation(value = "分页查询包装")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<SpecPackVo>> querySpecPackList(@Validated @RequestBody SpecPackParam param){
        PageInfo<SpecPackVo> pageInfo = drugBaseMsgService.querySpecPackList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getSpecPack")
    @ApiOperation(value = "根据ID查询包装")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<SpecPackVo> getSpecPackById(@ApiParam(name = "packId", value = "包装ID", required = true) @RequestParam Integer packId){
        SpecPackVo pack = drugBaseMsgService.getSpecPackById(packId);
        return ResultData.success(pack);
    }

    @PostMapping("addSpecPack")
    @ApiOperation(value = "新增包装")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addSpecPack(@Validated @RequestBody SpecPack pack){
        drugBaseMsgService.addSpecPack(pack);
        return Result.success();
    }

    @PostMapping("deleteSpecPack")
    @ApiOperation(value = "删除包装")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteSpecPack(@ApiParam(name = "packId", value = "包装ID", required = true) @RequestParam Integer packId){
        drugBaseMsgService.deleteSpecPack(packId);
        return Result.success();
    }

    @PostMapping("updateSpecPack")
    @ApiOperation(value = "更新某个包装")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateSpecPack(@Validated @RequestBody SpecPackUd pack){
        drugBaseMsgService.updateSpecPack(pack);
        return Result.success();
    }



}
