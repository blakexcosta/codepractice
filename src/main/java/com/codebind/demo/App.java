package com.codebind.demo;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final int bob = 0;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(bob);
        System.out.println("HI!");

        //coding interview problem. day 4 3/15/2018
        //cons(a, b) constructs a pair, and car(pair) and cdr(pair)
        // returns the first and last element of that pair.
        // For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
        //Given this implementation of cons:
//    def cons(a, b):
//        return lambda f : f(a, b)
//        Implement car and cdr.
        //this isn't the best question. need more clarifying info. I'm going to solve
        //it anyways
        ConsInterface list = cons();

    }
    interface ConsInterface{
        public ArrayList pair(ArrayList<Integer> arrayList); //need interface so know what method to call
    }


    public static ConsInterface cons() {
        ConsInterface a = (list) -> list; //returning the arraylist
        return a;
    }

    public static void car(ConsInterface) {
        cons().pair().get(0);
    }

    public static void cdr() {
        cons().pair().get(-1);
    }
}

