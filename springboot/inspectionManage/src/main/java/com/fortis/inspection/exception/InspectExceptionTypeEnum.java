package com.fortis.inspection.exception;

public enum InspectExceptionTypeEnum {
    SUCCESS(Integer.valueOf(0),"成功"),
    NORMAL_ERROR(Integer.valueOf(-1),"失败"),
    ERROR_SYSTEM(Integer.valueOf(-900),"系统错误"),
    PARAM_IS_EMPTY(Integer.valueOf(-901),"参数为空");

    private InspectExceptionTypeEnum(Integer code, String msg){
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
