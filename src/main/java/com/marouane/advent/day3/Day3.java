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


    public static int part2(String input) {
        return 0;
    }
}
