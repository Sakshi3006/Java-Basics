package com.company;

import java.util.Scanner;
/*

A year is a leap year if its multiple of 400 or multiple of 4 but not 100

 Leap years are years that are evenly divisible by 4.
 However, years that end in 00 are not leap years unless they are evenly divisible by 400.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year");
        int n = sc.nextInt();

        if(n % 400 == 0 || (n % 100 != 0 && n % 4 == 0)){
            System.out.println("It is a Leap Year");
        }

        else{
            System.out.println("It is not a Leap Year");
        }
    }
}
