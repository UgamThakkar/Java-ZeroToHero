package org.practice;

public class PhonePe extends Thread{
    private HDFC hdfc;

    public PhonePe(HDFC hdfc){
        this.hdfc = hdfc;
    }
    public void run(){
        hdfc.deposit(1000);
        hdfc.checkBalance();
    }
}
