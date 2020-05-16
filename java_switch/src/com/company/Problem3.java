package com.company;

// Relational Operator problem3
//Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.
//The output should be true or false.


import java.util.Scanner;

class Problem3 {
    public static void problem3() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        boolean res1 = n1!=n2 | n2!=n3;
       // boolean res2 = n2!= n3;
        System.out.println(res1);
      //  System.out.println(res2);

    }
}
