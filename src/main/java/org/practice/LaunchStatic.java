package org.practice;

public class LaunchStatic {
    static int a;
    static{
        a=30;
        System.out.println("Static block executed before main");
    }

    public static void main(String[] args){
        System.out.println("a: " +a);
    }
}
