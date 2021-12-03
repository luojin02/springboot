package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.drugBaseMsg.Label;
import com.fortis.inspection.entity.drugBaseMsg.LabelClass;
import com.fortis.inspection.entity.drugBaseMsg.LabelClassUd;
import com.fortis.inspection.entity.drugBaseMsg.LabelUd;
import com.fortis.inspection.model.drugBaseMsg.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugBaseMsgMapper {

    List<LabelClassVo> queryLabelClassList(LabelClassParam param);

    LabelClassVo getLabelClassById(@Param("labelclassId")Integer labelclassId);

    void addLabelClass(LabelClass labelClass);

    void deleteLabelClass(@Param("labelclassId")Integer labelclassId);

    void updateLabelClass(LabelClassUd param);

    List<LabelVo> queryLabelList(LabelParam param);

    LabelVo getLabelById(@Param("labelId")Integer labelId);

    void addLabel(Label label);

    void deleteLabel(@Param("labelId")Integer labelId);

    void updateLabel(LabelUd param);

    List<FormVo> queryFormList(FormParam param);
}
