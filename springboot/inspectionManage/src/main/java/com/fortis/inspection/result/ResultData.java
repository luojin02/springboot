package com.fortis.inspection.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("返回结果实体")
public class ResultData<T> implements Serializable {

    private static final long serialVersionUID = -8407212994701576978L;

    @ApiModelProperty(value = "总数")
    private Integer count;

    @ApiModelProperty("返回数据")
    private T data;

    @ApiModelProperty("状态码")
    private Integer code;

    @ApiModelProperty("说明")
    private String msg;

    public ResultData(Integer code, String msg, T data, Integer count){
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static <T> ResultData<T> success(){
        return new ResultData<>(ResultTypeEnum.SUCCESS.getCode(), ResultTypeEnum.SUCCESS.getMsg(),null,Integer.valueOf(0));
    }

    public static <T> ResultData<T> success(T data){
        return new ResultData<>(ResultTypeEnum.SUCCESS.getCode(), ResultTypeEnum.SUCCESS.getMsg(),data,Integer.valueOf(0));
    }

    public static <T> ResultData<T> success(T data, Integer count){
        return new ResultData<>(ResultTypeEnum.SUCCESS.getCode(), ResultTypeEnum.SUCCESS.getMsg(),data,count);
    }

    public static <T> ResultData<T> fail(ResultTypeEnum inspectExceptionType) {
        return new ResultData<>(inspectExceptionType.getCode(), inspectExceptionType.getMsg(), null, Integer.valueOf(0));
    }

    public static <T> ResultData<T> fail(Integer code, T data) {
        return new ResultData<>(code, "", data, Integer.valueOf(0));
    }

    public static <T> ResultData<T> fail(Integer code,String msg, T data) {
        return new ResultData<>(code, msg, data, Integer.valueOf(0));
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
