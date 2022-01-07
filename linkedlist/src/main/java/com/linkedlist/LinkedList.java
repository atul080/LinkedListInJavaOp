/**
 * @author Atul Srivastav
 * @created on 06-01-2022
 * Linked list methods
 */
package com.linkedlist;
public class LinkedList {
    Node head;
    Node tail;

    /**
     * push: add node in the start of the linkedlist
     * create new node
     * check if linkedlist is empty or not
     */
    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    /**
     * append: add node in the end of linked list
     * create new node
     * check if linked list is empty or not
     */
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * print linked list
     * traverse the linked list
     * print each node
     */
    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    /**
     * method to add node in between two nodes.
     * //@param previous and next node
     */
    public void insertInBetween(Node previousNode, Node newNode) {
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }

    /**
     * method to remove node from the start of the linked list
     * called from main.
     */
    public void remove() {
        if (head == null) {
            System.out.println("No records present");
        }
        else if(head.next== null){
            head=null;
        }
        else{
            head=head.next;
        }
    }
}
