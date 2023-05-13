package org.githhub.afterReturning;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Operation2 operation = (Operation2) Spring.getBean("operation2");
        System.out.println("calling m...");
        operation.m();
        System.out.println("calling k...");
        operation.k();
    }
}
