package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Elements\n");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the Elemebts in the Array\n");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the Element you want to Search ");
        int item = sc.nextInt();

        int first = 0;
        int last = n - 1;

        Binary(array, n, first, last, item);
    }

    public static void Binary(int[] array, int n, int first, int last, int item) {


        int middle = (first + last) / 2;

        if (array[middle] < item) {
            Binary(array, n, middle + 1, last, item);
        }

        else if(array[middle] == item){
            System.out.println("The Element " + item + " is found at location " + (middle + 1));
        }

        else{
            Binary(array, n, first, middle - 1, item);
        }
    }
}