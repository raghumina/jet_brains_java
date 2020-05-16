package com.company;
// Relational Operator problem 2
//Suppose there are three boys in a sports class.
//You need to write a program that checks the boys are arranged in the ascending or descending order by height.
//The program must read three integer numbers h1, h2, h3 and outputs true or false.
//If boys have the same height, they are considered as correctly arranged.


import java.util.Scanner;

class Problem2 {
    public static void problem2() {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3= sc.nextInt();
        boolean desOrderd = (h1 >= h2) && (h2 >= h3);
        boolean aseOrdered = (h1<=h2) && (h2 <= h3);
        boolean same =  (h1==h2) && (h2 == h3);
      //  System.out.println(h1+h2+h3);
        System.out.println(desOrderd || aseOrdered);
      //  System.out.println(aseOrdered);
      //  System.out.println(same);


    }
}