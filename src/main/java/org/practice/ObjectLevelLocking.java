package org.practice;

public class ObjectLevelLocking {
    public static  void main(String[] args){
        HDFC bank = new HDFC(2000);

        PhonePe pp = new PhonePe(bank);
        GPay gp = new GPay(bank);

        pp.start();
        gp.start();

    }
}
