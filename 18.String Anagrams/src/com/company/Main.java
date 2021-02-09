package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        String s1 =  new String("");
        System.out.println("Enter the First String: ");
        s1 = sc.nextLine();

        String s2 = new String("");
        System.out.println("Enter the Second String");
        s2 = sc.nextLine();

        Anagrams(s1, s2);

    }

    public static void Anagrams(String s1, String s2){
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");

        if(s1.length() != s2.length()){
            System.out.println("Strings are of different lengths. Hence, they are NOT ANAGRAMS! ");
        }

        char[] array1 = s1.toLowerCase().toCharArray();
        char[] array2 = s2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array1, array2)){
            System.out.println("The Strings " + "'" + s1 + "' and '" + s2 + " are ANAGRAMS!" );
        }

        else{
            System.out.println("The Strings " + "'" + s1 + "' and '" + s2 + " are NOT ANAGRAMS!" );
        }
    }
}
