package com.example.codingtest.class1;

import java.util.*;

public class codingTest10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        scanner.nextLine();
        String index = scanner.nextLine();
        String[] indexArray = index.split(" ");
        int[] indexArrayLength = Arrays.stream(indexArray).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(indexArrayLength).max().getAsInt();
        int min = Arrays.stream(indexArrayLength).min().getAsInt();
        System.out.println(min + " " + max);
    }
}
