package com.bridgelabz;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int num = sc.nextInt();

        int d = 0;
        int temp = num;
        int i = 0;

        while (temp > 0) {
            int reminder = temp % 10;
            temp = temp / 10;
            d = d + reminder * (int) Math.pow(2, i++);
        }
        System.out.println("Decimal of " + num + " is " + d);
    }
}
