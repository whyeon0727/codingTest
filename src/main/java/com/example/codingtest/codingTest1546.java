package com.example.codingtest;

import java.io.*;

public class codingTest1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        String point = br.readLine();

        String[] pointSplit = point.split(" ");
        int sumPoint = 0;
        int maxPoint = 0;

        br.close();

        for (int i = 0; i < input; i++) {
            sumPoint += Integer.parseInt(pointSplit[i]);

            if(maxPoint < Integer.parseInt(pointSplit[i])){
                maxPoint = Integer.parseInt(pointSplit[i]);
            }
        }
        double avgPoint = sumPoint / (double)maxPoint*100 / input ;

        System.out.printf("%.2f", avgPoint);
    }
}
