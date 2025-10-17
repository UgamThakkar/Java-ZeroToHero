//WAP to count number of objects created.
package org.practice;

class Demo{
    int age;
    String course;

    //for static variable memory will be allocated only once unlike instance variables where new variables are created for every/each/different objects
    static int count;

    //everytime a constructor is called a nonstatic block of code is executed before the constructor gets executed. SO for our case this block will be executed 4 times.
    {
        count++;
    }

    Demo(){
        age=25;
        course = "Java Spring Boot A-Z";
    }

    Demo(int age){
        this.age = age;
        course="Java Spring Boot Zero to Hero";
    }

    Demo(int age, String course){
        this.age = age;
        this.course = course;
    }
    void display(){
        System.out.println("Age is: " +age);
        System.out.println("Course is: " +course);
    }
}

public class LaunchStatic2 {
    public static void main(String[] args){
        Demo d1 = new Demo();
        System.out.println("Count: "+d1.count);
        Demo d2 = new Demo();
        System.out.println("Count: "+d2.count);
        Demo d3 = new Demo(20);
        System.out.println("Count: "+d3.count);
        Demo d4 = new Demo(20, "First Course");
        System.out.println("Count: "+d4.count);
    }
}
