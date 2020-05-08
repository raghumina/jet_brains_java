package com.company;

import java.util.Scanner;
class Natural{
  //  private static int num1;

    public  void natural(String[] args){
        System.out.println("please enter the natural numbers");
        Scanner scanner = new Scanner(System.in);
     //   int v = 10;

        int sum = 0;
        int num1 = scanner.nextInt();
        for(int i = 0; i<= num1 ; ++i)
        {
            sum = sum + i;
        }
        System.out.println("your sum is " + sum);
    }
}