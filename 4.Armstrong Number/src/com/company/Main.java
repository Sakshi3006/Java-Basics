package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int temp, a;
        double c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        temp = n;
        while(n > 0){
            a = n%10;
            c = c + Math.pow(a, 3);
            n = n/10;
        }

        if(temp==c){
            System.out.println("It is an Armstrong Number");
        }
        else{
            System.out.println("Not an Amrstrong Number");
        }
    }
}
