package com.company;

//import java.util.Scanner;
class ForEachLoop2{
    public static void forEachLoop2(){
     //   System.out.println("PLEASE ENTER THE VALUES IN THE ARRAY ");
      //  Scanner sc = new Scanner(System.in);
      //  int numbers = sc.nextInt();
        /* int [a]; */
    //    int[a int[] ints = new int[numbers];] = /new int[numbers];
         int[] numbers = {1,2,3,4,5,-4,-12,32,43};
         int sum = 0;
         for(int number:numbers){
             sum += number;
             System.out.println("sum of array is = "+ sum);
         }
    }

}