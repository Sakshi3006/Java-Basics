package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 2;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();

        while(i < n/2){
            if(n%i == 0){
                flag = true;
                break;
            }
            i++;
        }
        if(!flag){
            System.out.println("It is a Prime Number");
        }

        else{
            System.out.println("Not a Prime number");
        }
    }
}
