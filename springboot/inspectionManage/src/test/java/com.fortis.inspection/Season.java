package com.fortis.inspection;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public enum Season {

    A(1,"a"),
    B(2,"b"),
    C(3,"c"),
    D(4,"d");

    private int cate;

    private String type;

    private Season(){}

    private Season(int cate,String type){
        this.cate = cate;
        this.type = type;
    }

    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(int cate){
        if(Objects.isNull(cate)){
            return "";
        }
        for (Season o : values()) {
            if(o.getCate()==cate){
                return o.getType();
            }
        }
        return "";
    }
}


