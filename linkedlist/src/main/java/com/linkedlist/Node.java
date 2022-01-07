package com.linkedlist;
/**
 * @author Atul Srivastav
 * @created on 06-01-2022
 * Linked list node creation
 */
public class Node {
    //instance variable
    public int data;
    public Node next;

    //constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    //setters and getters
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //override function toString to format output
    public String toString() {
        return "Node{ data=" + data + " next=" + next + "}";
    }
}
