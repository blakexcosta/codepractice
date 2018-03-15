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

        //coding interview problem. day 2 3/14/2018
        // serialize a tree to a string and then deserialize back to a tree.
        //
        TreeNode<String> root = new TreeNode<String>("root");
        TreeNode<String> node0 = root.addChild("node0");
        TreeNode<String> node1 = root.addChild("node1");
        TreeNode<String> node2 = root.addChild("node2");
        {
            TreeNode<String> node20 = node2.addChild(null);
            TreeNode<String> node21 = node2.addChild("node21");
            {
                TreeNode<String> node210 = node20.addChild("node210");
            }
        }

        System.out.println(node2);
    }

}
