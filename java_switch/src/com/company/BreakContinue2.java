package com.company;
//write a program to 5 pair of integer from user
//for every pair x,y it should print x/y if y is not 0
import java.util.Scanner;

class BreakContinue2 {
    public static void breakContinue2() {
        System.out.println("PLEASE ENTER A NUMBER");
        Scanner sc = new Scanner(System.in);
        //  int i = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0)
                continue;
            System.out.println(x / y);
        }
    }

}
