package com.fortis.inspection.service;

import com.fortis.inspection.entity.drugRisk.*;
import com.fortis.inspection.exception.InspectException;
import com.fortis.inspection.exception.InspectExceptionTypeEnum;
import com.fortis.inspection.mapper.DrugRiskMapper;
import com.fortis.inspection.model.drugRisk.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class DrugRiskService {

    @Autowired
    private DrugRiskMapper drugRiskMapper;

    public PageInfo<DrugRiskVo> queryDrugRiskList(DrugRiskParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DrugRiskVo> list = drugRiskMapper.queryDrugRiskList(param);
        return new PageInfo(list);
    }

    public DrugRiskVo getDrugRiskById(Integer drugRiskId){
        if(ObjectUtils.isEmpty(drugRiskId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DrugRiskVo drugRisk = drugRiskMapper.getDrugRiskById(drugRiskId);
        return drugRisk;
    }

    public void addDrugRisk(DrugRisk drugRisk){
        drugRiskMapper.addDrugRisk(drugRisk);
    }

    public void updateDrugRisk(DrugRiskUd param){
        drugRiskMapper.updateDrugRisk(param);
    }

    public void deleteDrugRisk(Integer drugRiskId){
        drugRiskMapper.deleteDrugRisk(drugRiskId);
    }

    public PageInfo<DrugAgesRiskVo> queryDrugAgesRiskList(DrugAgesRiskParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DrugAgesRiskVo> list = drugRiskMapper.queryDrugAgesRiskList(param);
        return new PageInfo(list);
    }

    public DrugAgesRiskVo getDrugAgesRiskById(Integer drugId,Integer agesId){
        if(ObjectUtils.isEmpty(drugId) || ObjectUtils.isEmpty(agesId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DrugAgesRiskVo drugAgesRisk = drugRiskMapper.getDrugAgesRiskById(drugId,agesId);
        return drugAgesRisk;
    }

    public void addDrugAgesRisk(DrugAgesRisk drugAgesRisk){
        drugRiskMapper.addDrugAgesRisk(drugAgesRisk);
    }

    public void updateDrugAgesRisk(DrugAgesRiskUd param){
        drugRiskMapper.updateDrugAgesRisk(param);
    }

    public void deleteDrugAgesRisk(Integer drugId,Integer agesId){
        drugRiskMapper.deleteDrugAgesRisk(drugId,agesId);
    }

    public PageInfo<IngreRiskVo> queryIngreRiskList(IngreRiskParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<IngreRiskVo> list = drugRiskMapper.queryIngreRiskList(param);
        return new PageInfo(list);
    }

    public IngreRiskVo getIngreRiskById(Integer ingredientId1,Integer ingredientId2){
        if(ObjectUtils.isEmpty(ingredientId1) || ObjectUtils.isEmpty(ingredientId2)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        IngreRiskVo ingreRiskVo = drugRiskMapper.getIngreRiskById(ingredientId1,ingredientId2);
        return ingreRiskVo;
    }

    public void addIngreRisk(IngreRisk ingreRisk){
        drugRiskMapper.addIngreRisk(ingreRisk);
    }

    public void updateIngreRisk(IngreRiskUd param){
        drugRiskMapper.updateIngreRisk(param);
    }

    public void deleteIngreRisk(Integer ingredientId1,Integer ingredientId2){
        drugRiskMapper.deleteIngreRisk(ingredientId1,ingredientId2);
    }
}
