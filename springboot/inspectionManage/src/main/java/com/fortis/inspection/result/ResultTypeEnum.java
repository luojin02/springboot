package com.fortis.inspection.result;

public enum ResultTypeEnum {
    SUCCESS(Integer.valueOf(0),"成功"),
    ERROR(Integer.valueOf(-1),"失败"),
    USER_NOT_EXIST(Integer.valueOf(-10001),"用户不存在"),
    USERACCT_IS_EMPTY(Integer.valueOf(-10002),"用户账号为空"),
    PASS_IS_EMPTY(Integer.valueOf(-10003),"用户密码为空"),
    USER_FORBIDDEN(Integer.valueOf(-10004),"用户被禁用"),
    NOT_LOGIN_OR_SESSION_TIMEOUT(Integer.valueOf(403),"未登录或会话超时"),
    DATA_IS_NULL(Integer.valueOf(-10005),"数据为空"),
    PARAM_IS_EMPTY(Integer.valueOf(-10006),"参数为空"),
    HAVE_DRUG(Integer.valueOf(-10006),"该药品类下包含药品，不可删除");;

    private ResultTypeEnum(Integer code, String msg){
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
