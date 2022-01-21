package com.fortis.inspection.service;

import com.fortis.inspection.entity.diseaseSym.*;
import com.fortis.inspection.exception.InspectException;
import com.fortis.inspection.exception.InspectExceptionTypeEnum;
import com.fortis.inspection.mapper.DiseaseSymMapper;
import com.fortis.inspection.model.diseaseSym.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class DiseaseSymService {

    @Autowired
    private DiseaseSymMapper diseaseSymMapper;

    public PageInfo<SymptomVo> querySymptomList(SymptomParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<SymptomVo> list = diseaseSymMapper.querySymptomList(param);
        return new PageInfo(list);
    }

    public SymptomVo getSymptomById(Integer symptomId){
        if(ObjectUtils.isEmpty(symptomId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        SymptomVo symptom = diseaseSymMapper.getSymptomById(symptomId);
        return symptom;
    }

    public void addSymptom(Symptom symptom){
        diseaseSymMapper.addSymptom(symptom);
    }

    public void updateSymptom(SymptomUd symptom){
        diseaseSymMapper.updateSymptom(symptom);
    }

    public void deleteSymptom(Integer symptomId){
        diseaseSymMapper.deleteSymptom(symptomId);
    }

    public PageInfo<DiseaseVo> queryDiseaseList(DiseaseParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DiseaseVo> list = diseaseSymMapper.queryDiseaseList(param);
        return new PageInfo(list);
    }

    public DiseaseVo getDiseaseById(Integer diseaseId){
        if(ObjectUtils.isEmpty(diseaseId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DiseaseVo disease = diseaseSymMapper.getDiseaseById(diseaseId);
        return disease;
    }

    public void addDisease(Disease disease){
        diseaseSymMapper.addDisease(disease);
    }

    public void updateDisease(DiseaseUd disease){
        diseaseSymMapper.updateDisease(disease);
    }

    public void deleteDisease(Integer diseaseId){
        diseaseSymMapper.deleteDisease(diseaseId);
    }

    public PageInfo<DiseaseclassVo> queryDiseaseclassList(DiseaseclassParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DiseaseclassVo> list = diseaseSymMapper.queryDiseaseclassList(param);
        return new PageInfo(list);
    }

    public DiseaseclassVo getDiseaseclassById(Integer diseaseclassId){
        if(ObjectUtils.isEmpty(diseaseclassId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DiseaseclassVo diseaseclass = diseaseSymMapper.getDiseaseclassById(diseaseclassId);
        return diseaseclass;
    }

    public void addDiseaseclass(Diseaseclass diseaseclass){
        diseaseSymMapper.addDiseaseclass(diseaseclass);
    }

    public void updateDiseaseclass(DiseaseclassUd diseaseclass){
        diseaseSymMapper.updateDiseaseclass(diseaseclass);
    }

    public void deleteDiseaseclass(Integer diseaseclassId){
        diseaseSymMapper.deleteDiseaseclass(diseaseclassId);
    }
}
