/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.contoh2d;

/**
 * Program to demonstrate a 2D array in Java.
 * This program initializes a 2D array and prints its contents.
 * 
 * @author micha
 */
public class Contoh2d {
    
    // Initializing a 2D array
    int[][] A = {
        {3, 7, 5},
        {2, 8, 6}
    };

    // Method to print the 2D array
    public void cetak() {
        System.out.println("Matrix A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Contoh2d jm = new Contoh2d();
        jm.cetak();
    }
}
