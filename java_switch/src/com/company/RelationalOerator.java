package com.company;
// Relational operator problem
//Suppose there are three children in the sports class. You want to check if they are arranged in the descending order.
//The following program reads three integer numbers h1, h2, h3 and then checks if h1 >= h2 and h2 >= h3.
//   Note that h means the height of a child.

import java.util.Scanner;

class RelationalOperator {
    public static void relationalOperator() {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();
        boolean desOrderd = (h1 >= h2) && (h2 >= h3);
        System.out.println(desOrderd);


    }
}