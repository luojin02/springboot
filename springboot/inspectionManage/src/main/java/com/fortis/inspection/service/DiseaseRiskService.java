package com.fortis.inspection.service;

import com.fortis.inspection.entity.diseaseRisk.DiseaseDiseaseUd;
import com.fortis.inspection.entity.diseaseRisk.DiseaseGenderRisk;
import com.fortis.inspection.entity.diseaseRisk.DiseaseGenderRiskUd;
import com.fortis.inspection.entity.diseaseRisk.DiseaseRisk;
import com.fortis.inspection.entity.drugRisk.*;
import com.fortis.inspection.exception.InspectException;
import com.fortis.inspection.exception.InspectExceptionTypeEnum;
import com.fortis.inspection.mapper.DiseaseRiskMapper;
import com.fortis.inspection.mapper.DrugRiskMapper;
import com.fortis.inspection.model.diseaseRisk.DiseaseGenderRiskParam;
import com.fortis.inspection.model.diseaseRisk.DiseaseGengerRiskVo;
import com.fortis.inspection.model.diseaseRisk.DiseaseRiskParam;
import com.fortis.inspection.model.diseaseRisk.DiseaseRiskVo;
import com.fortis.inspection.model.drugRisk.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class DiseaseRiskService {

    @Autowired
    private DiseaseRiskMapper diseaseRiskMapper;

    public PageInfo<DiseaseRiskVo> queryDiseaseRiskList(DiseaseRiskParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DiseaseRiskVo> list = diseaseRiskMapper.queryDiseaseRiskList(param);
        return new PageInfo(list);
    }

    public DiseaseRiskVo getDiseaseRiskById(Integer diseaseRiskId){
        if(ObjectUtils.isEmpty(diseaseRiskId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DiseaseRiskVo diseaseRisk = diseaseRiskMapper.getDiseaseRiskById(diseaseRiskId);
        return diseaseRisk;
    }

    public void addDiseaseRisk(DiseaseRisk diseaseRisk){
        diseaseRiskMapper.addDiseaseRisk(diseaseRisk);
    }

    public void updateDiseaseRisk(DiseaseDiseaseUd param){
        diseaseRiskMapper.updateDiseaseRisk(param);
    }

    public void deleteDiseaseRisk(Integer diseaseRiskId){
        diseaseRiskMapper.deleteDiseaseRisk(diseaseRiskId);
    }

    public PageInfo<DiseaseGengerRiskVo> queryDiseaseGenderRiskList(DiseaseGenderRiskParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DiseaseGengerRiskVo> list = diseaseRiskMapper.queryDiseaseGenderRiskList(param);
        return new PageInfo(list);
    }

    public DiseaseGengerRiskVo getDiseaseGenderRiskById(Integer diseaseId,Integer gender){
        if(ObjectUtils.isEmpty(diseaseId) || ObjectUtils.isEmpty(gender)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DiseaseGengerRiskVo diseaseGengerRisk = diseaseRiskMapper.getDiseaseGenderRiskById(diseaseId,gender);
        return diseaseGengerRisk;
    }

    public void addDiseaseGenderRisk(DiseaseGenderRisk diseaseGenderRisk){
        diseaseRiskMapper.addDiseaseGenderRisk(diseaseGenderRisk);
    }

    public void updateDiseaseGenderRisk(DiseaseGenderRiskUd param){
        diseaseRiskMapper.updateDiseaseGenderRisk(param);
    }

    public void deleteDiseaseGenderRisk(Integer diseaseId,Integer gender){
        diseaseRiskMapper.deleteDiseaseGenderRisk(diseaseId,gender);
    }
}
