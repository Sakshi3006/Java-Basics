package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        //int[] array2 = new int[n];
        System.out.println("Enter the elements");

        for(int i : array1) array1[i] = sc.nextInt();
        
        Arrays.sort(array1);
        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (array1[i] != array1[i+1])
                temp[j++] = array1[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = array1[n-1];
        for (int i=0; i<n; i++){
            System.out.print(temp[i]+" ");     }
        }
}