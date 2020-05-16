package com.company;

import java.util.Scanner;
//Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.
// jet brains 1st project (part 1 )
class Project {
    public static void project() {

        Scanner sc = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
    //    String word = sc.nextLine();
        int number = sc.nextInt();
     //   System.out.println("How many cups of coffee you need\n "+number);
      //  System.out.println(number);
       System.out.println("For "+number+" cups of coffee you will need");
        System.out.println(number*200+" ml of water");
        System.out.println(number*50+" ml  of milk ");
        System.out.println(number*15+" g of coffee beans");


    }
}