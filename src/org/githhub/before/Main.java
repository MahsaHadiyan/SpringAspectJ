package org.githhub.before;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Operation operation = (Operation) Spring.getBean("operation");
        System.out.println("calling msg...");
        operation.msg();
        System.out.println("calling m...");
        operation.m();
        System.out.println("calling k...");
        operation.k();
    }
}
