package com.fortis.inspection.service;

import com.fortis.inspection.entity.drugBaseMsg.*;
import com.fortis.inspection.exception.InspectException;
import com.fortis.inspection.exception.InspectExceptionTypeEnum;
import com.fortis.inspection.mapper.DrugBaseMsgMapper;
import com.fortis.inspection.model.drugBaseMsg.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class DrugBaseMsgService {

    @Autowired
    private DrugBaseMsgMapper drugBaseMsgMapper;

    public PageInfo<LabelclassVo> queryLabelClassList(LabelclassParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<LabelclassVo> list = drugBaseMsgMapper.queryLabelClassList(param);
        return new PageInfo(list);
    }

    public LabelclassVo getLabelClassById(Integer labelclassId){
        if(ObjectUtils.isEmpty(labelclassId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        LabelclassVo lableClass = drugBaseMsgMapper.getLabelClassById(labelclassId);
        return lableClass;
    }

    public void addLabelClass(Labelclass labelclass){
        drugBaseMsgMapper.addLabelClass(labelclass);
    }

    public void deleteLabelClass(Integer labelclassId){
        drugBaseMsgMapper.deleteLabelClass(labelclassId);
    }

    public void updateLabelClass(LabelclassUd param){
        drugBaseMsgMapper.updateLabelClass(param);
    }

    public PageInfo<LabelVo> queryLabelList(LabelParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<LabelVo> list = drugBaseMsgMapper.queryLabelList(param);
        return new PageInfo(list);
    }

    public LabelVo getLabelById(Integer labelId){
        if(ObjectUtils.isEmpty(labelId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        LabelVo lable = drugBaseMsgMapper.getLabelById(labelId);
        return lable;
    }

    public void addLabel(Label label){
        drugBaseMsgMapper.addLabel(label);
    }

    public void deleteLabel(Integer labelId){
        drugBaseMsgMapper.deleteLabel(labelId);
    }

    public void updateLabe(LabelUd param){
        drugBaseMsgMapper.updateLabel(param);
    }

    public PageInfo<FormVo> queryFormList(FormParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<FormVo> list = drugBaseMsgMapper.queryFormList(param);
        return new PageInfo(list);
    }

    public FormVo getFormById(Integer formId){
        if(ObjectUtils.isEmpty(formId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        FormVo form = drugBaseMsgMapper.getFormById(formId);
        return form;
    }

    public void addForm(Form form){
        drugBaseMsgMapper.addForm(form);
    }

    public void deleteForm(Integer formId){
        drugBaseMsgMapper.deleteForm(formId);
    }

    public void updateForm(FormUd param){
        drugBaseMsgMapper.updateForm(param);
    }

    public PageInfo<DrugApprVo> queryDrugApprList(DrugApprParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<DrugApprVo> list = drugBaseMsgMapper.queryDrugApprList(param);
        return new PageInfo(list);
    }

    public DrugApprVo getDrugApprById(Integer apprId){
        if(ObjectUtils.isEmpty(apprId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        DrugApprVo appr = drugBaseMsgMapper.getDrugApprById(apprId);
        return appr;
    }

    public void addDrugAppr(DrugAppr appr){
        drugBaseMsgMapper.addDrugAppr(appr);
    }

    public void deleteDrugAppr(Integer apprId){
        drugBaseMsgMapper.deleteDrugAppr(apprId);
    }

    public void updateDrugAppr(DrugApprUd param){
        drugBaseMsgMapper.updateDrugAppr(param);
    }

    public PageInfo<UsageVo> queryUsageList(UsageParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<UsageVo> list = drugBaseMsgMapper.queryUsageList(param);
        return new PageInfo(list);
    }

    public UsageVo getUsageById(Integer usageId){
        if(ObjectUtils.isEmpty(usageId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        UsageVo usage = drugBaseMsgMapper.getUsageById(usageId);
        return usage;
    }

    public void addUsage(Usage usage){
        drugBaseMsgMapper.addUsage(usage);
    }

    public void deleteUsage(Integer usageId){
        drugBaseMsgMapper.deleteUsage(usageId);
    }

    public void updateUsage(UsageUd param){
        drugBaseMsgMapper.updateUsage(param);
    }

    public PageInfo<ApprSpecVo> queryApprSpecList(ApprSpecParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<ApprSpecVo> list = drugBaseMsgMapper.queryApprSpecList(param);
        return new PageInfo(list);
    }

    public ApprSpecVo getApprSpecById(Integer specId){
        if(ObjectUtils.isEmpty(specId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        ApprSpecVo apprSpec = drugBaseMsgMapper.getApprSpecById(specId);
        return apprSpec;
    }

    public void addApprSpec(ApprSpec apprSpec){
        drugBaseMsgMapper.addApprSpec(apprSpec);
    }

    public void deleteApprSpec(Integer specId){
        drugBaseMsgMapper.deleteApprSpec(specId);
    }

    public void updateApprSpec(ApprSpecUd param){
        drugBaseMsgMapper.updateApprSpec(param);
    }

    public PageInfo<SpecPackVo> querySpecPackList(SpecPackParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<SpecPackVo> list = drugBaseMsgMapper.querySpecPackList(param);
        return new PageInfo(list);
    }

    public SpecPackVo getSpecPackById(Integer packId){
        if(ObjectUtils.isEmpty(packId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        SpecPackVo pack = drugBaseMsgMapper.getSpecPackById(packId);
        return pack;
    }

    public void addSpecPack(SpecPack pack){
        drugBaseMsgMapper.addSpecPack(pack);
    }

    public void deleteSpecPack(Integer packId){
        drugBaseMsgMapper.deleteSpecPack(packId);
    }

    public void updateSpecPack(SpecPackUd param){
        drugBaseMsgMapper.updateSpecPack(param);
    }
}
