package com.company;

import java.util.Scanner;

/*
You need to write a simple Java program to check if a given String is palindrome or not.
 A Palindrome is a String which is equal to the reverse of itself, e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."  Though be prepared with both recursive and iterative solution of this problem. The interviewer may ask you to solve without using any library method,
e.g. indexOf() or subString() so be prepared for that.
 */
public class Main {

    public static void main(String[] args) {
        // write your code

        String reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String a = sc.nextLine();

        for(int i = a.length() -1 ;i >= 0; i--){
                reverse += a.charAt(i);
        }

        if(a.equals(reverse)){
            System.out.println("It is a Palindrome");
        }

        else{
            System.out.println("Not a Palindrome");
        }
    }
}
