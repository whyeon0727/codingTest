package com.example.codingtest.class1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class codingTest2884 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH mm");

        Date date = dateFormat.parse(line);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        localDateTime.minusMinutes(45).format(DateTimeFormatter.ofPattern("HH mm"));
        System.out.println(localDateTime.minusMinutes(45).format(DateTimeFormatter.ofPattern("H m")));

    }
}
