package com.fortis.inspection.controller;

import com.fortis.inspection.annotation.SercurValidate;
import com.fortis.inspection.annotation.SercurValidateEnum;
import com.fortis.inspection.entity.test.ExportStock;
import com.fortis.inspection.model.SysMenuVo;
import com.fortis.inspection.model.UserVo;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.service.BaseService;
import com.fortis.inspection.util.*;
import io.swagger.annotations.*;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;
import java.util.*;

@RestController
@RequestMapping("base")
@Api(description = "基础接口")
@CrossOrigin
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private BaseService baseService;

    /*@Autowired
    private RedisUtil redisUtil;*/

    @PostMapping("login")
    @ApiOperation(value = "用户登录")
    public ResultData<UserVo> login(@ApiParam(name = "userAcct", value = "用户账号", required = true, example = "admin") @RequestParam String userAcct,
                                  @ApiParam(name = "userPasswd", value = "密码", required = true, example = "111111") @RequestParam String userPasswd,
                                    @ApiIgnore HttpSession session){
        return baseService.login(userAcct, userPasswd,session);
    }

    @PostMapping("menuData")
    @ApiOperation(value = "获取菜单")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public ResultData<List<SysMenuVo>> getMenuData(@ApiParam(name = "roleId", value = "角色ID", required = true, example = "2") @RequestParam Integer roleId){
        List<SysMenuVo> list = baseService.getMenuData(roleId);
        return ResultData.success(list);
    }

    @PostMapping("poi")
    @ApiOperation(value = "导出excel")
    @SercurValidate(type = SercurValidateEnum.SELECT)
    public void getPoi(HttpServletRequest request, HttpServletResponse response){

        //type(0-全部，1-西药，2-中药，3-医疗器械)
        //默认查询医疗器材
        //Integer clinicId = Integer.parseInt(request.getParameter("clinicId"));
        try {
            String fileName = URLEncoder.encode("药械盘存表", "UTF-8");
            response.setContentType("application/binary;charset=UTF-8");
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");

            ServletOutputStream out = response.getOutputStream();

            String[] titles = new String[]{"序号", "物品名称", "生产厂家", "医药公司", "规格", "单位", "平均进价", "当前库存数量", "当前库存金额"};

            HSSFWorkbook workbook = new HSSFWorkbook();

            //设置列宽
            HSSFSheet hssfSheet = workbook.createSheet("sheet1");
            hssfSheet.setColumnWidth(0, 5 * 256);
            hssfSheet.setColumnWidth(1, 25 * 256);
            hssfSheet.setColumnWidth(2, 30 * 256);
            hssfSheet.setColumnWidth(3, 30 * 256);
            hssfSheet.setColumnWidth(4, 25 * 256);
            hssfSheet.setColumnWidth(5, 10 * 256);
            hssfSheet.setColumnWidth(6, 10 * 256);
            hssfSheet.setColumnWidth(7, 15 * 256);
            hssfSheet.setColumnWidth(8, 15 * 256);
            //添加自定义表头
            //Clinic clinicInfo = clinicService.getClinicInfoByClinicId(clinicId);
            //设置表头字体
            HSSFFont nameFont = workbook.createFont();
            nameFont.setFontHeightInPoints((short) 20);     //设置字体大小
            nameFont.setFontName("宋体");
            HSSFCellStyle nameCellStyle = workbook.createCellStyle();
            nameCellStyle.setAlignment(HorizontalAlignment.CENTER);     //左右居中
            nameCellStyle.setFont(nameFont);

            HSSFRow name = hssfSheet.createRow(0);      //创建第一行
            name.setHeightInPoints(28);
            HSSFCell nameCell = name.createCell(0);      //创建第一列的cell
            nameCell.setCellValue("药械盘存表");
            nameCell.setCellStyle(nameCellStyle);

            //定点医院机构
            HSSFFont topFont = workbook.createFont();
            topFont.setFontHeightInPoints((short) 12);
            topFont.setFontName("宋体");
            HSSFCellStyle topCellStyle = workbook.createCellStyle();        //创建样式用HSSFWorkbook对象
            topCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);    //上下居中
            topCellStyle.setFont(topFont);

            HSSFRow top = hssfSheet.createRow(1);
            top.setHeightInPoints(20);
            HSSFCell topLeftCell = top.createCell(0);
            topLeftCell.setCellValue("诊所名称：" + ("xxx诊所"));
            topLeftCell.setCellStyle(topCellStyle);

            //盘存时间
            HSSFCell topRightCell = top.createCell(6);
            topRightCell.setCellValue("时间：" + DateTimeUtil.getDateString(new Date()));
            topRightCell.setCellStyle(topCellStyle);

            //设置列名
            HSSFFont titleFont = workbook.createFont();
            titleFont.setFontHeightInPoints((short) 12);
            titleFont.setFontName("宋体");
            HSSFCellStyle titleCellStyle = workbook.createCellStyle();
            titleCellStyle.setAlignment(HorizontalAlignment.CENTER);
            titleCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            titleCellStyle.setFont(titleFont);
            //加边框，打印才会有边框效果
            //下边框
            titleCellStyle.setBorderBottom(BorderStyle.THIN);
            //左边框
            titleCellStyle.setBorderLeft(BorderStyle.THIN);
            //上边框
            titleCellStyle.setBorderTop(BorderStyle.THIN);
            //右边框
            titleCellStyle.setBorderRight(BorderStyle.THIN);
            HSSFRow row = hssfSheet.createRow(2);
            row.setHeightInPoints(34);
            for (int i = 0, length = titles.length; i < length; i++) {
                HSSFCell titleCell = row.createCell(i);
                titleCell.setCellValue(titles[i]);
                titleCell.setCellStyle(titleCellStyle);
            }

            //写入每列数据
            HSSFFont rowFont = workbook.createFont();
            rowFont.setFontHeightInPoints((short) 10);
            rowFont.setFontName("宋体");
            HSSFCellStyle rowCellStyle = workbook.createCellStyle();
            //rowCellStyle.setWrapText(true)
            rowCellStyle.setFont(rowFont);
            rowCellStyle.setAlignment(HorizontalAlignment.CENTER);
            //加边框，打印才会有边框效果
            //下边框
            rowCellStyle.setBorderBottom(BorderStyle.THIN);
            //左边框
            rowCellStyle.setBorderLeft(BorderStyle.THIN);
            //上边框
            rowCellStyle.setBorderTop(BorderStyle.THIN);
            //右边框
            rowCellStyle.setBorderRight(BorderStyle.THIN);

            List<ExportStock> stocks = new ArrayList<>();
            ExportStock e1 = new ExportStock();
            e1.setGoodName("aa");
            e1.setMakerName("bb");
            e1.setCompanyName("cc");
            e1.setStandard("1ml");
            e1.setBaseUnit("盒");

            ExportStock e2 = new ExportStock();
            e2.setGoodName("cc");
            e2.setMakerName("dd");
            e2.setCompanyName("ce");
            e2.setStandard("2ml");
            e2.setBaseUnit("包");
            stocks.add(e1);
            stocks.add(e2);

            for (int i = 0, size = stocks.size(); i < size; i++) {
                row = hssfSheet.createRow(i + 3);
                row.setHeightInPoints(18);
                ExportStock stock = stocks.get(i);
                //序号
                HSSFCell rowCell0 = row.createCell(0);
                rowCell0.setCellValue(String.valueOf(i + 1));
                rowCell0.setCellStyle(rowCellStyle);
                //物品名称
                HSSFCell rowCell1 = row.createCell(1);
                rowCell1.setCellValue(stock.getGoodName());
                rowCell1.setCellStyle(rowCellStyle);
                //厂家
                HSSFCell rowCell2 = row.createCell(2);
                rowCell2.setCellValue(stock.getMakerName());
                rowCell2.setCellStyle(rowCellStyle);
                //医药公司
                HSSFCell rowCell3 = row.createCell(3);
                rowCell3.setCellValue(stock.getCompanyName());
                rowCell3.setCellStyle(rowCellStyle);
                //规格
                HSSFCell rowCell4 = row.createCell(4);
                rowCell4.setCellValue(stock.getStandard());
                rowCell4.setCellStyle(rowCellStyle);
                //单位
                HSSFCell rowCell5 = row.createCell(5);
                String unitStr = stock.getBaseUnit();
                rowCell5.setCellValue(unitStr);
                rowCell5.setCellStyle(rowCellStyle);
                //价格
                HSSFCell rowCell6 = row.createCell(6);
                String priceStr = "12";
                rowCell6.setCellValue(priceStr);
                rowCell6.setCellStyle(rowCellStyle);
                //当前库存数量
                HSSFCell rowCell7 = row.createCell(7);
                String countStr = "123";
                rowCell7.setCellValue(countStr);
                rowCell7.setCellStyle(rowCellStyle);

                //当前库存金额
                HSSFCell rowCell8 = row.createCell(8);
                float currentMoney = 121;
                rowCell8.setCellValue(StringUtil.removeNumberZero(String.format("%.5f", currentMoney)));
                rowCell8.setCellStyle(rowCellStyle);
            }

            //合并单元格
            CellRangeAddress craName = new CellRangeAddress(0, 0, 0, 8);        //起始行、末行、起始列、末列
            CellRangeAddress craTopLeft = new CellRangeAddress(1, 1, 0, 5);
            CellRangeAddress craTopRight = new CellRangeAddress(1, 1, 6, 8);
            hssfSheet.addMergedRegion(craName);
            hssfSheet.addMergedRegion(craTopLeft);
            hssfSheet.addMergedRegion(craTopRight);

            //将文件输出到客户端浏览器
            try {
                workbook.write(out);
                out.flush();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
                throw new IndexOutOfBoundsException();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new IndexOutOfBoundsException();
        }
    }



}
