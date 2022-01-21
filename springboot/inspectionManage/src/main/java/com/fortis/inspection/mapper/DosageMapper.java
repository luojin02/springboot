package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.dosage.*;
import com.fortis.inspection.model.dosage.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DosageMapper {

    List<FreqVo> queryFreqList(FreqParam param);

    FreqVo getFreqById(Integer freqId);

    void addFreq(Freq freq);

    void updateFreq(FreqUd freq);

    void deleteFreq(Integer freqId);

    List<AgesclassVo> queryAgesclassList(AgesclassParam param);

    AgesclassVo getAgesclassById(Integer agesclassId);

    void addAgesclass(Agesclass agesclass);

    void updateAgesclass(AgesclassUd agesclass);

    void deleteAgesclass(Integer agesclassId);

    List<AgesVo> queryAgesList(AgesParam param);

    AgesVo getAgesById(Integer agesId);

    void addAges(Ages ages);

    void updateAges(AgesUd ages);

    void deleteAges(Integer agesId);

    List<DosageDiseaAgesVo> queryDosageDiseaAgesList(DosageDiseaAgesParam param);

    DosageDiseaAgesVo getDosageDiseaAgesById(@Param("drugId")Integer drugId,
                                             @Param("specId")Integer specId,
                                             @Param("diseaseId")Integer diseaseId,
                                             @Param("agesId")Integer agesId);

    void addDosageDiseaAges(DosageDiseaAges dosageAges);

    void updateDosageDiseaAges(DosageDiseaAgesUd dosageAges);

    void deleteDosageDiseaAges(@Param("drugId")Integer drugId,
                               @Param("specId")Integer specId,
                               @Param("diseaseId")Integer diseaseId,
                               @Param("agesId")Integer agesId);

    List<DosageDiseaWeightVo> queryDosageDiseaWeightList(DosageDiseaWeightParam param);

    DosageDiseaWeightVo getDosageDiseaWeightById(@Param("drugId")Integer drugId,
                                                 @Param("specId")Integer specId,
                                                 @Param("diseaseId")Integer diseaseId,
                                                 @Param("minWeight")Float minWeight,
                                                 @Param("maxWeight")Float maxWeight);

    void addDosageDiseaWeight(DosageDiseaWeight dosageWeight);

    void updateDosageDiseaWeight(DosageDiseaWeightUd dosageWeight);

    void deleteDosageDiseaWeight(@Param("drugId")Integer drugId,
                                 @Param("specId")Integer specId,
                                 @Param("diseaseId")Integer diseaseId,
                                 @Param("minWeight")Float minWeight,
                                 @Param("maxWeight")Float maxWeight);

    List<DosageDiseaAgesWeightVo> queryDosageDiseaAgesWeightList(DosageDiseaAgesWeightParam param);


    DosageDiseaAgesWeightVo getDosageDiseaAgesWeightById(@Param("drugId")Integer drugId,
                                                         @Param("specId")Integer specId,
                                                         @Param("diseaseId")Integer diseaseId,
                                                         @Param("agesId")Integer agesId,
                                                         @Param("minWeight")Float minWeight,
                                                         @Param("maxWeight")Float maxWeight);

    void adDosageDiseaAgesWeight(DosageDiseaAgesWeight dosageDisease);

    void updateDosageDiseaAgesWeight(DosageDiseaAgesWeightUd dosageDisease);

    void deleteDosageDiseaAgesWeight(@Param("drugId")Integer drugId,
                                     @Param("specId")Integer specId,
                                     @Param("diseaseId")Integer diseaseId,
                                     @Param("agesId")Integer agesId,
                                     @Param("minWeight")Float minWeight,
                                     @Param("maxWeight")Float maxWeight);

}
