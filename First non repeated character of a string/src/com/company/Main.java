package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        for(char i : str.toCharArray()){
            if(str.indexOf(i) == str.lastIndexOf(i)){
                System.out.println("Non-repeating element is " + i);
                break;
            }
        }
    }
}
