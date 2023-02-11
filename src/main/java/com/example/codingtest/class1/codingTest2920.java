package com.example.codingtest.class1;

import java.util.*;

public class codingTest2920 {
    public static void main(String[] args) {

        String[] text = {"ascending","descending","mixed","123"};

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] strSplit = str.split(" ");
        int[] numberArr = new int[strSplit.length];
        int[] numberTemp = new int[strSplit.length];

        for(int i = 0; i < strSplit.length; i++) {
            numberArr[i] = Integer.parseInt(strSplit[i]);
            numberTemp[i] = Integer.parseInt(strSplit[i]);
        }

        Arrays.sort(numberTemp);

        if(!Arrays.equals(numberArr, numberTemp)){
            Integer[] numbers = Arrays.stream(numberArr).boxed().toArray(Integer[]::new);
            Arrays.sort(numbers, Collections.reverseOrder());
            numberTemp = Arrays.stream(numbers).mapToInt(Integer::intValue).toArray();
            if(!Arrays.equals(numberArr, numberTemp)){
                System.out.println(text[2]);
                return;
            }
            System.out.println(text[1]);
        }
        else {
            System.out.println(text[0]);
        }

    }
}
