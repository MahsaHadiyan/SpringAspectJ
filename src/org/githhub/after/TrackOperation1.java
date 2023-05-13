package org.githhub.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
public class TrackOperation1 {

    @Pointcut("execution(* org.githhub.after.Operation1.m*(..))")
    public void aditionalConcern(){}//pointcut name

    @After("aditionalConcern()")//applying pointcut on before advice
    public void myadvice(JoinPoint jp)//it is advice (before advice)
    {
        System.out.println("additional concern after");
        //System.out.println("Method Signature: "  + jp.getSignature());
    }
}
