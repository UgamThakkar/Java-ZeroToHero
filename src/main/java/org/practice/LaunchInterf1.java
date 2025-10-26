package org.practice;

interface calc{
    //by default all the methods in an interface are public abstract meaning here the add method after declaration becomes public abstract void add();
    void add(int n1, int n2);
    public abstract void disp();
}
class Telusko{
    public void learn(){
        System.out.println("Telusko Java Learning");
    }
}

// a class can extend another class and implement an interface both at the same time
// as all the methods inside an interface are public abstract we either have to provide the implmentation for the methods or declare this class as abstract as well.
class myCalc1 extends Telusko implements calc{
    int res;
    public void add(int n1, int n2) {
        res = n1+n2;
        System.out.println("Addition is: " +res);
    }

    public void disp(){
        System.out.println("Displaying results");
    }
}

public class LaunchInterf1 {
    public static void main(String[] args){
        myCalc1 c1 = new myCalc1();
        c1.add(4,6);
        c1.disp();
        c1.learn();
    }
}
