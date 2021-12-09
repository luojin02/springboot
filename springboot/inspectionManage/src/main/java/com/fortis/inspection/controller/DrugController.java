package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.drug.*;
import com.fortis.inspection.model.drug.*;
import com.fortis.inspection.result.Result;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.DrugService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("drug")
@Api(description = "药品信息管理")
@CrossOrigin
public class DrugController {

    private Logger logger = LoggerFactory.getLogger(DrugController.class);

    @Autowired
    private DrugService drugService;

    @PostMapping("drugList")
    @ApiOperation(value = "分页查询药品")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DrugVo>> queryDrugList(@Validated @RequestBody DrugParam param){
        PageInfo<DrugVo> pageInfo = drugService.queryDrugList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDrug")
    @ApiOperation(value = "根据ID查询药品")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DrugVo> getDrugById(@ApiParam(name = "drugId", value = "药品ID", required = true) @RequestParam Integer drugId){
        DrugVo drug = drugService.getDrugById(drugId);
        return ResultData.success(drug);
    }

    @PostMapping("addDrug")
    @ApiOperation(value = "新增药品")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addDrug(@Validated @RequestBody Drug drug){
        drugService.addDrug(drug);
        return Result.success();
    }

    @PostMapping("deleteDrug")
    @ApiOperation(value = "删除某个药品")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteDrug(@ApiParam(name = "drugId", value = "药品ID", required = true) @RequestParam Integer drugId){
        drugService.deleteDrug(drugId);
        return Result.success();
    }

    @PostMapping("updateDrug")
    @ApiOperation(value = "更新某个药品")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateDrug(@Validated @RequestBody DrugUd drug){
        drugService.updateDrug(drug);
        return Result.success();
    }

    /** 药品分类 **/
    @PostMapping("drugclassList")
    @ApiOperation(value = "分页查询药品分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DrugclassVo>> queryDrugclassList(@Validated @RequestBody DrugclassParam param){
        PageInfo<DrugclassVo> pageInfo = drugService.queryDrugclassList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDrugclass")
    @ApiOperation(value = "根据ID查询药品分类")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DrugclassVo> getDrugclassById(@ApiParam(name = "drugclassId", value = "药品分类ID", required = true) @RequestParam Integer drugclassId){
        DrugclassVo drugclass = drugService.getDrugclassById(drugclassId);
        return ResultData.success(drugclass);
    }

    @PostMapping("addDrugclass")
    @ApiOperation(value = "新增药品分类")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addDrugclass(@Validated @RequestBody Drugclass drugclass){
        drugService.addDrugclass(drugclass);
        return Result.success();
    }

    @PostMapping("updateDrugclass")
    @ApiOperation(value = "更新某个药品分类")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateDrugclass(@Validated @RequestBody DrugclassUd drugclass){
        drugService.updateDrugclass(drugclass);
        return Result.success();
    }

    @PostMapping("deleteDrugclass")
    @ApiOperation(value = "删除某个药品分类")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteDrugclass(@ApiParam(name = "drugclassId", value = "药品分类ID", required = true) @RequestParam Integer drugclassId){
        return drugService.deleteDrugclass(drugclassId);
    }

    //todo 药品分类-药品关系

    /** 成分 **/
    @PostMapping("ingredientList")
    @ApiOperation(value = "分页查询成分")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<IngredientVo>> queryIngredientList(@Validated @RequestBody IngredientParam param){
        PageInfo<IngredientVo> pageInfo = drugService.queryIngredientList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getIngredient")
    @ApiOperation(value = "根据ID查询成分")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<IngredientVo> getIngredientById(@ApiParam(name = "ingredientId", value = "成分ID", required = true) @RequestParam Integer ingredientId){
        IngredientVo ingredient = drugService.getIngredientById(ingredientId);
        return ResultData.success(ingredient);
    }

    @PostMapping("addIngredient")
    @ApiOperation(value = "新增成分")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addIngredient(@Validated @RequestBody Ingredient ingredient){
        drugService.addIngredient(ingredient);
        return Result.success();
    }

    @PostMapping("updateIngredient")
    @ApiOperation(value = "更新某个成分")
    @SercurValidate(type = SercurValidateEnum.UPDATE)
    public Result updateIngredient(@Validated @RequestBody IngredientUd ingredient){
        drugService.updateIngredient(ingredient);
        return Result.success();
    }

    @PostMapping("deleteIngredient")
    @ApiOperation(value = "删除某个成分")
    @SercurValidate(type = SercurValidateEnum.DELETE)
    public Result deleteIngredient(@ApiParam(name = "ingredientId", value = "成分ID", required = true) @RequestParam Integer ingredientId){
        drugService.deleteIngredient(ingredientId);
        return Result.success();
    }

    /** 药品成分 **/
    @PostMapping("drugIngrdtList")
    @ApiOperation(value = "分页查询药品成分")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<PageInfo<DrugIngrdtVo>> queryDrugIngrdtList(@Validated @RequestBody DrugIngrdtParam param){
        PageInfo<DrugIngrdtVo> pageInfo = drugService.queryDrugIngrdtList(param);
        return ResultData.success(pageInfo);
    }

    @PostMapping("getDrugIngrdt")
    @ApiOperation(value = "根据ID查询药品成分")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<DrugIngrdtVo> getDrugIngrdtById(@ApiParam(name = "drugIngrdtId", value = "药品成分ID", required = true) @RequestParam Integer drugIngrdtId){
        DrugIngrdtVo drugIngrdt = drugService.getDrugIngrdtById(drugIngrdtId);
        return ResultData.success(drugIngrdt);
    }

    @PostMapping("addDrugIngrdt")
    @ApiOperation(value = "新增药品成分")
    @SercurValidate(type = SercurValidateEnum.INSERT)
    public Result addDrugIngrdt(@Validated @RequestBody DrugIngrdt drugIngrdt){
        drugService.addDrugIngrdt(drugIngrdt);
        return Result.success();
    }

}
