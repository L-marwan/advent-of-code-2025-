package com.marouane.advent.day2;

public class Day2 {


    public static long part1(String input) {
        var ranges = input.split(",");
        long sum = 0;
        for (String range : ranges) {
            long start = Long.parseLong(range.split("-")[0]);
            long end = Long.parseLong(range.split("-")[1]);
            for (long i = start; i <= end; i++) {
                var stringRepresentation = String.valueOf(i);
                var length = stringRepresentation.length();
                if (length % 2 != 0) continue;
                var firstPart = stringRepresentation.substring(0, length / 2);
                var secondPart = stringRepresentation.substring(length / 2);
                if (firstPart.equals(secondPart)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static long part2(String input) {
        var ranges = input.split(",");
        long sum = 0;
        for (String range : ranges) {
            long start = Long.parseLong(range.split("-")[0]);
            long end = Long.parseLong(range.split("-")[1]);
            for (long i = start; i <= end; i++) {
                var stringRepresentation = String.valueOf(i);
                if (isRepeatedPattern(stringRepresentation))
                    sum += i;
            }
        }
        return sum;
    }

    static boolean isRepeatedPattern(String stringRepresentation) {
        var length = stringRepresentation.length();

        for (int i = 1; i < (length/2)+1; i++) {
            var pattern = stringRepresentation.substring(0, i);
            if (isRepeatedPattern(pattern, stringRepresentation.substring(i))) {
                System.out.println(stringRepresentation);
                return true;
            }
        }

        return false;
    }

    private static boolean isRepeatedPattern(String pattern, String substring) {
        int patternLength = pattern.length();
        int substringLength = substring.length();

        if (patternLength == substringLength) {
            return pattern.equals(substring);
        }
        if (substringLength % patternLength != 0 || patternLength > substringLength
                || patternLength * 2 > substringLength) {
            return false;
        }

        for (var i = 0; i <= substringLength - patternLength; i = i + patternLength) {
            if (!pattern.equals(substring.substring(i, i + patternLength))) {
                return false;
            }

        }
        return true;
    }
}
