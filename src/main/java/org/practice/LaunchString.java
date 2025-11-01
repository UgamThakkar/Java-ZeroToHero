package org.practice;

import ch.qos.logback.core.net.SyslogOutputStream;

public class LaunchString {
    public static void main(String[] args){
        // Strings in Java is treated as an object. They're of two types mutable and immutable.
        //Immutable strings include the main String class
        //Mutable Strings include StringBuffer and StringBuilder

        //If we create/declare a string like this then the variable str is created on a special area called String Constant Pool inside the Heap area.
        //String constant pool doesnt allow duplicates
        String str = "Ugam";
        String str2 = "Ugam";
        System.out.println(str==str2); //true-> coz str and str2 will be pointing to the same "Ugam" inside the string constant pool.

        //Another way of creating a string is using the new keyword. When we create a string using the new keyword then the object is created on the heap area. Heap area
        //allows duplicates.
        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3==str4); // false -> because str3 and str4 are two different objects on the heap area and "==" operator for strings compares the references
        System.out.println(str3.equals(str4)); //True-> because equals method on a string compares the data inside it/compares the actual string.

        String str5 = "Java Course";
        str5 = "Aws Course";
        System.out.println(str5); // Aws Course -> As strings are immutable when str5 is first declared it is pointing/referencing "java Course" inside the string constant
        //pool however when we reassign Aws Course to it then a new string object is created inside string constant pool for Aws Course and Str5 is now pointing to it.

        String first = "Alien";
        //the flow here is first on the righthandside of the equal sign as we go right to left
        //Alien.concat() executes -> then variable "first" will now point at this new Object created in the String constant pool.
        //Yes that means the exisitng Alien object created in step1 wont be affected. String class is immutable so a new object is created everytime we try to modify the original string.
        first = first.concat(" Found on Jupiter by nasa");
        System.out.println(first);

    }
}
