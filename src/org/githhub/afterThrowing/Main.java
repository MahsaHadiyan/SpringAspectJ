package org.githhub.afterThrowing;


public class Main {
    public static void main(String[] args) throws Exception {
        Operation5 operation = (Operation5) Spring.getBean("operation5");
        operation.validate(12);
    }
}
