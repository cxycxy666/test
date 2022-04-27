package com.app.controller;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    @Pointcut(value = "execution( * com.app.controller.*.*(..))")
    public void Pointcut(){

    }

    @Around("Pointcut()")
    public Object myPointcut(ProceedingJoinPoint pjp) throws Throwable {

        String s = pjp.getTarget().getClass().toString();
        String s1 = pjp.getSignature().getName().toString();
        System.out.println("调用前"+s);
        Object proceed = pjp.proceed();
        System.out.println("调用后"+s1);
        return proceed;
    }
}
