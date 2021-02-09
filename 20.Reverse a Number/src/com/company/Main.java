package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        while (n > 0) {
            i =  n % 10;
            System.out.print(i);
            n = n / 10;
        }
    }
}
