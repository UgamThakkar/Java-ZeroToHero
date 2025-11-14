package org.practice;


import java.util.ArrayList;
import java.util.List;

//collection in java is an Object that can store multiple heterogenous/homogenous elements/objects together.
//Collection in java provides multiple predefined Interfaces and Classes that can be used directly to store and manipulate data.
public class LaunchCollection {
    public static void main(String[] args){

        //Each collection has a ton of Predefined methods to work with it - to manipulate data.
        List al = new ArrayList();
        al.add("Java");
        al.add("Python");
        al.add("SpringBoot");
        al.add("AWS");
        al.add(1, "C#");
        System.out.println(al);
    }
}
