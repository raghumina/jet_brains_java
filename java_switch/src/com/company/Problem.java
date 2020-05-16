package com.company;

//Write a program that reads an integer value and checks if it is less than 10 and greater than 0.
// The result is a boolean value (true or false).

import java.util.Scanner;

class Problem {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean greater = (n>0)&&(n<10);
        System.out.println(greater);


    }
}