package com.lt.selfannotation.config;

import com.lt.selfannotation.annotation.SysLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author 林石华啊
 */
@Aspect
@Component
public class SysLogAspect {
    @Pointcut("@annotation(com.lt.selfannotation.annotation.SysLog)")
    public void logPointCut(){
    }
    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //方法返回结果
        Object result = joinPoint.proceed();
        //执行时长
        long time = System.currentTimeMillis() - beginTime;
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //获取自定义注解上的值
        SysLog sysLog = method.getAnnotation(SysLog.class);
        //获取调用的类名方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        //方法入参
        Object[] args = joinPoint.getArgs();
        System.out.println("注解上的值: "+ sysLog.value());
        System.out.println("执行时间: " + time);
        System.out.println("执行的类和方法: " + className + "." + methodName + "()");
        return result;
    }
}
