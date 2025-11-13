package org.practice;

public class GPay extends Thread {
    private HDFC hdfc;

    public GPay(HDFC hdfc){
        this.hdfc = hdfc;
    }
    public void run(){
        hdfc.withdrawal(500);
    }
}
