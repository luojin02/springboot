package com.fortis.inspection.service;

import com.fortis.inspection.entity.drug.*;
import com.fortis.inspection.exception.InspectException;
import com.fortis.inspection.exception.InspectExceptionTypeEnum;
import com.fortis.inspection.mapper.DrugMapper;
import com.fortis.inspection.model.drug.*;
import com.fortis.inspection.model.drugBaseMsg.*;
import com.fortis.inspection.result.Result;
import com.fortis.inspection.result.ResultTypeEnum;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class DrugService {

    @Autowired
    private DrugMapper drugMapper;

    public PageInfo<DrugVo> queryDrugList(DrugParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DrugVo> list = drugMapper.queryDrugList(param);
        return new PageInfo(list);
    }

    public DrugVo getDrugById(Integer drugId){
        if(ObjectUtils.isEmpty(drugId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DrugVo drug = drugMapper.getDrugById(drugId);
        return drug;
    }

    public void addDrug(Drug drug){
        drugMapper.addDrug(drug);
    }

    public void deleteDrug(Integer drugId){
        drugMapper.deleteDrug(drugId);
    }

    public void updateDrug(DrugUd param){
        drugMapper.updateDrug(param);
    }

    public PageInfo<DrugclassVo> queryDrugclassList(DrugclassParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DrugclassVo> list = drugMapper.queryDrugclassList(param);
        return new PageInfo(list);
    }

    public DrugclassVo getDrugclassById(Integer drugclassId){
        if(ObjectUtils.isEmpty(drugclassId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DrugclassVo drugclass = drugMapper.getDrugclassById(drugclassId);
        return drugclass;
    }

    public void addDrugclass(Drugclass drugclass){
        drugMapper.addDrugclass(drugclass);
    }

    public void updateDrugclass(DrugclassUd param){
        drugMapper.updateDrugclass(param);
    }

    public Result deleteDrugclass(Integer drugclassId){
        Integer count = drugMapper.selectHaveDrug(drugclassId);
        if(count>0){
            return Result.fail(ResultTypeEnum.HAVE_DRUG);
        }
        drugMapper.deleteDrugclass(drugclassId);
        return Result.success();
    }

    public PageInfo<IngredientVo> queryIngredientList(IngredientParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<IngredientVo> list = drugMapper.queryIngredientList(param);
        return new PageInfo(list);
    }

    public IngredientVo getIngredientById(Integer ingredientId){
        if(ObjectUtils.isEmpty(ingredientId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        IngredientVo ingredient = drugMapper.getIngredientById(ingredientId);
        return ingredient;
    }

    public void addIngredient(Ingredient ingredient){
        drugMapper.addIngredient(ingredient);
    }

    public void updateIngredient(IngredientUd param){
        drugMapper.updateIngredient(param);
    }

    public void deleteIngredient(Integer ingredientId){
        drugMapper.deleteIngredient(ingredientId);
    }

    public PageInfo<DrugIngrdtVo> queryDrugIngrdtList(DrugIngrdtParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DrugIngrdtVo> list = drugMapper.queryDrugIngrdtList(param);
        return new PageInfo(list);
    }

    public DrugIngrdtVo getDrugIngrdtById(Integer drugIngrdtId){
        if(ObjectUtils.isEmpty(drugIngrdtId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DrugIngrdtVo drugIngrdt = drugMapper.getDrugIngrdtById(drugIngrdtId);
        return drugIngrdt;
    }

    public void addDrugIngrdt(DrugIngrdt drugIngrdt){
        drugMapper.addDrugIngrdt(drugIngrdt);
    }
}
