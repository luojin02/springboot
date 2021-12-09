package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.drugBaseMsg.*;
import com.fortis.inspection.model.drugBaseMsg.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugBaseMsgMapper {

    List<LabelclassVo> queryLabelClassList(LabelclassParam param);

    LabelclassVo getLabelClassById(@Param("labelclassId")Integer labelclassId);

    void addLabelClass(Labelclass labelClass);

    void deleteLabelClass(@Param("labelclassId")Integer labelclassId);

    void updateLabelClass(LabelclassUd param);

    List<LabelVo> queryLabelList(LabelParam param);

    LabelVo getLabelById(@Param("labelId")Integer labelId);

    void addLabel(Label label);

    void deleteLabel(@Param("labelId")Integer labelId);

    void updateLabel(LabelUd param);

    List<FormVo> queryFormList(FormParam param);

    FormVo getFormById(Integer formId);

    void addForm(Form form);

    void deleteForm(Integer formId);

    void updateForm(FormUd param);

    List<DrugApprVo> queryDrugApprList(DrugApprParam param);

    DrugApprVo getDrugApprById(Integer apprId);

    void addDrugAppr(DrugAppr appr);

    void deleteDrugAppr(@Param("apprId")Integer apprId);

    void updateDrugAppr(DrugApprUd param);

    List<UsageVo> queryUsageList(UsageParam param);

    UsageVo getUsageById(Integer usageId);

    void addUsage(Usage usage);

    void deleteUsage(Integer usageId);

    void updateUsage(UsageUd param);

    List<ApprSpecVo> queryApprSpecList(ApprSpecParam param);

    ApprSpecVo getApprSpecById(Integer specId);

    void addApprSpec(ApprSpec apprSpec);

    void deleteApprSpec(Integer specId);

    void updateApprSpec(ApprSpecUd param);

    List<SpecPackVo> querySpecPackList(SpecPackParam param);

    SpecPackVo getSpecPackById(Integer packId);

    void addSpecPack(SpecPack pack);

    void deleteSpecPack(Integer specId);

    void updateSpecPack(SpecPackUd param);
}
