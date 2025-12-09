package com.marouane.advent.day3;

import java.util.Arrays;

public class Day3 {

    public static int part1(String input) {
        var result = 0;
        for (String line : input.split("\n")) {
            int max = 0;
            for (int i = 0; i < line.length(); i++) {
                int tens = line.charAt(i) - '0';
                for (int j = i + 1; j < line.length(); j++) {
                    int val = tens * 10 + line.charAt(j) - '0';
                    if (val > max) {
                        max = val;
                    }
                }
            }
            result += max;
        }

        return result;
    }


    public static long part2(String input) {
        var result = 0L;
        for (String line : input.split("\n")) {

            int[] digits = Arrays.stream(line.trim().split("")).mapToInt(Integer::parseInt).toArray();
            String max = getMax(digits);
            System.out.println(max);
            result += Long.parseLong(max);

        }
        return result;
    }

     static String getMax(int[] digits) {
        var left = 12;
        var start = 0;
        String max="";

        while (left >0){
            var maxDigitIndex = start;
            for(int i = start; i< digits.length- left +1; i++){
                if(digits[i]> digits[maxDigitIndex]){
                    maxDigitIndex = i;
                }
            }
            max+= digits[maxDigitIndex]+"";
            start=  maxDigitIndex +1;
            left--;
        }
        return max;
    }
}
