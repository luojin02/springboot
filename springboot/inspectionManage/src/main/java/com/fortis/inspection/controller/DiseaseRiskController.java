package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.diseaseRisk.DiseaseDiseaseUd;
import com.fortis.inspection.entity.diseaseRisk.DiseaseGenderRisk;
import com.fortis.inspection.entity.diseaseRisk.DiseaseGenderRiskUd;
import com.fortis.inspection.entity.diseaseRisk.DiseaseRisk;
import com.fortis.inspection.model.diseaseRisk.DiseaseGenderRiskParam;
import com.fortis.inspection.model.diseaseRisk.DiseaseGengerRiskVo;
import com.fortis.inspection.model.diseaseRisk.DiseaseRiskParam;
import com.fortis.inspection.model.diseaseRisk.DiseaseRiskVo;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.DiseaseRiskService;
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
@RequestMapping("diseaseRisk")
@Api(description = "疾病风险管理")
@CrossOrigin
public class DiseaseRiskController {

    private Logger logger = LoggerFactory.getLogger(DiseaseRiskController.class);

    @Autowired
    private DiseaseRiskService diseaseRiskService;

    /* 疾病风险 */
    @PostMapping("diseaseRiskList")
    @ApiOperation(value = "分页查询疾病风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DiseaseRiskVo>> queryDiseaseRiskList(@Validated @RequestBody DiseaseRiskParam param){
        PageInfo<DiseaseRiskVo> pageInfo = diseaseRiskService.queryDiseaseRiskList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDiseaseRisk")
    @ApiOperation(value = "根据ID查询疾病风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DiseaseRiskVo> getDiseaseRiskById(@ApiParam(name = "diseaseRiskId", value = "疾病风险ID", required = true) @RequestParam Integer diseaseRiskId){
        DiseaseRiskVo diseaseRisk = diseaseRiskService.getDiseaseRiskById(diseaseRiskId);
        return ResultData.success(diseaseRisk);
    }

    @PostMapping("addDiseaseRisk")
    @ApiOperation(value = "新增疾病风险")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDiseaseRisk(@Validated @RequestBody DiseaseRisk diseaseRisk){
        diseaseRiskService.addDiseaseRisk(diseaseRisk);
        return ResultData.success();
    }

    @PostMapping("updateDiseaseRisk")
    @ApiOperation(value = "更新疾病风险")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDiseaseRisk(@Validated @RequestBody DiseaseDiseaseUd diseaseDiseaseUd){
        diseaseRiskService.updateDiseaseRisk(diseaseDiseaseUd);
        return ResultData.success();
    }

    @PostMapping("deleteDiseaseRisk")
    @ApiOperation(value = "删除某个疾病风险")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDiseaseRisk(@ApiParam(name = "diseaseRiskId", value = "疾病风险ID", required = true) @RequestParam Integer diseaseRiskId){
        diseaseRiskService.deleteDiseaseRisk(diseaseRiskId);
        return ResultData.success();
    }

    /* 疾病性别风险 */
    @PostMapping("diseaseGenderRiskList")
    @ApiOperation(value = "分页查询疾病性别风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DiseaseGengerRiskVo>> queryDiseaseGenderRiskList(@Validated @RequestBody DiseaseGenderRiskParam param){
        PageInfo<DiseaseGengerRiskVo> pageInfo = diseaseRiskService.queryDiseaseGenderRiskList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDiseaseGenderRisk")
    @ApiOperation(value = "根据ID查询疾病性别风险")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DiseaseGengerRiskVo> getDiseaseGenderRiskById(@ApiParam(name = "diseaseId", value = "疾病ID", required = true) @RequestParam Integer diseaseId,
                                                              @ApiParam(name = "gender", value = "性别（1-男，2-女）", required = true) @RequestParam Integer gender){
        DiseaseGengerRiskVo diseaseGengerRisk = diseaseRiskService.getDiseaseGenderRiskById(diseaseId,gender);
        return ResultData.success(diseaseGengerRisk);
    }

    @PostMapping("addDiseaseGenderRisk")
    @ApiOperation(value = "新增疾病性别风险")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDiseaseGenderRisk(@Validated @RequestBody DiseaseGenderRisk diseaseGenderRisk){
        diseaseRiskService.addDiseaseGenderRisk(diseaseGenderRisk);
        return ResultData.success();
    }

    @PostMapping("updateDiseaseGenderRisk")
    @ApiOperation(value = "更新疾病性别风险")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDiseaseGenderRisk(@Validated @RequestBody DiseaseGenderRiskUd diseaseGenderRisk){
        diseaseRiskService.updateDiseaseGenderRisk(diseaseGenderRisk);
        return ResultData.success();
    }

    @PostMapping("deleteDiseaseGenderRisk")
    @ApiOperation(value = "删除某个疾病性别风险")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDiseaseGenderRisk(@ApiParam(name = "diseaseId", value = "疾病ID", required = true) @RequestParam Integer diseaseId,
                                                      @ApiParam(name = "gender", value = "性别（1-男，2-女）", required = true) @RequestParam Integer gender){
        diseaseRiskService.deleteDiseaseGenderRisk(diseaseId,gender);
        return ResultData.success();
    }


}
