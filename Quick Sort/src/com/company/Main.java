package com.company;

import java.util.Scanner;

public class Main {

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = arr[i];
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void Quicksort(int[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);

            Quicksort(arr, low, pivot - 1);
            Quicksort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the Size of Array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Quicksort(arr, 0, n - 1);
    }
}
