package com.company;
//Write a program that reads the number and prints YES if it is positive.
// Otherwise, the program should print NO.
//Do not forget that zero is not a positive number.

import java.util.Scanner;

class Problem4 {
    public static void problem4() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
