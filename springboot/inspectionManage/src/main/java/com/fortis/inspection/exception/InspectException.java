package com.fortis.inspection.exception;

public class InspectException extends RuntimeException {
    private static final long serialVersionUID = -3201369495680296913L;

    private InspectExceptionTypeEnum insExceptionType = InspectExceptionTypeEnum.ERROR_SYSTEM;

    private Object param;

    public InspectException(InspectExceptionTypeEnum insExceptionType, String msg){
        super(msg);
        this.insExceptionType = insExceptionType;
        this.param = "";
    }

    public InspectException(InspectExceptionTypeEnum insExceptionType, String msg, Exception exception){
        super(msg,exception);
        this.insExceptionType = insExceptionType;
        this.param = "";
    }

    public InspectException(InspectExceptionTypeEnum insExceptionType){
        this.insExceptionType = insExceptionType;
        this.param = "";
    }

    public InspectException(InspectExceptionTypeEnum insExceptionType, Object param){
        this.insExceptionType = insExceptionType;
        this.param = param;
    }

    public InspectExceptionTypeEnum getInsExceptionType() {
        return this.insExceptionType;
    }

    public String getParam() {
        return this.param.toString();
    }
}
