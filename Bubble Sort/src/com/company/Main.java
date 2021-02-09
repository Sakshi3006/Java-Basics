package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void BubbleSort(int arr[], int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("The Sorted Array is : " + Arrays.toString(arr) );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements of the Array ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        BubbleSort(arr, n);
    }
}
