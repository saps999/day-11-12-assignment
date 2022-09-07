package com.bridgelabz;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number: ");
        int num = sc.nextInt();
        String b = "";
        int temp = num;

        while (temp > 0)
        {
            int r = temp % 2;
            temp = temp / 2;
            b = r + b;
        }
        System.out.println("Binary Equivalent of " + num + " is " + b);

    }
}
