package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.diseaseSym.*;
import com.fortis.inspection.model.diseaseSym.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiseaseSymMapper {

    List<SymptomVo> querySymptomList(SymptomParam param);

    SymptomVo getSymptomById(Integer symptomId);

    void addSymptom(Symptom symptom);

    void updateSymptom(SymptomUd symptom);

    void deleteSymptom(Integer symptomId);

    List<DiseaseVo> queryDiseaseList(DiseaseParam param);

    DiseaseVo getDiseaseById(Integer diseaseId);

    void addDisease(Disease disease);

    void updateDisease(DiseaseUd disease);

    void deleteDisease(Integer diseaseId);

    List<DiseaseclassVo> queryDiseaseclassList(DiseaseclassParam param);

    DiseaseclassVo getDiseaseclassById(Integer diseaseclassId);

    void addDiseaseclass(Diseaseclass diseaseclass);

    void updateDiseaseclass(DiseaseclassUd diseaseclass);

    void deleteDiseaseclass(Integer diseaseclassId);
}
