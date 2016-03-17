package com.dataStructures.binaryTree;

/**
 * Created by STO on 21/02/2016.
 */
public class BinaryTree {

    Node root;


    public void addNode(int key , String value){


        Node newNode = new Node(key,value);

        if(root == null){

            root = newNode;

        }else{

            Node focusNode = root;

            Node parent;

            while(true){

                parent = focusNode;

                if(key<parent.key){

                    focusNode = focusNode.leftChild;
                    if (focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{

                    focusNode = focusNode.rigthChild;
                    if (focusNode == null){
                        parent.rigthChild = newNode;
                        return;
                    }

                }
            }

        }}

    public void inOrderTraverseTree(Node focusNode) {


        if(focusNode != null){

            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rigthChild);

        }

    }

    public void preOrderTraverseTree(Node focusNode) {


        if(focusNode != null){

            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);


            preOrderTraverseTree(focusNode.rigthChild);

        }

    }

    public void postOrderTraverseTree(Node focusNode) {


        if(focusNode != null){


            postOrderTraverseTree(focusNode.leftChild);

            postOrderTraverseTree(focusNode.rigthChild);

            System.out.println(focusNode);

        }}

        public Node findNode(int key){

        Node focusNode = root;

        while (key != focusNode.key){

            if(key < focusNode.key){

                focusNode = focusNode.leftChild;
            }else {

                focusNode = focusNode.rigthChild;
            }

            if(focusNode == null)
                return null;
        }

        return focusNode;

    }



    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice President");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales Manager");
        theTree.addNode(85, "Salesman 1");
        // Different ways to traverse binary trees
         //theTree.inOrderTraverseTree(theTree.root);
       //  theTree.preOrderTraverseTree(theTree.root);
        //theTree.postOrderTraverseTree(theTree.root);
        // Find the node with key 75
         System.out.println("\nNode with the key 60");
         System.out.println(theTree.findNode(85));


    }

}
