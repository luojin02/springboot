package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.diseaseSym.*;
import com.fortis.inspection.model.diseaseSym.*;
import com.fortis.inspection.result.Result;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.DiseaseSymService;
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
@RequestMapping("dsym")
@Api(description = "疾病症状管理")
@CrossOrigin
public class DiseaseSymController {

    private Logger logger = LoggerFactory.getLogger(DiseaseSymController.class);

    @Autowired
    private DiseaseSymService diseaseSymService;

    /**  症状 **/
    @PostMapping("symptomList")
    @ApiOperation(value = "分页查询症状")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<SymptomVo>> queryFreqList(@Validated @RequestBody SymptomParam param){
        PageInfo<SymptomVo> pageInfo = diseaseSymService.querySymptomList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getSymptom")
    @ApiOperation(value = "根据ID查询症状")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<SymptomVo> getSymptomById(@ApiParam(name = "symptomId", value = "症状ID", required = true) @RequestParam Integer symptomId){
        SymptomVo symptom = diseaseSymService.getSymptomById(symptomId);
        return ResultData.success(symptom);
    }

    @PostMapping("addSymptom")
    @ApiOperation(value = "新增症状")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addSymptom(@Validated @RequestBody Symptom symptom){
        diseaseSymService.addSymptom(symptom);
        return ResultData.success();
    }

    @PostMapping("updateSymptom")
    @ApiOperation(value = "更新某个症状")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateSymptom(@Validated @RequestBody SymptomUd symptom){
        diseaseSymService.updateSymptom(symptom);
        return ResultData.success();
    }

    @PostMapping("deleteSymptom")
    @ApiOperation(value = "删除某个症状")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteSymptom(@ApiParam(name = "symptomId", value = "症状ID", required = true) @RequestParam Integer symptomId){
        diseaseSymService.deleteSymptom(symptomId);
        return ResultData.success();
    }

    /**  疾病 **/
    @PostMapping("diseaseList")
    @ApiOperation(value = "分页查询疾病")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DiseaseVo>> queryDiseaseList(@Validated @RequestBody DiseaseParam param){
        PageInfo<DiseaseVo> pageInfo = diseaseSymService.queryDiseaseList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDisease")
    @ApiOperation(value = "根据ID查询疾病")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DiseaseVo> getDiseaseById(@ApiParam(name = "diseaseId", value = "疾病ID", required = true) @RequestParam Integer diseaseId){
        DiseaseVo disease = diseaseSymService.getDiseaseById(diseaseId);
        return ResultData.success(disease);
    }

    @PostMapping("addDisease")
    @ApiOperation(value = "新增疾病")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDisease(@Validated @RequestBody Disease disease){
        diseaseSymService.addDisease(disease);
        return ResultData.success();
    }

    @PostMapping("updateDisease")
    @ApiOperation(value = "更新某个疾病")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateAgesclass(@Validated @RequestBody DiseaseUd disease){
        diseaseSymService.updateDisease(disease);
        return ResultData.success();
    }

    @PostMapping("deleteDisease")
    @ApiOperation(value = "删除某个疾病")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDisease(@ApiParam(name = "diseaseId", value = "疾病ID", required = true) @RequestParam Integer diseaseId){
        diseaseSymService.deleteDisease(diseaseId);
        return ResultData.success();
    }

    //todo 添加症状


    /**  疾病分类 **/
    @PostMapping("diseaseclassList")
    @ApiOperation(value = "分页查询疾病分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DiseaseclassVo>> queryDiseaseclassList(@Validated @RequestBody DiseaseclassParam param){
        PageInfo<DiseaseclassVo> pageInfo = diseaseSymService.queryDiseaseclassList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDiseaseclass")
    @ApiOperation(value = "根据ID查询疾病分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DiseaseclassVo> getDiseaseclassById(@ApiParam(name = "diseaseclassId", value = "疾病分类ID", required = true) @RequestParam Integer diseaseclassId){
        DiseaseclassVo diseaseclass = diseaseSymService.getDiseaseclassById(diseaseclassId);
        return ResultData.success(diseaseclass);
    }

    @PostMapping("addDiseaseclass")
    @ApiOperation(value = "新增疾病分类")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDiseaseclass(@Validated @RequestBody Diseaseclass diseaseclass){
        diseaseSymService.addDiseaseclass(diseaseclass);
        return ResultData.success();
    }

    @PostMapping("updateDiseaseclass")
    @ApiOperation(value = "更新某个疾病分类")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDiseaseclass(@Validated @RequestBody DiseaseclassUd diseaseclass){
        diseaseSymService.updateDiseaseclass(diseaseclass);
        return ResultData.success();
    }

    @PostMapping("deleteDiseaseclass")
    @ApiOperation(value = "删除某个疾病分类")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDiseaseclass(@ApiParam(name = "diseaseclassId", value = "疾病分类ID", required = true) @RequestParam Integer diseaseclassId){
        diseaseSymService.deleteDiseaseclass(diseaseclassId);
        return ResultData.success();
    }

    //todo 添加疾病

}
