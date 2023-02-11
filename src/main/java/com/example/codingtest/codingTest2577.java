package com.example.codingtest;

import java.util.*;

public class codingTest2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = new int[3];
        for (int i = 0; i < 3; i++) {
            number[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int multi = number[0] * number[1] * number[2];
        String multiStr = String.valueOf(multi);
        String[] multiStrs = multiStr.split("");

        int[] multiStrsToint = Arrays.stream(multiStrs).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(multiStrsToint);

        int[] count = new int[10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < multiStrsToint.length; j++) {
                if (multiStrsToint[j] == i) {
                    count[i]++;
                }
            }
            System.out.println(count[i]);
        }

    }
}
