package com.example.codingtest.class1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class codingTest3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] start = new String[10];
        String[] t = new String[10];

        for (int i = 0; i < 10; i++) {
            start[i] = scanner.next();
            t[i] = String.valueOf(Integer.parseInt(start[i]) % 42);
        }

        List<String> dupLins = new ArrayList<>(List.of(t)).stream().distinct().collect(Collectors.toList());

        System.out.println(dupLins.size());
    }
}
