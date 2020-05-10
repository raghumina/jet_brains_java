package com.company;
/*THIS PROGRAM IS TO FIND WEATHER A INPUT IS
1. POSITIVE EVEN
2. POSITIVE ODD
3. NEGATIVE EVEN
4. NEGATIVE ODD
5. ZERO
**/

import java.util.Scanner;

class IfElseOutput {
    public static void ifElseOutput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.print("POSITIVE ");
            if (n / 2 == 0) {
                System.out.println("EVEN\n");
            } else {
                System.out.println("ODD");
            }
        } else if (n < 0) {
            System.out.print("NEGATIVE ");
            if (n / 2 == 0) {
                System.out.println("EVEN\n");
            } else {
                System.out.println("ODD\n");
            }
        } else {
            System.out.println("0");
        }

    }
}