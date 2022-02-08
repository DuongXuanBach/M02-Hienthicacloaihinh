package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choise = -1;
        Scanner input = new Scanner(System.in);
        while (choise != 0) {
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 8; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 1; i <= 7 ; i++) {
                        for (int j = 1; j < i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 7; i >= 1 ; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choise!");
            }
        }

	// write your code here
    }
}
