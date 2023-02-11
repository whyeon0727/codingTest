package com.example.codingtest;

import java.util.*;

public class codingTest2908 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lien = scanner.nextLine();
        String[] liens = lien.split(" ");
        String[] lineRevers = new String[liens.length];
        int[] liensCon = new int[liens.length];

        for(int i = 0; i < liens.length; i++) {
            lineRevers[i] = "";
            for(int j = liens[i].length()-1; j >= 0; j--){
                lineRevers[i] = lineRevers[i]+liens[i].charAt(j);
            }
        }

        int max = 0;

        for(String i: lineRevers) {

           int temp = Integer.parseInt(i);

            if(temp > max) max = temp;
        }

        System.out.println(max);

    }
}
