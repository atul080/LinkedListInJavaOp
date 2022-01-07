package com.linkedlist;
/**
 * @author Atul Srivastav
 * @created on 06-01-2022
 * Linked list operations
 */

public class Operations {
    /**
     * method to add data at the start
     * calls push method for add operation.
     */
    public static void addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }

    /**
     * method to append data at end of linked list.
     * calls append method for append operation
     */
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(70);
        linkedList.append(30);
        linkedList.append(56);
        linkedList.print();
    }

    /**
     * method to add data in between of two nodes.
    *  calls insertInBetween method
     */
    public static void addDataInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("\nAfter:");
        linkedList.print();
    }

    /**
     * methtod to delete data from begining.
     * calls remove method internally.
     */
    public static void deleteDataAtStart(){
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before:");
        linkedList.print();
        linkedList.remove();
        System.out.println("\nAfter:");
        linkedList.print();
    }
    /**
     * methtod to delete data from end.
     * calls removeFromEnd method internally.
     */
    public void deleteFromEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.removeFromEnd();
        linkedList.print();
    }
    /**
     * methtod to find element.
     * calls findElement method internally.
     */
    public void findElement(int i) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.findElement(i);
        linkedList.print();
    }
    /**
     * methtod to insert element after 30.
     */
    public void insertAfterElement(int i) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.insertAfterElement(i);
        linkedList.print();
    }
    /**
     * methtod to delete particular element.
     */
    public void deleteParticularElement(int i) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(40);
        linkedList.push(56);
        linkedList.deleteParticularElement(i);
        linkedList.print();
    }
}

