package com.company;

//Write a program that reads a string from the standard input and outputs the number.
// A number can be from 1 to 9 (inclusive).
//Sample Output 1:
//one
//Sample input 1:
//1
// we can also solve this problem by if else conditions
// solution by if else in Switch Problem 2

import java.util.Scanner;

class SwitchProblem1 {
    public static void switchProblem() {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;


        }

    }
}