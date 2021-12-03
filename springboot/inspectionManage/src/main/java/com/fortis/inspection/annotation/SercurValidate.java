package com.fortis.inspection.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SercurValidate {
    String value() default "";
    SercurValidateEnum type() default SercurValidateEnum.SELECT;
}
