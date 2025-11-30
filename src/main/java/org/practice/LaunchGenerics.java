package org.practice;

import java.util.ArrayList;

class Human1{
    public void eats(){
        System.out.println("Human Eats");
    }
}

class Son1 extends Human1{
    public Son1() {
    }
}

public class LaunchGenerics {
    public static  void main(String[] args){
        //Generics - What are generics and why do we need them
        // Unlike Arrays collections can have heterogeneous type of data and sometimes treating a collection in one way might cause an exception if we are not careful with our
        //operations and type conversions. To avoid this and help us out Generics are introduced which ensure that whatever type of Data is declared in the collection
        //only that type of data can be added.

        //Here the collection arraylist has Generic String which ensures only strings can be added to this collection.
        ArrayList<String> al = new ArrayList<>();
        al.add("Taj mahal");
        al.add("Santa Monica Pier");
        for(String s: al){
            System.out.println(s);
        }

        //wild card upper bound and lower bound:
        ArrayList<?> HumanList = new ArrayList<>(); // "?" -? Unknown or wild card
        ArrayList<Son1> SonList = new ArrayList<>();
        HumanList = SonList; //this is allowed

        //Upper Bound
        //this implies that THe humanList1 collection will accept objects only From Human1 class or from the class that is the child of Human1 (basically extends the parent class)
        ArrayList<? extends Human1> HumanList1 = new ArrayList<>(); //
        ArrayList<Son1> SonList1 = new ArrayList<>();
        HumanList1 = SonList1; //this is allowed

        //lowerbound
        //lowerbound means that HumanList2 will accpet objects only from Human1 class or from its parent class (i.e. the object class)
        ArrayList<? super Human1> HumanList2 = new ArrayList<>();
        ArrayList<Son1> SonList2 = new ArrayList<>();
        ArrayList<Object> ObjList = new ArrayList<>();

//        HumanList2 = SonList2; //this is not allowed
        HumanList2 = ObjList; //this is allowed.


    }
}
