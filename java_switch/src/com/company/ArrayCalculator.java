package com.company;

import  java.util.Scanner;
class ArrayCalculator {
    private Object Calculator;
  //  private Calculator;

    public void arrayCalc(){
        Scanner input = new Scanner(System.in);
        double[] array = new double[5];
        int sum;
        Calculator arrayClc = new Calculator();
      //  arrayClc.

        for(int i=0; i<=5;++i)
        {
            array[i] = input.nextDouble();
        }
        double result =0;
        for(int i = 0; i<=5;++i)
        {
            result = arrayClc.performOperation('+',array[i],result);
        }
        System.out.println(result);
    }

}