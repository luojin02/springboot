package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.drugRisk.*;
import com.fortis.inspection.model.drugRisk.*;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.DrugRiskService;
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
@RequestMapping("drugRisk")
@Api(description = "药品风险管理")
@CrossOrigin
public class DrugRiskController {

    private Logger logger = LoggerFactory.getLogger(DrugRiskController.class);

    @Autowired
    private DrugRiskService drugRiskService;

    /**  药品风险 **/
    @PostMapping("drugRiskList")
    @ApiOperation(value = "分页查询药品风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DrugRiskVo>> queryDrugRiskList(@Validated @RequestBody DrugRiskParam param){
        PageInfo<DrugRiskVo> pageInfo = drugRiskService.queryDrugRiskList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDrugRisk")
    @ApiOperation(value = "根据ID查询药品风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DrugRiskVo> getDrugRiskById(@ApiParam(name = "drugRiskId", value = "药品风险ID", required = true) @RequestParam Integer drugRiskId){
        DrugRiskVo drug = drugRiskService.getDrugRiskById(drugRiskId);
        return ResultData.success(drug);
    }

    @PostMapping("addDrugRisk")
    @ApiOperation(value = "新增药品风险")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDrugRisk(@Validated @RequestBody DrugRisk drugRisk){
        drugRiskService.addDrugRisk(drugRisk);
        return ResultData.success();
    }

    @PostMapping("updateDrugRisk")
    @ApiOperation(value = "更新药品风险")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDrugRisk(@Validated @RequestBody DrugRiskUd drugRiskUd){
        drugRiskService.updateDrugRisk(drugRiskUd);
        return ResultData.success();
    }

    @PostMapping("deleteDrugRisk")
    @ApiOperation(value = "删除某个药品风险")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDrugRisk(@ApiParam(name = "drugRiskId", value = "药品风险ID", required = true) @RequestParam Integer drugRiskId){
        drugRiskService.deleteDrugRisk(drugRiskId);
        return ResultData.success();
    }

    /**  药品年龄段风险 **/
    @PostMapping("drugAgesRiskList")
    @ApiOperation(value = "分页查询药品年龄段风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DrugAgesRiskVo>> queryDrugAgesRiskList(@Validated @RequestBody DrugAgesRiskParam param){
        PageInfo<DrugAgesRiskVo> pageInfo = drugRiskService.queryDrugAgesRiskList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDrugAgesRisk")
    @ApiOperation(value = "根据ID查询药品年龄段风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DrugAgesRiskVo> getDrugAgesRiskById(@ApiParam(name = "drugId", value = "药品ID", required = true) @RequestParam Integer drugId,
                                                      @ApiParam(name = "agesId", value = "年龄段ID", required = true) @RequestParam Integer agesId){
        DrugAgesRiskVo drugAgesRisk = drugRiskService.getDrugAgesRiskById(drugId,agesId);
        return ResultData.success(drugAgesRisk);
    }

    @PostMapping("addDrugAgesRisk")
    @ApiOperation(value = "新增药品年龄段风险")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDrugAgesRisk(@Validated @RequestBody DrugAgesRisk drugAgesRisk){
        drugRiskService.addDrugAgesRisk(drugAgesRisk);
        return ResultData.success();
    }

    @PostMapping("updateDrugAgesRisk")
    @ApiOperation(value = "更新药品年龄段风险")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDrugAgesRisk(@Validated @RequestBody DrugAgesRiskUd drugAgesRisk){
        drugRiskService.updateDrugAgesRisk(drugAgesRisk);
        return ResultData.success();
    }

    @PostMapping("deleteDrugAgesRisk")
    @ApiOperation(value = "删除某个药品年龄段风险")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDrugAgesRisk(@ApiParam(name = "drugId", value = "药品ID", required = true) @RequestParam Integer drugId,
                                                 @ApiParam(name = "agesId", value = "年龄段ID", required = true) @RequestParam Integer agesId){
        drugRiskService.deleteDrugAgesRisk(drugId,agesId);
        return ResultData.success();
    }

    /**  成分冲突风险 **/
    @PostMapping("ingreRiskList")
    @ApiOperation(value = "分页查询成分冲突风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<IngreRiskVo>> queryIngreRiskList(@Validated @RequestBody IngreRiskParam param){
        PageInfo<IngreRiskVo> pageInfo = drugRiskService.queryIngreRiskList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getIngreRisk")
    @ApiOperation(value = "根据ID查询成分冲突风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<IngreRiskVo> getIngreRiskById(@ApiParam(name = "ingredientId1", value = "药品成分编号1", required = true) @RequestParam Integer ingredientId1,
                                                          @ApiParam(name = "ingredientId1", value = "药品成分编号2", required = true) @RequestParam Integer ingredientId2){
        IngreRiskVo ingreRiskVo = drugRiskService.getIngreRiskById(ingredientId1,ingredientId2);
        return ResultData.success(ingreRiskVo);
    }

    @PostMapping("addIngreRisk")
    @ApiOperation(value = "新增药品成分冲突风险")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addIngreRisk(@Validated @RequestBody IngreRisk ingreRisk){
        drugRiskService.addIngreRisk(ingreRisk);
        return ResultData.success();
    }

    @PostMapping("updateIngreRisk")
    @ApiOperation(value = "更新药品成分冲突风险")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateIngreRisk(@Validated @RequestBody IngreRiskUd ingreRisk){
        drugRiskService.updateIngreRisk(ingreRisk);
        return ResultData.success();
    }

    @PostMapping("deleteIngreRisk")
    @ApiOperation(value = "删除某个药品成分冲突风险")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteIngreRisk(@ApiParam(name = "ingredientId1", value = "药品成分编号1", required = true) @RequestParam Integer ingredientId1,
                                              @ApiParam(name = "ingredientId2", value = "药品成分编号2", required = true) @RequestParam Integer ingredientId2){
        drugRiskService.deleteIngreRisk(ingredientId1,ingredientId2);
        return ResultData.success();
    }





}
