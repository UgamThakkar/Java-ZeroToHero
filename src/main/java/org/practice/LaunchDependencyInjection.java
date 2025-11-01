package org.practice;

interface Idelivery{
    public String deliverProduct(double amount);
        }

class FedEx implements  Idelivery{

    public String deliverProduct(double amount) {
        return "Product delivered with Fedex with amount: " +amount;
    }
}

class  BlueDart implements  Idelivery{
    public String deliverProduct(double amount) {
        return "Product delivered with BlueDart with amount: " +amount;
    }
}

class Amazon{
    private Idelivery delivery;

    public void setDelivery(Idelivery delivery){
        this.delivery = delivery;
    }

    public String ProductDelivery(double amount){
        return delivery.deliverProduct(amount);
    }
}

public class LaunchDependencyInjection {
    public static void main(String[] args){
        Amazon amz = new Amazon();//target object
        amz.setDelivery(new FedEx());//here new Fedex() -> dependent object and feeding it to amazon's object is called dependency Injection.
        String data = amz.ProductDelivery(399.9);
        System.out.println(data);
    }
}
