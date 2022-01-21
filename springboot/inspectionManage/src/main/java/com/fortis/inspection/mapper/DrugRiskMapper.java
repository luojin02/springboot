package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.drugRisk.*;
import com.fortis.inspection.model.drugRisk.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugRiskMapper {

    List<DrugRiskVo> queryDrugRiskList(DrugRiskParam param);

    DrugRiskVo getDrugRiskById(Integer drugRiskId);

    void addDrugRisk(DrugRisk drugRisk);

    void updateDrugRisk(DrugRiskUd drugRisk);

    void deleteDrugRisk(Integer drugRiskId);

    List<DrugAgesRiskVo> queryDrugAgesRiskList(DrugAgesRiskParam param);

    DrugAgesRiskVo getDrugAgesRiskById(@Param("drugId")Integer drugId,@Param("agesId")Integer agesId);

    void addDrugAgesRisk(DrugAgesRisk drugAgesRisk);

    void updateDrugAgesRisk(DrugAgesRiskUd drugAgesRisk);

    void deleteDrugAgesRisk(@Param("drugId")Integer drugId,@Param("agesId")Integer agesId);

    List<IngreRiskVo> queryIngreRiskList(IngreRiskParam param);

    IngreRiskVo getIngreRiskById(@Param("ingredientId1")Integer ingredientId1,@Param("ingredientId2")Integer ingredientId2);

    void addIngreRisk(IngreRisk ingreRisk);

    void updateIngreRisk(IngreRiskUd ingreRiskUd);

    void deleteIngreRisk(@Param("ingredientId1")Integer ingredientId1,@Param("ingredientId2")Integer ingredientId2);
}
