package com.example.codingtest.class1;

import java.util.Scanner;

public class codingTest1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lines = line.split(" ");
        int count = 0;
        for(int i = 0; i < lines.length; i++) {
            if(lines[i].isEmpty()){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
