package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Elements\n");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Number you want to Search\n");
        int item = sc.nextInt();

        Binary(arr, n, item);
    }

    public static void Binary(int[] arr,int n, int item){
        int first = 0;
        int last = n-1;
        int middle = (first + last)/2;

        while(first <= last){

            if(arr[middle] < item){
               first = middle + 1;
            }

            else if(arr[middle] == item){
                System.out.println("The Element " + item + " is found at location " + (middle + 1));
                break;
            }

            else{
                last = middle - 1;
            }

            middle = (first + last) / 2;
        }

        if(first> last){
            System.out.println("Element not found");
        }
    }
}
