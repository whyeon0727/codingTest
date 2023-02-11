package com.example.codingtest;

import java.util.*;

public class codingTest2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] lines = line.split(" ");
            StringBuilder temp =  new StringBuilder();

            for (int j = 0; j < lines[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(lines[0]); k++) {
                    temp.append(lines[1].charAt(j));
                }

            }
            System.out.println(temp);
        }

    }
}
