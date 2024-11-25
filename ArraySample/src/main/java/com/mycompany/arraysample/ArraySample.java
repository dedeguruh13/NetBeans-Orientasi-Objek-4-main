/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arraysample;

/**
 * Example of an array in Java.
 * This program initializes an integer array with 100 elements 
 * and prints each element.
 */
public class ArraySample {

    public static void main(String[] args) {
        int[] ages = new int[100];
        
        // Initialize each element in the array with a value
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i; // Contoh nilai untuk memperjelas output
        }

        // Print all elements in the array
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
