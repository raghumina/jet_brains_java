package com.company;

class Method4 {
    public static void method4() {
        int x = 5, y = 10;
        System.out.println(getmax(x,y));
    }

    public static int getmax(int x, int y) {
        if (x > y) {
            return x;
        }
         else {
            return y;
        }

    }
}