/**
 * @author Atul Srivastav
 * @created on 06-01-2022
 * Linked list methods
 */
package com.linkedlist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

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
            System.out.println("No records present");
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
    /**
     * method to remove node from the end of the linked list
     * called from main.
     */
    public void removeFromEnd() {
        if (head == null) {
            System.out.println("No records present");
        }
        else if(head.next== null){
            head=null;
        }
        else{
            Node prev=head;
            Node temp=head;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            tail=prev;
        }
    }
    /**
     * method to find element in the linked list
     * called from main.
     */
    public void findElement(int i) {
        if (head == null) {
            System.out.println("No records present");
        }
        else if(head.next== null){
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                if(temp.data==i)
                {
                    System.out.println("Element found");
                    break;
                }
                temp=temp.next;
            }
        }
    }
    /**
     * method toinsert element after partiicular element in the linked list
     * called from main.
     */
    public void insertAfterElement(int i) {
        Node newNode=new Node(i);
        if (head == null) {
            System.out.println("No records present");
        } else {
            Node temp = head;
            while (temp.next!=null) {
                if( temp.data ==30){
                    newNode.next=temp.next;
                    temp.next=newNode;
                    break;
                }
                temp = temp.next;
            }
        }

    }
    /**
     * method to delete particular element from the linked list
     * called from main.
     */
    public void deleteParticularElement(int i) {
        Node newNode = new Node(i);
        int count=0;
        if (head == null) {
            System.out.println("No records present");
        } else {
            Node previous = head;
            Node temp = head;
            while (temp != null) {
                count++;
                if (temp.data == i) {
                    newNode.next = temp.next;
                    previous.next = temp.next;
                    break;
                }
                previous = temp;
                temp = temp.next;
            }
            count=count+1;
            System.out.println("New count is: "+count);
        }
    }
    /**
     * method to print ordered linked list
     * called from main.
     */
    public void orderedLinkedList() {
        if (head == null) {
            System.out.println("No records present");
        } else {
            ArrayList a=new ArrayList(4);
            int i=0;
            Node temp = head;
            while (temp != null) {
                a.add(temp.data);
                temp = temp.next;
            }
            Collections.sort(a);
            System.out.println(a);
        }
    }
}
