package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of levels");
        int n = sc.nextInt();
        //1
        for(int i = 0; i < n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //2
        for(int i = 0; i < n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
