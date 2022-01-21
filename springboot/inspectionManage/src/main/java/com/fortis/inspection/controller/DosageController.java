package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.dosage.*;
import com.fortis.inspection.model.dosage.*;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.DosageService;
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
@RequestMapping("dosage")
@Api(description = "用量管理")
@CrossOrigin
public class DosageController {

    private Logger logger = LoggerFactory.getLogger(DosageController.class);

    @Autowired
    private DosageService dosageService;

    /**  频次  **/
    @PostMapping("freqList")
    @ApiOperation(value = "分页查询频次")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<FreqVo>> queryFreqList(@Validated @RequestBody FreqParam param){
        PageInfo<FreqVo> pageInfo = dosageService.queryFreqList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getFreq")
    @ApiOperation(value = "根据ID查询频次")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<FreqVo> getFreqById(@ApiParam(name = "freqId", value = "频次ID", required = true) @RequestParam Integer freqId){
        FreqVo freq = dosageService.getFreqById(freqId);
        return ResultData.success(freq);
    }

    @PostMapping("addFreq")
    @ApiOperation(value = "新增频次")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addFreq(@Validated @RequestBody Freq freq){
        dosageService.addFreq(freq);
        return ResultData.success();
    }

    @PostMapping("updateFreq")
    @ApiOperation(value = "更新某个频次")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateFreq(@Validated @RequestBody FreqUd freq){
        dosageService.updateFreq(freq);
        return ResultData.success();
    }

    @PostMapping("deleteFreq")
    @ApiOperation(value = "删除某个频次")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteFreq(@ApiParam(name = "freqId", value = "频次ID", required = true) @RequestParam Integer freqId){
        dosageService.deleteFreq(freqId);
        return ResultData.success();
    }

    /**  年龄段分类  **/
    @PostMapping("agesclassList")
    @ApiOperation(value = "分页查询年龄段分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<AgesclassVo>> queryAgesclassList(@Validated @RequestBody AgesclassParam param){
        PageInfo<AgesclassVo> pageInfo = dosageService.queryAgesclassList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getAgesclass")
    @ApiOperation(value = "根据ID查询年龄段分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<AgesclassVo> getAgesclassById(@ApiParam(name = "agesclassId", value = "年龄段分类ID", required = true) @RequestParam Integer agesclassId){
        AgesclassVo agesclass = dosageService.getAgesclassById(agesclassId);
        return ResultData.success(agesclass);
    }

    @PostMapping("addAgesclass")
    @ApiOperation(value = "新增年龄段分类")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addAgesclass(@Validated @RequestBody Agesclass agesclass){
        dosageService.addAgesclass(agesclass);
        return ResultData.success();
    }

    @PostMapping("updateAgesclass")
    @ApiOperation(value = "更新年龄段分类")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateAgesclass(@Validated @RequestBody AgesclassUd agesclass){
        dosageService.updateAgesclass(agesclass);
        return ResultData.success();
    }

    @PostMapping("deleteAgesclass")
    @ApiOperation(value = "删除某个年龄段分类")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteAgesclass(@ApiParam(name = "agesclassId", value = "年龄段分类ID", required = true) @RequestParam Integer agesclassId){
        dosageService.deleteAgesclass(agesclassId);
        return ResultData.success();
    }

    /**  年龄段  **/
    @PostMapping("agesList")
    @ApiOperation(value = "分页查询年龄段")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<AgesVo>> queryAgesList(@Validated @RequestBody AgesParam param){
        PageInfo<AgesVo> pageInfo = dosageService.queryAgesList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getAges")
    @ApiOperation(value = "根据ID查询年龄段")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<AgesVo> getAgesById(@ApiParam(name = "agesId", value = "年龄段ID", required = true) @RequestParam Integer agesId){
        AgesVo ages = dosageService.getAgesById(agesId);
        return ResultData.success(ages);
    }

    @PostMapping("addAges")
    @ApiOperation(value = "新增年龄段")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addAges(@Validated @RequestBody Ages ages){
        dosageService.addAges(ages);
        return ResultData.success();
    }

    @PostMapping("updateAges")
    @ApiOperation(value = "更新年龄段")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateAges(@Validated @RequestBody AgesUd ages){
        dosageService.updateAges(ages);
        return ResultData.success();
    }

    @PostMapping("deleteAges")
    @ApiOperation(value = "删除某个年龄段")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteAges(@ApiParam(name = "agesId", value = "年龄段ID", required = true) @RequestParam Integer agesId){
        dosageService.deleteAges(agesId);
        return ResultData.success();
    }

    /**  药品疾病年龄段用量  **/
    @PostMapping("dosageDiseaAgesList")
    @ApiOperation(value = "分页查询药品疾病年龄段用量")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DosageDiseaAgesVo>> queryDosageDiseaAgesList(@Validated @RequestBody DosageDiseaAgesParam param){
        PageInfo<DosageDiseaAgesVo> pageInfo = dosageService.queryDosageDiseaAgesList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDosageDiseaAges")
    @ApiOperation(value = "根据ID查询药品疾病年龄段用量")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DosageDiseaAgesVo> getDosageDiseaAgesById(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                           @ApiParam(name = "specId", value = "规格编号", required = true) @RequestParam Integer specId,
                                                           @ApiParam(name = "diseaseId", value = "疾病编号", required = true) @RequestParam Integer diseaseId,
                                                           @ApiParam(name = "agesId", value = "年龄段编号", required = true) @RequestParam Integer agesId){
        DosageDiseaAgesVo dosageAges = dosageService.getDosageDiseaAgesById(drugId,specId,diseaseId,agesId);
        return ResultData.success(dosageAges);
    }

    @PostMapping("addDosageDiseaAges")
    @ApiOperation(value = "新增药品疾病年龄段用量")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDosageDiseaAges(@Validated @RequestBody DosageDiseaAges dosageAges){
        dosageService.addDosageDiseaAges(dosageAges);
        return ResultData.success();
    }

    @PostMapping("updateDosageDiseaAges")
    @ApiOperation(value = "更新药品疾病年龄段用量")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDosageDiseaAges(@Validated @RequestBody DosageDiseaAgesUd dosageAges){
        dosageService.updateDosageDiseaAges(dosageAges);
        return ResultData.success();
    }

    @PostMapping("deleteDosageDiseaAges")
    @ApiOperation(value = "删除某个药品疾病年龄段用量")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDosageDiseaAges(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                    @ApiParam(name = "specId", value = "规格编号", required = true) @RequestParam Integer specId,
                                                    @ApiParam(name = "diseaseId", value = "疾病编号", required = true) @RequestParam Integer diseaseId,
                                                    @ApiParam(name = "agesId", value = "年龄段编号", required = true) @RequestParam Integer agesId){
        dosageService.deleteDosageDiseaAges(drugId,specId,diseaseId,agesId);
        return ResultData.success();
    }

    /**  药品疾病体重段用量  **/
    @PostMapping("dosageDiseaWeightList")
    @ApiOperation(value = "分页查询药品疾病体重段用量")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DosageDiseaWeightVo>> queryDosageDiseaWeightList(@Validated @RequestBody DosageDiseaWeightParam param){
        PageInfo<DosageDiseaWeightVo> pageInfo = dosageService.queryDosageDiseaWeightList(param);
        return ResultData.success(pageInfo);
    }


    @PostMapping("getDosageDiseaWeight")
    @ApiOperation(value = "根据ID查询药品疾病体重段用量")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DosageDiseaWeightVo> getDosageDiseaWeightById(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                                    @ApiParam(name = "specId", value = "规格编号", required = true) @RequestParam Integer specId,
                                                                    @ApiParam(name = "diseaseId", value = "疾病编号", required = true) @RequestParam Integer diseaseId,
                                                                    @ApiParam(name = "minWeight", value = "最小体重（kg）", required = true) @RequestParam Float minWeight,
                                                                    @ApiParam(name = "maxWeight", value = "最大体重（kg）", required = true) @RequestParam Float maxWeight){
        DosageDiseaWeightVo dosageWeight = dosageService.getDosageDiseaWeightById(drugId,specId,diseaseId,minWeight,maxWeight);
        return ResultData.success(dosageWeight);
    }

    @PostMapping("addDosageDiseaWeight")
    @ApiOperation(value = "新增药品疾病体重段用量")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> addDosageDiseaWeight(@Validated @RequestBody DosageDiseaWeight dosageWeight){
        dosageService.addDosageDiseaWeight(dosageWeight);
        return ResultData.success();
    }


    @PostMapping("updateDosageDiseaWeight")
    @ApiOperation(value = "更新药品疾病体重段用量")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDosageWeight(@Validated @RequestBody DosageDiseaWeightUd dosageWeight){
        dosageService.updateDosageDiseaWeight(dosageWeight);
        return ResultData.success();
    }

    @PostMapping("deleteDosageDiseaWeight")
    @ApiOperation(value = "删除某个药品疾病体重段用量")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDosageDiseaWeight(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                      @ApiParam(name = "specId", value = "规格编号", required = true) @RequestParam Integer specId,
                                                      @ApiParam(name = "diseaseId", value = "疾病编号", required = true) @RequestParam Integer diseaseId,
                                                      @ApiParam(name = "minWeight", value = "最小体重（kg）", required = true) @RequestParam Float minWeight,
                                                      @ApiParam(name = "maxWeight", value = "最大体重（kg）", required = true) @RequestParam Float maxWeight){
        dosageService.deleteDosageDiseaWeight(drugId,specId,diseaseId,minWeight,maxWeight);
        return ResultData.success();
    }

    /**  药品疾病年龄段体重段用量  **/
    @PostMapping("dosageDiseaAgesWeightList")
    @ApiOperation(value = "分页查询药品疾病年龄段体重段用量")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DosageDiseaAgesWeightVo>> queryDosageDiseaAgesWeightList(@Validated @RequestBody DosageDiseaAgesWeightParam param){
        PageInfo<DosageDiseaAgesWeightVo> pageInfo = dosageService.queryDosageDiseaAgesWeightList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDosageDiseaAgesWeight")
    @ApiOperation(value = "根据ID查询药品疾病年龄段体重段用量")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DosageDiseaAgesWeightVo> getDosageDiseaAgesWeightById(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                                            @ApiParam(name = "specId", value = "规格编号", required = true) @RequestParam Integer specId,
                                                                            @ApiParam(name = "diseaseId", value = "疾病编号", required = true) @RequestParam Integer diseaseId,
                                                                            @ApiParam(name = "agesId", value = "年龄段编号", required = true) @RequestParam Integer agesId,
                                                                            @ApiParam(name = "minWeight", value = "最小体重（kg）", required = true) @RequestParam Float minWeight,
                                                                            @ApiParam(name = "maxWeight", value = "最大体重（kg）", required = true) @RequestParam Float maxWeight){
        DosageDiseaAgesWeightVo dosageDisease = dosageService.getDosageDiseaAgesWeightById(drugId,specId,diseaseId,agesId,minWeight,maxWeight);
        return ResultData.success(dosageDisease);
    }

    @PostMapping("addDosageDiseaAgesWeight")
    @ApiOperation(value = "新增药品疾病年龄段体重段用量")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public ResultData<Object> adDosageDiseaAgesWeight(@Validated @RequestBody DosageDiseaAgesWeight dosageDisease){
        dosageService.adDosageDiseaAgesWeight(dosageDisease);
        return ResultData.success();
    }

    @PostMapping("updateDosageDiseaAgesWeight")
    @ApiOperation(value = "更新药品疾病年龄段体重段用量")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public ResultData<Object> updateDosageDiseaAgesWeight(@Validated @RequestBody DosageDiseaAgesWeightUd dosageDisease){
        dosageService.updateDosageDiseaAgesWeight(dosageDisease);
        return ResultData.success();
    }

    @PostMapping("deleteDosageDiseaAgesWeight")
    @ApiOperation(value = "删除某个药品疾病年龄段体重段用量")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public ResultData<Object> deleteDosageDiseaAgesWeight(@ApiParam(name = "drugId", value = "药品编号", required = true) @RequestParam Integer drugId,
                                                          @ApiParam(name = "specId", value = "规格编号", required = true) @RequestParam Integer specId,
                                                          @ApiParam(name = "diseaseId", value = "疾病编号", required = true) @RequestParam Integer diseaseId,
                                                          @ApiParam(name = "agesId", value = "年龄段编号", required = true) @RequestParam Integer agesId,
                                                          @ApiParam(name = "minWeight", value = "最小体重（kg）", required = true) @RequestParam Float minWeight,
                                                          @ApiParam(name = "maxWeight", value = "最大体重（kg）", required = true) @RequestParam Float maxWeight){
        dosageService.deleteDosageDiseaAgesWeight(drugId,specId,diseaseId,agesId,minWeight,maxWeight);
        return ResultData.success();
    }


}
