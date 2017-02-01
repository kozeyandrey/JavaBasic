package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Sum is " + (num1 + num2));
    }
}
