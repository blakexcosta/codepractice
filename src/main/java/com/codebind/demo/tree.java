package com.codebind.demo;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class tree {
    public tree(){

    }

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder string = new StringBuilder();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root); //adding the rootnode to the queue
        while (!queue.isEmpty()) { //while the LinkedList isn't empty
            TreeNode t = queue.poll(); //returns first element in the list
            if (t != null) { //if it's not null, meaning there's more elements
                string.append(String.valueOf(t.da)) // append thefirst node to the string.
            }
        }


        return string.toString();//returning the string
    }

}
