package com.marouane.advent.day5;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;

public class Day5 {

    public static int part1(String input, String lineSeparator) {
        String[] lines = input.split(lineSeparator);
        var valuesStartIndex = 0;
        List<ValueRange> ranges = new ArrayList<>();
        for (String line : lines) {
            valuesStartIndex++;
            if (line.contains("-")) {
                String[] values = line.split("-");
                ranges.add(ValueRange.of(Long.parseLong(values[0]), Long.parseLong(values[1])));
            } else {
                break;
            }
        }
        var result = 0;
        for (int i = valuesStartIndex; i < lines.length; i++) {
            // compare values
            var value = Long.parseLong(lines[i]);
            for(ValueRange range : ranges) {
                if(range.isValidValue(value)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public static int part2(String input) {
        return 0;
    }
}


