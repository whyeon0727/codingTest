package com.example.codingtest.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codingTest1654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        String[] lines = line.split(" ");

        int[] k = new int[Integer.parseInt(lines[0])];
        int idx = 0;
        long max = 0;

        for (int i = 0; i < Integer.parseInt(lines[0]); i++) {
            k[i] = Integer.parseInt(br.readLine());
            if(max < k[i]) {
                max = k[i];
            }
        }
        max++;

        long min = 0;
        long mid = 0;
        while (min < max) {
            mid = (max + min) / 2;
            int count = 0;

            for (int j : k) {
                count += (j / mid);

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
