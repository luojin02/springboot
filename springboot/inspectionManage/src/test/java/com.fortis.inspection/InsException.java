package com.fortis.inspection;

public class InsException extends RuntimeException {
    private static final long serialVersionUID = -3201369495680296913L;

    private InsExceptionType insExceptionType = InsExceptionType.ERROR_SYSTEM;

    private Object param;

    public InsException(InsExceptionType type,String msg){
        super(msg);
        this.insExceptionType = type;
        this.param = "";
    }

    public InsException(InsExceptionType type,String msg,Exception exception){
        super(msg,exception);
        this.insExceptionType = type;
        this.param = "";
    }

    public InsException(InsExceptionType type){
        this.insExceptionType = type;
        this.param = "";
    }

    public InsException(InsExceptionType type,Object param){
        this.insExceptionType = type;
        this.param = param;
    }

    public InsExceptionType getInsExceptionType() {
        return this.insExceptionType;
    }

    public String getParam() {
        return this.param.toString();
    }
}
