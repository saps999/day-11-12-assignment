package com.bridgelabz;

import java.util.Scanner;


public class GCD {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbers: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        System.out.println("GCD=" + a);
    }
}
