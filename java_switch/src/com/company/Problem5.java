package com.company;

//Find whether the given year is a leap year.
//Just a reminder: leap years are those years in which the year’s number is either divisible by 4,
// but not divisible by 100, or divisible by 400 (for example,
// the year 2000 is a leap year, but the year 2100 will not be a leap year).
//The program should work correctly for the years 1900 ≤ n ≤ 3000.
//Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.



import java.util.Scanner;
class Problem5{
    public static void problem5(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
      boolean x = (i %4)==0;
      boolean y = (i % 100)!=0;
      boolean z = ((i % 400)==0 && (i % 400 == 0));
      if(x&&(y||z)){
          System.out.println("Leap");
      }
      else
      {
          System.out.println("Regular");
      }
    }
}