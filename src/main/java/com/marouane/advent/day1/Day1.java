package com.marouane.advent.day1;

public class Day1 {
    public static int part1(String input) {

        var lines = input.split("\n");
        int value = 50;
        int zeroCounter = 0;
        for (String line : lines) {

            int rotationValue = Integer.parseInt(line.strip().substring(1));

            var result = rotate(line, value, rotationValue);
            value = result.newValue;
            if (value == 0) {
                zeroCounter++;
            }
            ;

        }
        return zeroCounter;
    }

    public static int part2(String input) {
        var lines = input.split("\n");
        int value = 50;
        int zeroCounter = 0;
        for (String line : lines) {

            int rotationValue = Integer.parseInt(line.strip().substring(1));

            var result = rotate(line, value, rotationValue);
            value = result.newValue;
            zeroCounter += result.zeroClicks;
            System.out.println("zeroCounter: " + zeroCounter);
        }
        return zeroCounter;
    }

    private static RotationResult rotate(String line, int value, int rotationValue) {
        var zeroClicks = 0;

        int max = 100;
        if (line.startsWith("R")) {
            for (int i = 0; i < rotationValue; i++) {
                value++;
                if (value == max) {
                    value = 0;
                    zeroClicks++;
                }
            }
            System.out.println(value);
        } else if (line.startsWith("L")) {
            if (value == 0) {// don't count 0 twice
                value = max - 1;
                rotationValue--;
            }
            for (int i = 0; i < rotationValue; i++) {
                value--;
                if(value == 0) {
                    zeroClicks++;
                }
                if (value == -1) {
                    value = max - 1;
                }
            }

            System.out.println(value);
        }
        return new RotationResult(value, zeroClicks);
    }

    record RotationResult(int newValue, int zeroClicks) {
    }
}
