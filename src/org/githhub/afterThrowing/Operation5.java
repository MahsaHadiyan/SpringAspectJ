package org.githhub.afterThrowing;

import org.springframework.stereotype.Component;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.09   Mahsa.Hadiyan
 */
@Component
public class Operation5 {
    public void validate(int age)throws Exception{
        if(age<18){
            throw new ArithmeticException("Not valid age");
        }
        else{
            System.out.println("Thanks for vote");
        }
    }
}
