package com.bridgelabz;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal number: ");
        int num = sc.nextInt();

        int d = 0;
        int temp = num;
        int i = 0;

        while (temp > 0) {
            int r = temp % 10;
            temp = temp / 10;
            d = d + r * (int) Math.pow(8, i++);
        }
        System.out.println("Decimal of " + num + " is " + d);
    }
}
