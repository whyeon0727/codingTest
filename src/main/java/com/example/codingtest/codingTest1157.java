package com.example.codingtest;

import java.util.*;
import java.util.stream.Collectors;

public class codingTest1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        String[] lines = line.toUpperCase().split("");
        List<String> dupLins = new ArrayList<>(List.of(lines)).stream().distinct().collect(Collectors.toList());

        int[] lineCount = new int[dupLins.size()];

        String result = "";

        for (int i = 0; i < dupLins.size(); i++) {
            for (int j = 0; j < lines.length; j++) {
                    if (lines[j].equals(dupLins.get(i))) {
                        lineCount[i]++;
                    }
                }
        }

        int max = 0;

        for (int i = 0; i < lineCount.length; i++) {
            if (lineCount[i] > max) {
                max = lineCount[i];
                result = dupLins.get(i);
            } else if (lineCount[i] == max) {

                result = "?";
            }
        }
        System.out.println(result);

    }
}
