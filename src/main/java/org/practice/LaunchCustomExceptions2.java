package org.practice;

import org.hibernate.sql.ast.tree.expression.Over;

import java.util.Scanner;

class UnderAgeException extends Exception{
}

class OverAgeException extends Exception{}


class Applicant{
    int age;
    public  void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        age = scan.nextInt();
    }
    //public void verification() throws Exception -> this also works
    public void verification() throws UnderAgeException, OverAgeException {
        if(age<18){
            UnderAgeException Uae = new UnderAgeException();
            System.out.println("You're Under 18 - Not Allowed");
            throw Uae;
        }
        else if(age>60){
            OverAgeException Oae = new OverAgeException();
            System.out.println("You're too old to get a license");
            throw Oae;
        }
        else{
            System.out.println("You're clear to proceed further");
        }
    }
}

class RTO{
    public void initiate(){
        Applicant ap = new Applicant();
        try{
            ap.getInput();
            ap.verification();

            //you can also handle multiple exception this way so that the code stays cleaner
            //however this is not the recommended way. Its always recommended to write individual try catch blocks for each exception
        }catch (UnderAgeException | OverAgeException Oae){
            System.out.println("Please Enter valid age between 18 - 59");
            try{
                ap.getInput();
                ap.verification();
            }catch (UnderAgeException | OverAgeException ae){
                System.out.println("Please Enter Valid age between 18-59");
            }try{
                ap.getInput();
                ap.verification();
            }catch (UnderAgeException | OverAgeException ae){
                System.out.println("Blocked please exit the system");
            }
        }
    }
}


public class LaunchCustomExceptions2 {
}
