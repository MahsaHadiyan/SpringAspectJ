package org.githhub.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.09   Mahsa
 */
@Aspect
@Component
public class TrackOperation3 {


    @Pointcut("execution(* Operation3.*(..))")
    public void abcPointcut(){}

    @Around("abcPointcut()")
    public Object myadvice(ProceedingJoinPoint pjp) throws Throwable
    {
        System.out.println("Additional Concern Before calling actual method");
        Object obj=pjp.proceed();
        System.out.println("Additional Concern After calling actual method");
        return obj;
    }
}
