package com.company;
// This is a Switch Practise program
// using multiple if else if cases 
import java.util.Scanner;

class SwitchPractising {
    public static void switchPractising() {
        System.out.println("Please enter your command");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n; // the input should be between 1 - 3
        if (number == 1) {
            System.out.println("Start the command ");
        } else if (number == 2) {
            System.out.println("You dont want to run the commnad ");
        } else if (number == 3) {
            System.out.println("You want to terminate the code ");
        } else if (number == 4) {
            System.out.println("Close the program ");
        }
    }
}