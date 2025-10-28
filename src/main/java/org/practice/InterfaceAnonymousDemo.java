package org.practice;

interface Phone{
    void call();
}

//Interface with:
//0 methods - Marker Interface
//1 Method - Functional Interface
//>1 Method - Normal Interface

//
//class Nokia implements Phone{
//    public void call(){
//        System.out.println("Nokia 5233 cell phone");
//    }
//}

public class InterfaceAnonymousDemo {
    public static void main(String[] args){
//        Phone obj = new Nokia();

//        Phone obj = new Phone(){
//            //Anonymous Inner Class
//            public void call() {
//                System.out.println("Nokia 5233");
//            }
//        };
//        obj.call();

        //Lambda Expression
        //Lambda Expression works only with the interface having one method. i.e functional interface
        Phone obj = () -> System.out.println("Nokia 5233");
        obj.call();
    }
}
