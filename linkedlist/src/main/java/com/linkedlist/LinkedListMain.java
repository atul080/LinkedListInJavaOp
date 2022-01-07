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
        System.out.println("1. ADD at start\n2. ADD at the end\n3. ADD at the middle.\n4. DELETE from start.");

        switch (sc.nextInt()) {
            case 1:
                new Operations().addDataAtStart(); // add data at start of list
                break;
            case 2:
                new Operations().addDataAtEnd(); // add data at end of list
                break;
            case 3:
                new Operations().addDataInBetween(); // add data in between two elements of list
                break;
            case 4:
                new Operations().deleteDataAtStart(); // del data at start of list
                break;
        }
    }
}

