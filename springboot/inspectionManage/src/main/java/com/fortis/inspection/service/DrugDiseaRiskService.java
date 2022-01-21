package com.fortis.inspection.service;

import com.fortis.inspection.entity.drugDisease.DrugDiseaRisk;
import com.fortis.inspection.entity.drugDisease.DrugDiseaRiskUd;
import com.fortis.inspection.entity.drugDisease.DrugIndication;
import com.fortis.inspection.exception.InspectException;
import com.fortis.inspection.exception.InspectExceptionTypeEnum;
import com.fortis.inspection.mapper.DrugDiseaRiskMapper;
import com.fortis.inspection.model.drugDisease.DrugDiseaRiskParam;
import com.fortis.inspection.model.drugDisease.DrugDiseaRiskVo;
import com.fortis.inspection.model.drugDisease.DrugIndicationParam;
import com.fortis.inspection.model.drugDisease.DrugIndicationVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class DrugDiseaRiskService {

    @Autowired
    private DrugDiseaRiskMapper drugDiseaRiskMapper;

    public PageInfo<DrugDiseaRiskVo> queryDrugDiseaRiskList(DrugDiseaRiskParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DrugDiseaRiskVo> list = drugDiseaRiskMapper.queryDrugDiseaRiskList(param);
        return new PageInfo(list);
    }

    public DrugDiseaRiskVo getDrugDiseaRiskById(Integer drugId,Integer diseaseId){
        if(ObjectUtils.isEmpty(drugId) || ObjectUtils.isEmpty(diseaseId) ){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DrugDiseaRiskVo drugDiseaRisk = drugDiseaRiskMapper.getDrugDiseaRiskById(drugId,diseaseId);
        return drugDiseaRisk;
    }

    public void addDrugDiseaRisk(DrugDiseaRisk drugDiseaRisk){
        drugDiseaRiskMapper.addDrugDiseaRisk(drugDiseaRisk);
    }

    public void updateDrugDiseaRisk(DrugDiseaRiskUd param){
        drugDiseaRiskMapper.updateDrugDiseaRisk(param);
    }

    public void deleteDrugDiseaRisk(Integer drugId,Integer diseaseId){
        drugDiseaRiskMapper.deleteDrugDiseaRisk(drugId,diseaseId);
    }

    public PageInfo<DrugIndicationVo> queryDrugIndicationList(DrugIndicationParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DrugIndicationVo> list = drugDiseaRiskMapper.queryDrugIndicationList(param);
        return new PageInfo(list);
    }

    public DrugIndicationVo getDrugIndicationById(Integer drugId,Integer indicationType,Integer indicationId){
        if(ObjectUtils.isEmpty(drugId) || ObjectUtils.isEmpty(indicationType) || ObjectUtils.isEmpty(indicationId) ){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DrugIndicationVo drugIndication = drugDiseaRiskMapper.getDrugIndicationById(drugId,indicationType,indicationId);
        return drugIndication;
    }

    public void addDrugIndication(DrugIndication drugIndication){
        drugDiseaRiskMapper.addDrugIndication(drugIndication);
    }

    public void deleteDrugIndication(Integer drugId,Integer indicationType,Integer indicationId){
        drugDiseaRiskMapper.deleteDrugIndication(drugId,indicationType,indicationId);
    }
}
