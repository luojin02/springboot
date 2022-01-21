package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.drugDisease.DrugDiseaRisk;
import com.fortis.inspection.entity.drugDisease.DrugDiseaRiskUd;
import com.fortis.inspection.entity.drugDisease.DrugIndication;
import com.fortis.inspection.model.drugDisease.DrugDiseaRiskParam;
import com.fortis.inspection.model.drugDisease.DrugDiseaRiskVo;
import com.fortis.inspection.model.drugDisease.DrugIndicationParam;
import com.fortis.inspection.model.drugDisease.DrugIndicationVo;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.DrugDiseaRiskService;
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
@RequestMapping("drugDiseaRisk")
@Api(description = "药品疾病风险管理")
@CrossOrigin
public class DrugDiseaseRiskController {

    private Logger logger = LoggerFactory.getLogger(DrugDiseaseRiskController.class);

    @Autowired
    private DrugDiseaRiskService drugDiseaRiskService;

    /** 药品疾病风险 **/
    @PostMapping("drugDiseaRiskList")
    @ApiOperation(value = "分页查询药品疾病风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DrugDiseaRiskVo>> queryDrugDiseaRiskList(@Validated @RequestBody DrugDiseaRiskParam param){
        PageInfo<DrugDiseaRiskVo> pageInfo = drugDiseaRiskService.queryDrugDiseaRiskList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDrugDiseaRisk")
    @ApiOperation(value = "根据ID查询药品疾病风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DrugDiseaRiskVo> getDrugDiseaRiskById(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                          @ApiParam(name = "diseaseId", value = "疾病编号", required = true) @RequestParam Integer diseaseId){
        DrugDiseaRiskVo drugDiseaRisk = drugDiseaRiskService.getDrugDiseaRiskById(drugId,diseaseId);
        return ResultData.success(drugDiseaRisk);
    }

    @PostMapping("addDrugDiseaRisk")
    @ApiOperation(value = "新增药品疾病风险")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDrugDiseaRisk(@Validated @RequestBody DrugDiseaRisk drugDiseaRisk){
        drugDiseaRiskService.addDrugDiseaRisk(drugDiseaRisk);
        return ResultData.success();
    }

    @PostMapping("updateDrugDiseaRisk")
    @ApiOperation(value = "更新药品疾病风险")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDrugDiseaRisk(@Validated @RequestBody DrugDiseaRiskUd drugDiseaRiskUd){
        drugDiseaRiskService.updateDrugDiseaRisk(drugDiseaRiskUd);
        return ResultData.success();
    }

    @PostMapping("deleteDrugDiseaRisk")
    @ApiOperation(value = "删除某个药品疾病风险")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDrugDiseaRisk(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                  @ApiParam(name = "diseaseId", value = "疾病编号", required = true) @RequestParam Integer diseaseId){
        drugDiseaRiskService.deleteDrugDiseaRisk(drugId,diseaseId);
        return ResultData.success();
    }

    /** 药品适应症管理 **/
    @PostMapping("drugIndicationList")
    @ApiOperation(value = "分页查询药品适应症")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DrugIndicationVo>> queryDrugIndicationList(@Validated @RequestBody DrugIndicationParam param){
        PageInfo<DrugIndicationVo> pageInfo = drugDiseaRiskService.queryDrugIndicationList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDrugIndication")
    @ApiOperation(value = "根据ID查询药品适应症")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DrugIndicationVo> getDrugIndicationById(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                            @ApiParam(name = "indicationType", value = "适应证类型（1-疾病，2-症状）", required = true) @RequestParam Integer indicationType,
                                                            @ApiParam(name = "indicationId", value = "适应证编号（疾病或症状编号）", required = true) @RequestParam Integer indicationId){
        DrugIndicationVo drugIndication = drugDiseaRiskService.getDrugIndicationById(drugId,indicationType,indicationId);
        return ResultData.success(drugIndication);
    }

    @PostMapping("addDrugIndication")
    @ApiOperation(value = "新增药品适应症")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDrugIndication(@Validated @RequestBody DrugIndication drugIndication){
        drugDiseaRiskService.addDrugIndication(drugIndication);
        return ResultData.success();
    }

    @PostMapping("deleteDrugIndication")
    @ApiOperation(value = "删除某个药品适应症")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDrugIndication(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                   @ApiParam(name = "indicationType", value = "适应证类型（1-疾病，2-症状）", required = true) @RequestParam Integer indicationType,
                                                   @ApiParam(name = "indicationId", value = "适应证编号（疾病或症状编号）", required = true) @RequestParam Integer indicationId){
        drugDiseaRiskService.deleteDrugIndication(drugId,indicationType,indicationId);
        return ResultData.success();
    }

}
