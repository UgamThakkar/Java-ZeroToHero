package org.practice;

public class LaunchMutableString {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");

        StringBuilder sb2 = new StringBuilder("Java");

        //Here this will print false -> Reasoning: Object class is the parent of all classes and equals method comes from the object class
        //Default behavior of equals method in Object class is to compare references of two string objects.
        //now in the Immutable String class this 'Equals' method IS overriden to compare the value/data inside two string objects.
        //But in mutable string class i.e. StringBuilder and StringBuffer the Equals method IS NOT overriden so here it will compare the references of two string objects.
        System.out.println(sb1.equals(sb2));

        //The initial capacity of StringBuffer and StringBuilder is 16.
    }
}
