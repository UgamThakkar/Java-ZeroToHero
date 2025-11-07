package org.practice;

import java.util.Scanner;

class InvalidCredentials extends Exception{}

class ATM{
    private int acc_num = 1234;
    private int password = 0000;
    int acc;
    int pass;

    public void acceptInput(){
        System.out.println("Enter the account number");
        Scanner scan = new Scanner(System.in);
        acc = scan.nextInt();
        System.out.println("Enter Password");
        pass = scan.nextInt();
    }

    public void verify() throws InvalidCredentials{
        if(acc == acc_num && pass == password){
            System.out.println("Collect your cash");
        }else{
            InvalidCredentials Ic = new InvalidCredentials();
            System.out.println("Invalid Credentials");
            throw Ic;
        }
    }
}

class Bank{
    public  void initiate(){
        ATM atm = new ATM();
        try{
            atm.acceptInput();
            atm.verify();
        }catch (Exception e){
            System.out.println("Tries Remaining - 2");
            try{
                atm.acceptInput();
                atm.verify();
            }catch (Exception f){
                System.out.println("Tries Remaining - 1");
                try{
                    atm.acceptInput();
                    atm.verify();
                }catch (Exception g){
                    System.out.println("Number of tries are done. This account is now Locked");
                }
            }
        }
    }
}

public class LaunchCustomExceptions {
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.initiate();
    }
}
