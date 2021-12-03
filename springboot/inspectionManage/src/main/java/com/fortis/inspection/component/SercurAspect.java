package com.fortis.inspection.component;

import com.fortis.inspection.model.UserVo;
import com.fortis.inspection.result.ResultData;
import com.fortis.inspection.result.ResultTypeEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
@Aspect
public class SercurAspect {

    @Pointcut("@annotation(com.fortis.inspection.annotation.SercurValidate)")
    public void pointcut() {}

    @Around("pointcut()")
    public Object invoke(ProceedingJoinPoint point) throws Throwable {
        //获取目标方法的参数信息
        Object[] args = point.getArgs();
        //获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        HttpSession session = request.getSession();
        UserVo user =(UserVo) session.getAttribute("userSession");
        /*if(ObjectUtils.isEmpty(user)){
            return ResultData.fail(ResultTypeEnum.NOT_LOGIN_OR_SESSION_TIMEOUT.getCode(),ResultTypeEnum.NOT_LOGIN_OR_SESSION_TIMEOUT.getMsg(),null);
        }*/
        return point.proceed();       //执行目标方法
    }

}
