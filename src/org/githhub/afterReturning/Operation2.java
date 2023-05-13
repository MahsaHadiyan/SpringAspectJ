package org.githhub.afterReturning;

import org.springframework.stereotype.Component;

/**
 * Revision History:
 * Date            Author           Task ID                         Notes
 * ==========   =================   ==============  ===============================================
 * 2023.05.09   Mahsa.Hadiyan
 */
@Component
public class Operation2 {
    public int m(){System.out.println("m() method invoked");return 2;}
    public int k(){System.out.println("k() method invoked");return 3;}
}
