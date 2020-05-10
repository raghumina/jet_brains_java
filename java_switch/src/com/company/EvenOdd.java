package com.company;
// CODE TO FIND THAT USER INPUT IS EVEN OR ODD

import java.util.Scanner;

class EvenOdd {
    public static void evenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER");

        int num = scanner.nextInt();
        if (num / 2 == 0) {
            System.out.println("THE NUMBER IS EVEN");
        } else {
            System.out.println("THE NUMBER IS ODD");
        }
    }
}