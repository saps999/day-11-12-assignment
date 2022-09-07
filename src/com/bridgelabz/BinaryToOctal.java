package com.bridgelabz;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int num = sc.nextInt();

        int d = 0;
        int temp = num;
        int i = 0;
        String b = "";

        //first we convert binary to decimal

        while (temp > 0) {
            int reminder = temp % 10;
            temp = temp / 10;
            d = d + reminder * (int) Math.pow(2, i++);
        }
        //then we convert decimal to octal

        while (d > 0) {
            int reminder = d % 8;
            d = d / 8;
            b = reminder + b;
        }

        System.out.println("octal of " + num + " is " + b);

    }
}
