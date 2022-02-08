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
                    System.out.println("Print the square triangle( bottom-left)");
                    for (int i = 1; i <= 7 ; i++) {
                        for (int j = 1; j < i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle(top-left)");
                    for (int i = 6; i >= 1 ; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle( top-right)");
                    for (int i = 0; i<= 6; i++) {
                        for (int j = 0; j < i ; j++) {
                            System.out.print(" ");
                        }
                        for(int j = 1; j <= 6 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle( bottom-right)");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 0; j < 6 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    int k = 0;
                    for (int i = 1; i <= 4; ++i , k = 0) {
                        for (int j = 1; j <= 4 - i; ++j) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
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
