package org.practice;

public class HDFC {
    int accountBal;

    public HDFC(int accountBal){
        this.accountBal = accountBal;
    }

    synchronized public void deposit(int deposit){
        accountBal = accountBal + deposit;
    }

    synchronized public void withdrawal(int amount){
        accountBal = accountBal -amount;
    }

    synchronized public void checkBalance(){
        System.out.println("Account Balance is: " +accountBal);
    }
}

