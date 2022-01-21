package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.diseaseRisk.DiseaseDiseaseUd;
import com.fortis.inspection.entity.diseaseRisk.DiseaseGenderRisk;
import com.fortis.inspection.entity.diseaseRisk.DiseaseGenderRiskUd;
import com.fortis.inspection.entity.diseaseRisk.DiseaseRisk;
import com.fortis.inspection.model.diseaseRisk.DiseaseGenderRiskParam;
import com.fortis.inspection.model.diseaseRisk.DiseaseGengerRiskVo;
import com.fortis.inspection.model.diseaseRisk.DiseaseRiskParam;
import com.fortis.inspection.model.diseaseRisk.DiseaseRiskVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiseaseRiskMapper {

    List<DiseaseRiskVo> queryDiseaseRiskList(DiseaseRiskParam param);

    DiseaseRiskVo getDiseaseRiskById(Integer diseaseRiskId);

    void addDiseaseRisk(DiseaseRisk diseaseRisk);

    void updateDiseaseRisk(DiseaseDiseaseUd diseaseRisk);

    void deleteDiseaseRisk(Integer diseaseRiskId);

    List<DiseaseGengerRiskVo> queryDiseaseGenderRiskList(DiseaseGenderRiskParam param);

    DiseaseGengerRiskVo getDiseaseGenderRiskById(@Param("diseaseId")Integer diseaseId,@Param("gender")Integer gender);

    void addDiseaseGenderRisk(DiseaseGenderRisk diseaseGenderRisk);

    void updateDiseaseGenderRisk(DiseaseGenderRiskUd diseaseGenderRisk);

    void deleteDiseaseGenderRisk(@Param("diseaseId")Integer diseaseId,@Param("gender")Integer gender);
}
