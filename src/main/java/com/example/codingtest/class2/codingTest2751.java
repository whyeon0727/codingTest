package com.example.codingtest.class2;

import java.io.*;
import java.util.Arrays;

public class codingTest2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int index = 0;

        int input = Integer.parseInt(br.readLine());
        int[] numbers = new int[input];
        while (index < numbers.length) {
            numbers[index] = Integer.parseInt(br.readLine());
            index++;
        }

        Arrays.sort(numbers);

        for (int i : numbers) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }

}

