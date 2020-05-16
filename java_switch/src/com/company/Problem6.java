package com.company;

//Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?
//Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width.
//Find out whether it is possible to break off exactly K segments from the chocolate
//with a single straight line: vertical or horizontal.
//Each segment is 1x1.
//Input data format
//The program gets an input of three integers: N, M, K.
//Output data format
//The program must output one of the two words: YES or NO.


import java.util.Scanner;

class Problem6 {
    public static void problem6() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (k % n == 0 && m >= k / n || k % m == 0 && n >= k / m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

