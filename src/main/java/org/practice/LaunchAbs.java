package org.practice;

abstract class Animal2{
    public abstract void eat();
    public abstract void sleep();
}

class Lion2 extends Animal2{
    public void eat(){
        System.out.println("Lion Eats");
    }
    public void sleep(){
        System.out.println("Lion Sleeps");
    }
}

class Deer2 extends Animal2{
    public void eat(){
        System.out.println("Deer Eats");
    }
    public void sleep(){
        System.out.println("Deer Sleeps");
    }
}

class Forest2{
    public void permits(Animal2 animal){
        animal.eat();
        animal.sleep();
    }
}

public class LaunchAbs {
    public static void main(String[] args){
        Lion2 lion = new Lion2();
        Deer2 deer = new Deer2();
        Forest2 f = new Forest2();
        f.permits(lion);
        f.permits(deer);
    }
}
