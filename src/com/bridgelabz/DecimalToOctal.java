package com.bridgelabz;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number: ");
        int num = sc.nextInt();
        String b = "";
        int temp = num;

        while (temp > 0)
        {
            int r = temp % 8;
            temp = temp / 8;
            b = r + b;
        }
        System.out.println("Octal number Equivalent of " + num + " is " + b);

    }
}
