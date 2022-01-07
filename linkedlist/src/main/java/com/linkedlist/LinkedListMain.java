package com.linkedlist;
/**
 * @author Atul Srivastav
 * @created on 06-01-2022
 * Main class for linked list program
 */

import java.util.Scanner;

public class LinkedListMain {
    /**
     * Displays menu
     * User will selection operation to perform.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Data structure.");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. ADD at start\n2. ADD at the end\n3. ADD at the middle.\n4. DELETE from start.\n5.DELETE from end.\n6.Find an element \n7. Insert after particular element");

        switch (sc.nextInt()) {
            case 1:
                new Operations().addDataAtStart(); // ADD a new data at start of list
                break;
            case 2:
                new Operations().addDataAtEnd(); // ADD a new  data at end of list
                break;
            case 3:
                new Operations().addDataInBetween(); // ADD a new data in between two elements of list
                break;
            case 4:
                new Operations().deleteDataAtStart(); // DELETE data at start of list
                break;
            case 5:
                new Operations().deleteFromEnd(); // DELETE data from end of list
                break;
            case 6:
                new Operations().findElement(30);
                break;
            case 7:
                new Operations().insertAfterElement(40);
                break;
        }
    }
}

