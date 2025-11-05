package org.practice;

//whenever we know theres some risky code inside our method or class that might cause an Exception at Runtime then that piece of code should be wrapped
//inside a Try block. Whenever an Exception occurs inside this try block we need a Handler to handle this exception that is the Catch block.
//Catch block acts as a handler and catches any exception that occurs inside a try block.

//3types
//Handling an Exception -> Try, Catch
//Re-throwing an Exception -> Try, catch, throws, throw
//Ducking an Exception -> Throws

//The default flow of exception (taking the code here for an example) -> In whichever method or class the exception occurs that method will create an Exception object
//and give it to JVM. JVM then looks for a handler (catch block) for that particular exception inside that same method where the exception occured. If it cannot find the hanlder then it will throw the exception to the
//caller method (here Main coz main is calling alpha by creating its instance). If JVM cant find the exception handler even inside the caller method then it will throw the exception object to the defaultExceptionhandler
//and then the exception is handled.


import java.util.Scanner;

class Alpha1{
    public void alpha(){
        Scanner scan = new Scanner(System.in);

        //now I think this code might cause an exception so im gonna wrap it inside a try block.
        try{
            System.out.println("Enter two integers");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            int res = n1/n2;
            System.out.println("The result of division is :"+res);
        }
        //here we know that we might run into an Arithmetic exception so we're catching that exception here
        catch(ArithmeticException e){
            System.out.println("Please input valid integers");
        }
        //But sometimes we dont know what kind of exception we might run into at runtime so it is recommended to always have a default exception handler
        //at the end of all the catch blocks.
        catch (Exception e) {
            System.out.println("An unknown Exception occured");
        }
        System.out.println("*************************************");
    }

    public void division2(){
        Scanner scan = new Scanner(System.in);

        //now I think this code might cause an exception so im gonna wrap it inside a try block.

        System.out.println("Enter two integers");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int res = n1/n2;
        System.out.println("The result of division from second method is :"+res);

    }
}

public class LaunchExceptionHandling {
    public static void main(String[] args){
        try{
            Alpha1 alph = new Alpha1();
            alph.alpha();
            alph.division2();
        }catch(Exception e){
            System.out.println("Demo of how an exception is thrown to the caller method if its not handled inside the method where the exception occured originally");
        }

    }
}
