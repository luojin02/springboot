package com.fortis.inspection.util;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * 时间工具类
 *
 */
public class DateTimeUtil {

    /**
     * 定义私有构造函数，防止类被实例化
     */
    private DateTimeUtil() {
    }

    /**
     * 根据出生日期计算年龄，精确到月份
     *
     * @param date 出生日期
     * @return 返回年龄和月份，如26-4
     */
    public static String getAgeDetail(String date) {
        int index = date.indexOf(" ");
        if (index != -1) {
            date = date.substring(0, index);
        }
        String[] data = date.split("-");
        Calendar birthday = new GregorianCalendar(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        Calendar now = Calendar.getInstance();

        int day = now.get(Calendar.DAY_OF_MONTH) - birthday.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1 - birthday.get(Calendar.MONTH);
        int year = now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        if (day < 0) {
            month -= 1;
            now.add(Calendar.MONTH, -1);//得到上一个月，用来得到上个月的天数。
            day = day + now.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        if (month < 0) {
            month = (month + 12) % 12;
            year--;
        }
        return year + "-" + month;
    }


    /**
     * 根据出生日期获取年龄
     *
     * @param birthDay 出生日期字符串
     * @return 根据出生日期获取年龄
     */
    public static int getAge(String birthDay) {
        return getAge(parseDate(birthDay));
    }

    /**
     * 根据出生日期获取年龄
     *
     * @param birthDay 出生日期
     * @return 根据出生日期获取年龄
     */
    public static int getAge(Date birthDay) {
        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                //当前日期在生日之前，年龄减一
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                //当前月份在生日之前，年龄减一
                age--;
            }
        }
        return age;
    }

    /**
     * 根据年龄和月份，计算出生日期
     */
    public static String getBirthDay(int age, int month) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -age);
        cal.add(Calendar.MONTH,  -month);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return dateToStr(cal.getTime());
    }

    /**
     * 时间转字符串
     *
     * @param date    date时间
     * @param pattern 时间格式
     * @return 指定格式的字符串时间
     */
    public static String dateToString(Date date, String pattern) {
        if (Objects.isNull(date)) {
            return "";
        }
        if (Objects.isNull(pattern)) {
            pattern = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static String dateToString(LocalDate date, String pattern) {
        if (ObjectUtils.isEmpty(date)) {
            return "";
        }
        if (ObjectUtils.isEmpty(pattern)) {
            pattern = "yyyy-MM-dd";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(date);
    }

    /**
     * 时间转年-月-日
     *
     * @param date date时间
     * @return "yyyy-MM-dd"形式的字符串日期
     */
    public static String getDateString(Date date) {
        return dateToString(date, "yyyy-MM-dd");
    }

    /**
     * 时间转年-月-日 时:分:秒
     *
     * @param date date时间
     * @return "yyyy-MM-dd HH:mm:ss"形式的字符串时间
     */
    public static String getDateTimeString(Date date) {
        return dateToString(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 当前年-月-日
     *
     * @return "yyyy-MM-dd"形式的字符串日期
     */
    public static String getCurrentDateString() {
        return dateToString(new Date(), "yyyy-MM-dd");
    }

    /**
     * 当前年-月-日 时:分:秒
     *
     * @return "yyyy-MM-dd HH:mm:ss"形式的字符串时间
     */
    public static String getCurrentDateTimeString() {
        return dateToString(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 时间字符串转Date
     * 年-月-日 时:分:秒
     *
     * @param dateTime 字符串时间
     * @return Date格式的时间
     */
    public static Date parseDateTime(String dateTime) {
        if (StringUtils.isEmpty(dateTime)) {
            return null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = null;
            try {
                parse = sdf.parse(dateTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return parse;
        }
    }

    /**
     * 时间字符串转Date
     * 年-月-日
     *
     * @param date 字符串日期
     * @return Date格式的日期
     */
    public static Date parseDate(String date) {
        if (StringUtils.isEmpty(date)) {
            return new Date();
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = null;
            try {
                parse = sdf.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return parse;
        }
    }

    public static String dateToStr(Date date) {
        return dateToStr(date, "yyyy-MM-dd");
    }

    public static String dateToStr(Date date, String format) {
        if (Objects.isNull(date)) {
            return "";
        } else {
            SimpleDateFormat df = new SimpleDateFormat(format);
            return df.format(date);
        }
    }
}
