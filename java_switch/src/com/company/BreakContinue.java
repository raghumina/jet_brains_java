package com.company;

class BreakContinue{
    public static void breakContinue(){
        int i = 0;
        while(i<3){
            System.out.println("Before " + i);
            i++;
            if(i==2) {
                continue;
            }
                System.out.println("After " + i);
               // i++;
            }

    }
}