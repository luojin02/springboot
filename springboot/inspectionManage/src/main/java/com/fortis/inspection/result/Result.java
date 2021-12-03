package com.fortis.inspection.result;

import java.io.Serializable;

public class Result implements Serializable {

    private static final long serialVersionUID = 6172472940894374032L;

    private Integer code;

    private String msg;

    public Result(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public static Result success(){
        return new Result(ResultTypeEnum.SUCCESS.getCode(), ResultTypeEnum.SUCCESS.getMsg());
    }

    public static Result fail(ResultTypeEnum type){
        return new Result(type.getCode(),type.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
