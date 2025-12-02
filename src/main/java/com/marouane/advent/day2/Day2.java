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
                if(isRepeatedPattern(stringRepresentation))
                    sum += i;
            }
        }
        return sum;
    }

    private static boolean isRepeatedPattern(String stringRepresentation) {
        var length = stringRepresentation.length();
        for (int i = 1; i < length; i++) {
            var pattern = stringRepresentation.substring(0, i);
            var isRepeated = true;
            var j= pattern.length();
            while (isRepeated  && j<=length ) {
                if (j+ pattern.length() > length) {
                    return false;
                }
                if (!pattern.equals(stringRepresentation.substring(j,j+pattern.length()))) {
                    isRepeated = false;
                }
                j = j+pattern.length();
            }
            if (!isRepeated) {
                return false;
            }
        }


        return true;
    }
}
