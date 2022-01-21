package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.drug.*;
import com.fortis.inspection.model.drug.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugMapper {

    List<DrugVo> queryDrugList(DrugParam param);

    DrugVo getDrugById(Integer drugId);

    void addDrug(Drug drug);

    void deleteDrug(Integer drugId);

    void updateDrug(DrugUd drug);

    List<DrugclassVo> queryDrugclassList(DrugclassParam param);

    DrugclassVo getDrugclassById(Integer drugclassId);

    void addDrugclass(Drugclass drugclass);

    void updateDrugclass(DrugclassUd drug);

    Integer selectHaveDrug(Integer drugclassId);
    void deleteDrugclass(Integer drugclassId);



    List<IngredientVo> queryIngredientList(IngredientParam param);

    IngredientVo getIngredientById(Integer ingredientId);

    void addIngredient(Ingredient ingredient);

    void updateIngredient(IngredientUd ingredient);

    void deleteIngredient(Integer ingredientId);

    List<DrugIngrdtVo> queryDrugIngrdtList(DrugIngrdtParam param);

    DrugIngrdtVo getDrugIngrdtById(Integer drugIngrdtId);

    void addDrugIngrdt(DrugIngrdt drugIngrdt);

    void updateDrugIngrdt(DrugIngrdtUd drugIngrdt);

    void deleteDrugIngrdt(Integer drugIngrdtId);
}
