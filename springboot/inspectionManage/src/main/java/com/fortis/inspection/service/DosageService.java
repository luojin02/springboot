package com.fortis.inspection.service;

import com.fortis.inspection.entity.dosage.*;
import com.fortis.inspection.exception.InspectException;
import com.fortis.inspection.exception.InspectExceptionTypeEnum;
import com.fortis.inspection.mapper.DosageMapper;
import com.fortis.inspection.model.dosage.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class DosageService {

    @Autowired
    private DosageMapper dosageMapper;

    public PageInfo<FreqVo> queryFreqList(FreqParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<FreqVo> list = dosageMapper.queryFreqList(param);
        return new PageInfo(list);
    }

    public FreqVo getFreqById(Integer freqId){
        if(ObjectUtils.isEmpty(freqId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        FreqVo freq = dosageMapper.getFreqById(freqId);
        return freq;
    }

    public void addFreq(Freq freq){
        dosageMapper.addFreq(freq);
    }

    public void updateFreq(FreqUd param){
        dosageMapper.updateFreq(param);
    }

    public void deleteFreq(Integer freqId){
        dosageMapper.deleteFreq(freqId);
    }

    public PageInfo<AgesclassVo> queryAgesclassList(AgesclassParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<AgesclassVo> list = dosageMapper.queryAgesclassList(param);
        return new PageInfo(list);
    }

    public AgesclassVo getAgesclassById(Integer agesclassId){
        if(ObjectUtils.isEmpty(agesclassId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        AgesclassVo agesclass = dosageMapper.getAgesclassById(agesclassId);
        return agesclass;
    }

    public void addAgesclass(Agesclass agesclass){
        dosageMapper.addAgesclass(agesclass);
    }

    public void updateAgesclass(AgesclassUd param){
        dosageMapper.updateAgesclass(param);
    }

    public void deleteAgesclass(Integer agesclassId){
        dosageMapper.deleteAgesclass(agesclassId);
    }

    public PageInfo<AgesVo> queryAgesList(AgesParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<AgesVo> list = dosageMapper.queryAgesList(param);
        return new PageInfo(list);
    }

    public AgesVo getAgesById(Integer agesId){
        if(ObjectUtils.isEmpty(agesId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        AgesVo ages = dosageMapper.getAgesById(agesId);
        return ages;
    }

    public void addAges(Ages ages){
        dosageMapper.addAges(ages);
    }

    public void updateAges(AgesUd param){
        dosageMapper.updateAges(param);
    }

    public void deleteAges(Integer agesId){
        dosageMapper.deleteAges(agesId);
    }

    public PageInfo<DosageDiseaAgesVo> queryDosageDiseaAgesList(DosageDiseaAgesParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DosageDiseaAgesVo> list = dosageMapper.queryDosageDiseaAgesList(param);
        return new PageInfo(list);
    }

    public DosageDiseaAgesVo getDosageDiseaAgesById(Integer drugId,Integer specId,
                                                    Integer diseaseId,Integer agesId){
        if(ObjectUtils.isEmpty(drugId) || ObjectUtils.isEmpty(specId) || ObjectUtils.isEmpty(diseaseId) || ObjectUtils.isEmpty(agesId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DosageDiseaAgesVo dosageAges = dosageMapper.getDosageDiseaAgesById(drugId,specId,diseaseId,agesId);
        return dosageAges;
    }

    public void addDosageDiseaAges(DosageDiseaAges dosageAges){
        dosageMapper.addDosageDiseaAges(dosageAges);
    }

    public void updateDosageDiseaAges(DosageDiseaAgesUd param){
        dosageMapper.updateDosageDiseaAges(param);
    }

    public void deleteDosageDiseaAges(Integer drugId,Integer specId,
                                      Integer diseaseId,Integer agesId){
        dosageMapper.deleteDosageDiseaAges(drugId,specId,diseaseId,agesId);
    }

    public PageInfo<DosageDiseaWeightVo> queryDosageDiseaWeightList(DosageDiseaWeightParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DosageDiseaWeightVo> list = dosageMapper.queryDosageDiseaWeightList(param);
        return new PageInfo(list);
    }

    public DosageDiseaWeightVo getDosageDiseaWeightById(Integer drugId,Integer specId,
                                                        Integer diseaseId,Float minWeight,
                                                        Float maxWeight){
        if(ObjectUtils.isEmpty(drugId) || ObjectUtils.isEmpty(specId) || ObjectUtils.isEmpty(diseaseId)
            || ObjectUtils.isEmpty(minWeight) || ObjectUtils.isEmpty(maxWeight)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DosageDiseaWeightVo dosageWeight = dosageMapper.getDosageDiseaWeightById(drugId,specId,diseaseId,minWeight,maxWeight);
        return dosageWeight;
    }

    public void addDosageDiseaWeight(DosageDiseaWeight dosageWeight){
        dosageMapper.addDosageDiseaWeight(dosageWeight);
    }

    public void updateDosageDiseaWeight(DosageDiseaWeightUd param){
        dosageMapper.updateDosageDiseaWeight(param);
    }

    public void deleteDosageDiseaWeight(Integer drugId,Integer specId,
                                        Integer diseaseId,Float minWeight,
                                        Float maxWeight){
        dosageMapper.deleteDosageDiseaWeight(drugId,specId,diseaseId,minWeight,maxWeight);
    }

    public PageInfo<DosageDiseaAgesWeightVo> queryDosageDiseaAgesWeightList(DosageDiseaAgesWeightParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DosageDiseaAgesWeightVo> list = dosageMapper.queryDosageDiseaAgesWeightList(param);
        return new PageInfo(list);
    }

    public DosageDiseaAgesWeightVo getDosageDiseaAgesWeightById(Integer drugId,Integer specId,
                                                                Integer diseaseId,Integer agesId,
                                                                Float minWeight,Float maxWeight){
        if(ObjectUtils.isEmpty(drugId) || ObjectUtils.isEmpty(specId) ||
                ObjectUtils.isEmpty(diseaseId) || ObjectUtils.isEmpty(agesId) ||
                ObjectUtils.isEmpty(minWeight) || ObjectUtils.isEmpty(maxWeight) ){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DosageDiseaAgesWeightVo dosageDisease = dosageMapper.getDosageDiseaAgesWeightById(drugId,specId,diseaseId,agesId,minWeight,maxWeight);
        return dosageDisease;
    }

    public void adDosageDiseaAgesWeight(DosageDiseaAgesWeight dosageDisease){
        dosageMapper.adDosageDiseaAgesWeight(dosageDisease);
    }

    public void updateDosageDiseaAgesWeight(DosageDiseaAgesWeightUd dosageDisease){
        dosageMapper.updateDosageDiseaAgesWeight(dosageDisease);
    }

    public void deleteDosageDiseaAgesWeight(Integer drugId,Integer specId,Integer diseaseId,Integer agesId,Float minWeight,Float maxWeight){
        dosageMapper.deleteDosageDiseaAgesWeight(drugId,specId,diseaseId,agesId,minWeight,maxWeight);
    }

}
