package com.company;


//Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
//The program should print out the resulting string.
//Sample Input 1:
 //       aaa
  //      Sample Output 1:
  //      bbb


import java.util.Scanner;
class Strings2{
    public static void strings2(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    //    String First = s;
        System.out.println(s.replace("a","b"));

    }

}