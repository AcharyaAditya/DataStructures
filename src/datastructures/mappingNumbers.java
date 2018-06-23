///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package datastructures;
//
//import java.util.*;
//
///**
// *
// * @author Aditya
// */
//public class mappingNumbers {
//
//    int number;
//    node root = null;
//
//    public mappingNumbers(int pressedNumber) {
//        number = pressedNumber;
//    }
//
//    class node {
//
//        char data;
//        node parent;
//        List<node> children = new ArrayList<node>();
//
//        node(char value) {
//            this.data = value;
//            this.parent = null;
//        }
//
//        node(char value, node parent) {
//            this.data = value;
//            this.parent = parent;
//        }
//    }
//
//    public void buildTree() {
//        root = new node(' ');
//        buildTree(root, number);
//    }
//
//    public void buildTree(node currentNode, int myNum) {
//        while (myNum != 0) {
//            int temp = myNum % 10;
//            String hashValues = getValues(temp);
//            for (int counter = 0; counter < hashValues.length(); counter++) {
//                System.out.println(hashValues.charAt(counter));
//                node child = new node(hashValues.charAt(counter), currentNode);
//                currentNode.children.add(child);
//            }
//            for (int childCounter = 0; childCounter < currentNode.children.size(); childCounter++) {
//                currentNode = currentNode.children.get(childCounter);
//                myNum = myNum / 10;
//                buildTree(currentNode, myNum);
//            }
//
//        }
//
//    }
//
//    public void traverse() {
//        traverse(root);
//    }
//    public void traverse(node currentNode){
//        if(!currentNode.children.isEmpty()){
//            for(int traverseCounter = 0; traverseCounter < currentNode.children.size(); traverseCounter++){
//                currentNode = currentNode.children.get(traverseCounter);
//                traverse(currentNode);
//                System.out.print(currentNode.data);
//            }
//        }
//    }
//
//    private String getValues(int key) {
//        Hashtable ht = new Hashtable();
//        ht.put(1, "");
//        ht.put(2, "abc");
//        ht.put(3, "def");
//        ht.put(4, "ghi");
//        ht.put(5, "jkl");
//        ht.put(6, "mno");
//        ht.put(7, "pqrs");
//        ht.put(8, "tuv");
//        ht.put(9, "wxyz");
//        ht.put(10, "");
//        return (String) ht.get(key);
//    }
//}
