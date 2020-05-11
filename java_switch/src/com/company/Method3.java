package com.company;
// EXAMPLE OF MULTIPLE METHODS
class Method3{
    public static void method3(){
        System.out.println("METHOD3 BEGAINS\n");
        fun();
        System.out.println("METHOD3 ENDS ");
    }
    public static void fun(){
        System.out.println("FUN BEGAINS\n");
        fun2();
        System.out.println("FUN ENDS\n");
    }
    public static void fun2(){
        System.out.println("FUN2 BEGAINS");

    }
}