package com.example.codingtest.class1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class codinTest11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String num = scanner.nextLine();
        String[] num2 = num.split("");

        int sum1 = Stream.of(num2).mapToInt(Integer::parseInt).sum();

        System.out.println(sum1);

    }
}
