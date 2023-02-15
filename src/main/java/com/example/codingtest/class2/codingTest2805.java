package com.example.codingtest.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codingTest2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        String[] lines = line.split(" ");

        line = br.readLine();
        String[] heights = line.split(" ");

        long max = 0;

        for (String height : heights) {
            if (max < Integer.parseInt(height)) max = Integer.parseInt(height);
        }

        max++;

        long min = 0;
        long mid = 0;
        long count = 0;

        while (min < max) {

            mid = (max+min)/2;
            count = 0;
            for (String j : heights) {
                if(Integer.parseInt(j) - mid > 0) {
                    count += (Integer.parseInt(j) - mid);
                }
            }


            if (count < Integer.parseInt(lines[1])) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        sb.append(min == 0 ? max : min-1 );
        System.out.print(sb);
    }
}
