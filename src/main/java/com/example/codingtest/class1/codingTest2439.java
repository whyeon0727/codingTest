package com.example.codingtest.class1;

import java.util.Scanner;

public class codingTest2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= start; i++) {

            for (int j = i; j < start; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
