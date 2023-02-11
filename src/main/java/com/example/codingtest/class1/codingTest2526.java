package com.example.codingtest.class1;

import java.util.Scanner;

public class codingTest2526 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];
        for(int i = 0; i <9 ; i++) {
            numbers[i]= scanner.nextInt();
        }
        scanner.nextLine();

        int max =0;
        int count = 0;

        for (int i = 0; i < 9; i++) {

            if(max < numbers[i]) {
                max = numbers[i];
                count = i+1;
            }

        }

        System.out.println(max);
        System.out.println(count);
    }
}