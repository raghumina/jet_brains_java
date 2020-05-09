package com.company;
// LEARNING THE BASICS OF THE LOOPS IN JAVA
// FOR LOOP :)
// This loop will perform the sum of the the 0 till the loop reaches to 100
// A BASIC FOR LOOP PROGRAM TO PERFORM OR CHECK LOOPS IN JAVA
class Forloop{
    public static void forloop(){
        int sum = 1;
        for(int i =0; i<=100;i++)
        {
            sum += i;
        }
        System.out.println("The Sum is " +sum);
    }

}