package com.fortis.inspection.util;

import java.util.Calendar;

/**
 * 字符串工具类
 *
 * @author 李许
 */
public class StringUtil {

  private StringUtil() {

  }

  public static String random32(Integer clinicId) {
    Calendar calendar = Calendar.getInstance();
    String year = String.valueOf(calendar.get(Calendar.YEAR));
    String month = (calendar.get(Calendar.MONTH) + 1) < 10 ? "0" + (calendar.get(Calendar.MONTH) + 1) : String.valueOf((calendar.get(Calendar.MONTH) + 1));
    String day = calendar.get(Calendar.DAY_OF_MONTH) < 10 ? "0" + calendar.get(Calendar.DAY_OF_MONTH) : String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
    String hour = calendar.get(Calendar.HOUR_OF_DAY) < 10 ? "0" + calendar.get(Calendar.HOUR_OF_DAY) : String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
    String minute = calendar.get(Calendar.MINUTE) < 10 ? "0" + calendar.get(Calendar.MINUTE) : String.valueOf(calendar.get(Calendar.MINUTE));
    String second = calendar.get(Calendar.SECOND) < 10 ? "0" + calendar.get(Calendar.SECOND) : String.valueOf(calendar.get(Calendar.SECOND));
    String timestamp = String.valueOf(calendar.getTimeInMillis());
    String clinicSign = String.valueOf(10000 + clinicId);
    return year + month + day + hour + minute + second + clinicSign + timestamp;
  }

  public static String removeNumberZero(String number) {
    String point = ".";
    if (number.indexOf(point) > 0) {
      //去掉后面无用的零
      number = number.replaceAll("0+?$", "");
      //如小数点后面全是零则去掉小数点
      number = number.replaceAll("[.]$", "");
    }
    return number;
  }

  public static void main(String[] args) {
    String s = removeNumberZero("0.00");
    System.out.println(s);
  }

}
