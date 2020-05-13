package com.company;

class Sum{
    int i  , y  ;
    Sum(int a,int b) {
        a = i;
        b = y;
    }
    void print(){
        System.out.println("i ="+i);
        System.out.println("y ="+y);

    }
}
class Constructor2{
    public static void constructor2(){
        Sum s = new Sum(20,30) ;
        s.print();
    }
}