package com.fortis.inspection.component;

import com.fortis.inspection.annotation.SercurValidate;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SercurAspect {

    @Pointcut("execution(public * com.fortis.inspection.controller..*(..))")
    public void login() {
    }

    @Before("login() && @annotation(sv)")
    public void demoBefore(JoinPoint joinPoint, SercurValidate sv) {
        System.out.println("@before 开始");
    }

    @After("login() && @annotation(sv)")
    public void demoAfter(JoinPoint joinPoint, SercurValidate sv) {
        //....
    }

    @AfterThrowing("login() && @annotation(sv)")
    public void demoAfterThrowing(JoinPoint joinPoint, SercurValidate sv) {
        //....
    }

    @Around("login() && @annotation(sv)")
    public Object demoAround(ProceedingJoinPoint pjp, SercurValidate sv) throws Throwable {

        System.out.println("@Around 开始校验。。。");
        Object[] args = pjp.getArgs();
        String username = (String) args[0];
        //其他校验太复杂了，就做点长度校验
        if (username != null && username.length() > 4 && username.length() < 20) {
            System.out.println("校验成功");
            return pjp.proceed();       //执行目标方法
        }
        /*System.out.println("校验失败,以访客登录");
        args[0] = sv.name();
        args[1] = sv.pwd();
        return pjp.proceed(args);*/
        return "校验失败,以访客登录";
    }


}
