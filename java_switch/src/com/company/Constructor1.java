package com.company;

class Point{
    int x, y ;
    Point(int a, int b){
        x = a;
        y = b;
    }
    void print(){
        System.out.println("x ="+x);
        System.out.println("y ="+y);
    }
}
class Constructor1{
    public static void constructor1(){
        Point p = new Point(10,20);
        p.print();
    }
}