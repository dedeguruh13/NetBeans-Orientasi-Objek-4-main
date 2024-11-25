/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.panjangarray;

/**
 * Example program demonstrating the length of an array in Java.
 * This program initializes an integer array with 100 elements 
 * and prints each element.
 */
public class PanjangArray {

    public static void main(String[] args) {
        int[] ages = new int[100];
        
        // Print all elements in the array
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}
