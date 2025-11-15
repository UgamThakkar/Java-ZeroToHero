package org.practice;


import org.apache.logging.log4j.spi.CopyOnWrite;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//collection in java is an Object that can store multiple heterogenous/homogenous elements/objects together.
//Collection in java provides multiple predefined Interfaces and Classes that can be used directly to store and manipulate data.
public class LaunchCollection {
    public static void main(String[] args){

        //Each collection has a ton of Predefined methods to work with it - to manipulate data.
//        List al = new ArrayList();
        ArrayList al = new ArrayList();
        al.add("Java");
        al.add("Python");
        al.add("SpringBoot");
        al.add("AWS");
        al.add(1, "C#");
        System.out.println(al);

        //To loop over Collection its always recommended to use iterators. Because in traditional for loops you can access the data using indexing but in collection
        //its not possible for all of the collection types to be able to access the data via indexing so recommended approach to loop through them is using iterator.w
        Iterator it = al.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        //Now there are multiple predefined classes in Collection Like Arraylist, LinkedList, PriorityQueue, ArrayDequeue, HashSet, LinkedHashSet and TreeSet.
//        LinkedList Ll = new LinkedList();
//        ArrayDeque ad = new ArrayDeque();

        //Another Important issue that one may enocounter during Collection is the "ConcurrentModification" exception.
        //How it happens/Occurs:
        while (it.hasNext()){
            System.out.println(it.next());
        //This is what causes the ConCurrentModification Exception because we're trying to modify it at the same time while iterating through it which is not allowed.
        //This causes/is called "FAILFAST"
//            al.add("Adding new Element");
        }

        System.out.println("*****************");
        //To Stop this or "FAILSAFELY"
        //We use ConcurrentClasses which won't throw this exception rather they will fail safely.
        //ConcurrentClasses are CopyOnWrite classes for all the collection pre defined classes. Example below:
        CopyOnWriteArrayList arl = new CopyOnWriteArrayList();
        arl.add("Toronto");
        arl.add("New York");
        arl.add("Mumbai");
        Iterator itr = arl.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            arl.add("Ahmedabad");
        }
    }
}
