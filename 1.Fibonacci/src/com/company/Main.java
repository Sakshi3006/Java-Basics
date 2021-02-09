package com.company;

public class Main {

    public static void main(String[] args) {
        /* write your code here */

        int i = 1, n = 10, n1 = 1, n2 = 1, n3;
        System.out.print(n1 + " " + n2);

        while (i <= n - 2)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            i++;
        }

    }

}