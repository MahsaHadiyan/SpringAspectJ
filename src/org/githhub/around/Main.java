package org.githhub.around;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Operation3 operation = (Operation3) Spring.getBean("operation3");
        System.out.println("calling msg...");
        operation.msg();
        System.out.println("calling display...");
        operation.display();
    }
}
