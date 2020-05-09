package com.company;

import java.util.Scanner;
// HERE WE WILL INPUT THE VARIABLES BY USER
// WE WILL INPUT STRING, INT, FLOAT
class JavaInput{
    public static void javaInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR INPUT");
       System.out.println("PLEASE ENTER A STRING VALUE");
        String s = sc.nextLine();
        System.out.println("YOU ENTER :"+s);
        System.out.println("PLEASE ENTER AN INTEGER VALUE");
        int i = sc.nextInt();
        System.out.println("YOU ENTER :"+i);
        System.out.println("PLEASE ENTER A FLOAT VALUE");
        float f = sc.nextFloat();
        System.out.println("YOU ENTER :"+f);

    }
}