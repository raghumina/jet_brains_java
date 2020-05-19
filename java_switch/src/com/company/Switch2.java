package com.company;

import java.util.Scanner;


class Switch2 {
    public static void switch2() {
        System.out.println("Please enter the numbers ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        switch (n) {
            case 1:
                System.out.println("Starting a new game...");
                break;
            case 2:
                System.out.println("Loading a saved game");
                break;
            case 3:
                System.out.println("Displaying help...");
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Unsuitable action, please, try again");
        }
    }
}
