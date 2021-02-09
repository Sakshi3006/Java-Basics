package com.company;


import java.util.Scanner;

/*

In Euclid's algorithm, we start with two numbers X and Y. If Y is zero then the greatest common divisor of both will be X, but if Y is not zero then we assign the Y to X and Y becomes X%Y. Once again we check if Y is zero, if yes then we have our greatest common divisor or GCD otherwise we keep continue like this until Y becomes zero.

Since we are using the modulo operator, the number is getting smaller and smaller at each iteration, so the X%Y will eventually become zero.

Let' take an example of calculating GCD of 54 and 24 using Euclid's algorithm. Here X = 54 and Y = 24 since Y is not zero we move to the logical part and assign X = Y, which means X becomes 24 and Y becomes 54%24 i.e 6.

Since Y is still not zero, we again apply the logic. This time X will become 6 and Y will become 24%6 i.e. Y=0. Bingo, Y is now zero which means we have our answer and it's nothing but the value of X which is 6 (six).



 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        System.out.println("GCD of the two numbers is " + GCD(n1, n2));
    }

    public static int GCD(int n1, int n2){
        if(n2 == 0){
            return n1;
        }

        return GCD(n2, n1%n2);
    }

}
