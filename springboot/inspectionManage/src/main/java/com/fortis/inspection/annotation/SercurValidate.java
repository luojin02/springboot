package com.fortis.inspection.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SercurValidate {
    String name() default  "visitor";
    String pwd() default "123456";
}
