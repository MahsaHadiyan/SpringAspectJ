package org.githhub.after;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Operation1 operation = (Operation1) Spring.getBean("operation1");
        System.out.println("calling msg...");
        operation.msg();
        System.out.println("calling m...");
        operation.m();
        System.out.println("calling k...");
        operation.k();
    }
}
