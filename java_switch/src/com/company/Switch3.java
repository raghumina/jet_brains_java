package com.company;

// Problem
// What is the value of num if we remove both break keywords?

class Switch3 {
    public static void switch3() {
        char ch = 'a';
        int num = 0;
        switch (ch) {
            case 'a':
                num = 10;
            //   break;
            case 'b':
                num = 20;
             //  break;
            default:
                num = 30;
        }
    }
}