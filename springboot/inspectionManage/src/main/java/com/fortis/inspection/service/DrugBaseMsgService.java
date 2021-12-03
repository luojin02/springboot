package com.fortis.inspection.service;

import com.fortis.inspection.entity.drugBaseMsg.Label;
import com.fortis.inspection.entity.drugBaseMsg.LabelClass;
import com.fortis.inspection.entity.drugBaseMsg.LabelClassUd;
import com.fortis.inspection.entity.drugBaseMsg.LabelUd;
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

    public PageInfo<LabelClassVo> queryLabelClassList(LabelClassParam param){
        if(ObjectUtils.isEmpty(param.getPageNum())||ObjectUtils.isEmpty(param.getPageSize())){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        PageHelper.startPage(param.getPageNum().intValue(), param.getPageSize().intValue());
        List<LabelClassVo> list = drugBaseMsgMapper.queryLabelClassList(param);
        return new PageInfo(list);
    }

    public LabelClassVo getLabelClassById(Integer labelclassId){
        if(ObjectUtils.isEmpty(labelclassId)){
            throw new InspectException(InspectExceptionTypeEnum.PARAM_IS_EMPTY,InspectExceptionTypeEnum.PARAM_IS_EMPTY.getMsg());
        }
        LabelClassVo lableClass = drugBaseMsgMapper.getLabelClassById(labelclassId);
        return lableClass;
    }

    public void addLabelClass(LabelClass labelclass){
        drugBaseMsgMapper.addLabelClass(labelclass);
    }

    public void deleteLabelClass(Integer labelclassId){
        drugBaseMsgMapper.deleteLabelClass(labelclassId);
    }

    public void updateLabelClass(LabelClassUd param){
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
}
