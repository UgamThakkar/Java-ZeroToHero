package org.practice;

import java.util.Scanner;

//two ways of creating threads in java
//1 -> extending the inbuilt Thread class but thats not the recommended way
//2 -> Implementing the Runnable Interface inbuilt in Java which has a Abstract run method.
// Now when we create multiple new threads in the main method then those method will only execute/do the activity mentioned inside this run method that we provide the implementation for from Runnable.
//if we dont mention anything inside the run method then even if we create multiple threads they wont execute anything.
class Alpha implements Runnable{
    public void run() {
            initiate();
    }

    public void initiate(){
        int acc_no = 1234;
        int password = 8421;
        int acc,pass;
        System.out.println("Enter Account number");
        //deliberate -> to check if after creating threads and giving the control to JVM does it wait for my input or the control actually directly goes to the other thread to save CPU resources.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Password");
        acc = scan.nextInt();
        pass = scan.nextInt();
        if(acc_no == acc && pass == password){
            System.out.println("collect cash");
        }
    }
}

class Beta implements Runnable{
    public void run() {
        Info();
    }

    public void Info(){
        System.out.println("Weather info - Snow Predicted in Toronto Today");
    }
}

public class LaunchMultithreading1 {
    public static void main(String[] args){
//        the way of creating threads when implementing the Runnable interface is
//        first we create the object of the class. Then we create a new thread using inbult Thread class and pass the instantiated class reference to the Thread COnstructor Thread(a)
//        This basically tells the thread that go and execute whatever activity is mentioned inside the run method of Alpha class
            Alpha a = new Alpha();
            Thread t1 = new Thread(a);

            Beta b = new Beta();
            Thread t2 = new Thread(b);
//            After creating threads all we have to do is just start them
            t1.start();
            t2.start();
    }
}
