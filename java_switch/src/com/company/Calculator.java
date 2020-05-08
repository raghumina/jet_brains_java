package com.company;

import java.util.Scanner;

class Calculator{
    public  void calc() {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
     //   Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter operator (either +, -, * or /): ");
        Scanner scanner = new Scanner(System.in);
        // ask user to enter operator
       // operator = scanner.next().charAt(0);
        System.out.print("Enter number1 and number2 : ");

       // Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter operator (either +, -, * or /): ");
       // operator = scanner.next().charAt(0);


        // ask user to enter numbers
        number1 = scanner.nextDouble();
        System.out.print("Enter operator (either +, -, * or /): ");
        operator = scanner.next().charAt(0);
        number2 = scanner.nextDouble();

        switch (operator) {


            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;

            // perform substraction betw
            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;


            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}







