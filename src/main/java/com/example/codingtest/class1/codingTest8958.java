package com.example.codingtest.class1;

import java.io.*;
import java.util.*;

public class codingTest8958 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);

        int index = scanner.nextInt();
        scanner.nextLine();

        String[] text = new String[index];
        int[] sumpoint = new int[index];

        for(int i = 0; i < index; i++) {

            text[i] = scanner.nextLine();

            int point = 0;

            for (int j = 0; j < text[i].length(); j++) {
                String textSplie = text[i].substring(j, j + 1);
                if (textSplie.equals("O")) {
                    point++;
                    sumpoint[i] += point;
                } else {
                    point = 0;
                }
            }
        }
        for(int i: sumpoint) {
            System.out.println(i);
        }
    }
}
