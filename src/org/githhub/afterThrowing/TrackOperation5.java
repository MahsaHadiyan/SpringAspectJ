package org.githhub.afterThrowing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.09   Mahsa
 */
@Aspect
@Component
public class TrackOperation5 {


    @AfterThrowing(
            pointcut = "execution(* Operation5.*(..))",
            throwing= "error")

    public void myadvice(JoinPoint jp,Throwable error)//it is advice
    {
        System.out.println("additional concern");
        System.out.println("Method Signature: "  + jp.getSignature());
        System.out.println("Exception is: "+error);
        System.out.println("end of after throwing advice...");
    }
}
