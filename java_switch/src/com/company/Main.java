package com.company;

//import com.company.*;
class Main {
    public static void main(String[] args) {
    Main.dayTest();
    MultiUserInput inputObject = new MultiUserInput();
    inputObject.printReverse();
         SwitchCase myObject = new SwitchCase();
         myObject.problem1("");
         myObject.problem2("");

    }
    public static void dayTest(){
        int week = 4;
        String day;

        // switch statement to check day
        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;

            // match the value of week
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println("The day is " + day);
    }
}