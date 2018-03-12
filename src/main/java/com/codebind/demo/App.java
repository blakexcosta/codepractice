package com.codebind.demo;

import java.util.ArrayList;

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

        //coding interview problem. day 1 3/11/2018
        //Given an array of numbers, return whether any two sums to K.
        //For example, given [10, 15, 3, 7] and K of 17, return true since 10 + 7 is 17.
        int[] arrayofNums = new int[]{10,15, 3, 7};
        //checking if elements add up to 10
        int elementToCheckTo = 25;
        //loop through first time for placeholder.
        boolean sumsTo = false; //default boolean
        for (int i : arrayofNums) {
            //loop through second time to check if that elements sum match up to elementToCheckTo
            for (int j : arrayofNums) {
                if ((i + j) == elementToCheckTo) {
                    sumsTo = true;
                }
            }
        }
        System.out.println(sumsTo);
    }

    public String sample(){
        return "" + bob;
    }


}
