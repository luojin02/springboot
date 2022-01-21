package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.drugDisease.DrugDiseaRisk;
import com.fortis.inspection.entity.drugDisease.DrugDiseaRiskUd;
import com.fortis.inspection.entity.drugDisease.DrugIndication;
import com.fortis.inspection.model.drugDisease.DrugDiseaRiskParam;
import com.fortis.inspection.model.drugDisease.DrugDiseaRiskVo;
import com.fortis.inspection.model.drugDisease.DrugIndicationParam;
import com.fortis.inspection.model.drugDisease.DrugIndicationVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugDiseaRiskMapper {

    List<DrugDiseaRiskVo> queryDrugDiseaRiskList(DrugDiseaRiskParam param);

    DrugDiseaRiskVo getDrugDiseaRiskById(@Param("drugId")Integer drugId,@Param("diseaseId")Integer diseaseId);

    void addDrugDiseaRisk(DrugDiseaRisk drugDiseaRisk);

    void updateDrugDiseaRisk(DrugDiseaRiskUd drugDiseaRisk);

    void deleteDrugDiseaRisk(@Param("drugId")Integer drugId,@Param("diseaseId")Integer diseaseId);

    List<DrugIndicationVo> queryDrugIndicationList(DrugIndicationParam param);

    DrugIndicationVo getDrugIndicationById(@Param("drugId")Integer drugId,
                                           @Param("indicationType")Integer indicationType,
                                           @Param("indicationId")Integer indicationId);

    void addDrugIndication(DrugIndication drugIndication);

    void deleteDrugIndication(@Param("drugId")Integer drugId,
                              @Param("indicationType")Integer indicationType,
                              @Param("indicationId")Integer indicationId);


}
