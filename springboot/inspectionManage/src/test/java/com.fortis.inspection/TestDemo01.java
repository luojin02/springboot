package com.fortis.inspection;

import org.junit.Test;

import java.util.Objects;

public class TestDemo01 {

    @Test
    public void test01(){
        String type = Season.A.getType(2);
        System.out.println(type);
    }

    @Test
    public void test02(){

        Integer a = null;
        if(Objects.isNull(a)){
            throw new InsException(InsExceptionType.NORMAL_ERROR);
        }

    }
}
