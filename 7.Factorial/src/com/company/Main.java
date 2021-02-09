package com.company;

import java.util.Scanner;

public class Main {

    //public int factorial(int n);

        public static void main(String[] args) {
	// write your code here
            int result= 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        result = factorial(n);

        System.out.println(result);
    }

    static int factorial(int n){

        if(n == 0){
            return 1;
        }
        else{
            return (n * factorial(n - 1));
        }
    }
}
