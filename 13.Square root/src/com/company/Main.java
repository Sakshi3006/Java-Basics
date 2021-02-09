package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        double n = sc.nextDouble();

        double root = Math.sqrt(n);

        System.out.println("The Square root is " + root);
    }
}
