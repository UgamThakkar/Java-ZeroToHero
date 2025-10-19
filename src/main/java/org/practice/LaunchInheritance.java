package org.practice;

class Human{
    int age;
    String name;
    void display(){
        System.out.println("Hi my name is: " + name + " and Age is: " +age);
    }
    void Hobbies(){
        System.out.println("I like to play cricket");
    }
}

class Son extends Human{
    Son(){
        age = 21;
        name="ugam";
    }
    void Hobbies(){
        System.out.println("My Hobbies are Swimming and Reading");
    }

}

public class LaunchInheritance {
    public  static  void  main(String[] args){
        Son s = new Son();
        s.Hobbies();
        s.display();
    }
}
