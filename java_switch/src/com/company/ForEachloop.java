package com.company;

class ForEachLoop{
    public static void forEachLoop(){
        int[] numbers={1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int number: numbers)
        {
            sum += number;
        }
        System.out.println("Sum ="+sum);
    }

}