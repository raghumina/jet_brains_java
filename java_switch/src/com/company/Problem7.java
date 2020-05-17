package com.company;


//Write a program that calculates whether it will be able to make the required amount
// of coffee from the specified amount of ingredients.
//Examples
//The program should firstly request for water, then milk, then beans, then amount of cups.
//The symbol > represents the user input. Notice that it's not the part of the input.

//Example 1
//Write how many ml of water the coffee machine has:
//> 300
//Write how many ml of milk the coffee machine has:
//> 65
//Write how many grams of coffee beans the coffee machine has:
//> 100
//Write how many cups of coffee you will need:
//> 1
//Yes, I can make that amount of coffee
// REQUIRMENTS
//the coffee machine needs 200 ml of water, 50 ml of milk,
// and 15 g of coffee beans to make one cup of coffee.

import java.util.Scanner;

//class Problem7 {
 //   public static void problem7() {
        //Scanner sc = new Scanner(System.in);
        //Scanner n = new Scanner(System.in);
        //String word = sc.nextLine();
        //int number = n.nextInt();
        //System.out.println("How many cups of coffee you need \n "+number);
        //System.out.println("For "+number+" cups of coffee you will need");
        //System.out.println(number*200+" ml of water");
        //System.out.println(number*50+" ml  of milk ");
        //System.out.println(number*15+" g of coffee beans");

    //    Scanner sc = new Scanner(System.in);
    //    String word = sc.nextLine();
    //    int number = sc.nextInt();
    //    int number1 = sc.nextInt();
    //    int number2 = sc.nextInt();
    //    int number3 = sc.nextInt();
     //   int number = sc.nextInt();
     //   System.out.println("How many cups of coffee you will need " + number);

      //      System.out.println("Write How many of the water the coffee machine has\n"+number);
  //          System.out.println(number);
      //      System.out.println("How many ml of milk coffee machine has\n"+number1);

        //System.out.println(number1);
     //       System.out.println("How many grams of coffee beans the coffee machine has\n"+number2);
         //   System.out.println(number2);
      //      System.out.println("Write how many cups of coffee you will need:\n"+number3);
         //   System.out.println(number3);


  //  }
//}
  public class Problem7 {
      public static void problem7() {
          System.out.println("Starting to make a coffee");
          System.out.println("Grinding coffee beans");
          System.out.println("Boiling water");
          System.out.println("Mixing boiled water with crushed coffee beans");
          System.out.println("Pouring coffee into the cup");
          System.out.println("Pouring some milk into the cup");
          System.out.println("Coffee is ready!");

          System.out.println("Write how many ml of water the coffee machine has:");
          int ml_Water = 0;
          int ml_milk = 0;
          int g_Beans = 0;
          int num_Cups = 0;
          Scanner scanner = new Scanner(System.in);
          ml_Water = scanner.nextInt();
          System.out.println("Write how many ml of milk the coffee machine has: ");
          ml_milk = scanner.nextInt();
          System.out.println("Write how many grams of coffee beans the coffee machine has: ");
          g_Beans = scanner.nextInt();
          System.out.println("Write how many cups of coffee you will need: ");
          num_Cups = scanner.nextInt();

          int a = ml_Water/200;
          int b = ml_milk/50;
          int c = g_Beans/15;
          int min = 0;
          if (a <= b) {
              if (c <= a) {
                  min = c;
              } else {
                  min = a;
              }
          } else {
              if (c <= b) {
                  min = c;
              } else {
                  min = b;
              }
          }

          if ((min == 0) && (num_Cups == 0)) {
              System.out.println("Yes, I can make that amount of coffee");
          } else if (min == 0) {
              System.out.println("No, I can make only 0 cup(s) of coffee");
          }
          else if (num_Cups == min) {
              System.out.println("Yes, I can make that amount of coffee");
          }
          else if ((min >= 1) && (min < num_Cups)) {


              System.out.println("No, I can make only " + min + " cup(s) of coffee");

          }
          else if (min > num_Cups) {

              int N = min - num_Cups;
              System.out.println("Yes, I can make that amount of coffee (and even " + N + " more than that)");
          }
      }
  }