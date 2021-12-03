package com.fortis.inspection;

public enum InsExceptionType {
    ERROR_OK(Integer.valueOf(0),"成功"),
    NORMAL_ERROR(Integer.valueOf(-1),"失败"),
    ERROR_SYSTEM(Integer.valueOf(-999),"系统错误");

    private InsExceptionType(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    private String msg;

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
