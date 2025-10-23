package org.practice;

class Animal{
    public void eat(){
        System.out.println("Animal Eats");
    }
    public void sleep(){
        System.out.println("Animal Sleeps");
    }
}

class Lion extends Animal{
    public void eat(){
        System.out.println("Lion Eats");
    }
    public void sleep(){
        System.out.println("Lion Sleeps");
    }
}

class Deer extends Animal{
    public void eat(){
        System.out.println("Deer Eats");
    }
    public void sleep(){
        System.out.println("Deer Sleeps");
    }
}

class Forest{
    public void permits(Animal animal){
        animal.eat();
        animal.sleep();
    }
}

public class LaunchPoly1 {
    public static void main(String[] args){
        Lion lion = new Lion();
        Deer deer = new Deer();
        Forest f = new Forest();
        f.permits(lion);
        f.permits(deer);
    }
}
