package com.dataStructures.binaryTree;

/**
 * Created by STO on 20/02/2016.
 */
public class Node {

    Node leftChild;
    Node rigthChild;

    int key;
    String name;


    public Node(int key,String value ){

        this.key = key;
        this.name = value;
    }

    public void name(String name){

        System.out.println(" * " + name);
    }

    @Override
    public String toString(){

        return key+" has name "+name;
    }
}
