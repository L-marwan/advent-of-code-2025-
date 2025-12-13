package com.marouane.advent.day5;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            for (ValueRange range : ranges) {
                if (range.isValidValue(value)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public static long part2(String input, String lineSeparator) {
        String[] lines = input.split(lineSeparator);
        List<ValueRange> ranges = new ArrayList<>();
        for (String line : lines) {
            if (line.contains("-")) {
                String[] values = line.split("-");
                ranges.add(ValueRange.of(Long.parseLong(values[0]), Long.parseLong(values[1])));
            } else {
                break;
            }
        }

        // merge overlapped ranges
        boolean merged;
        do {
            merged = false;

            List<ValueRange> mergedRanges = new ArrayList<>();
            Set<ValueRange> rangesToRemove = new HashSet<>();

            for (int i = 0; i < ranges.size(); i++) {
                ValueRange range = ranges.get(i);
                for (int j = i + 1; j < ranges.size(); j++) {
                    ValueRange range2 = ranges.get(j);
                    if(!rangesToRemove.contains(range2)) {
                        if (rangeOverlap(range, range2)) {
                            mergedRanges.add(mergeRange(range, range2));
                            rangesToRemove.add(range);
                            rangesToRemove.add(range2);
                            merged = true;
                        }
                    }

                }
            }
            if (!rangesToRemove.isEmpty()) {
                for (ValueRange range : rangesToRemove) {
                    ranges.remove(range);
                }
            }
            for(ValueRange range : mergedRanges) {
                if(!ranges.contains(range)) {
                    ranges.add(range);
                }

            }

        } while (merged);

        long result = 0;
        for (ValueRange range : ranges) {
            result += range.getMaximum() - range.getMinimum() + 1;
        }
        return result;
    }

    static boolean rangeOverlap(ValueRange range1, ValueRange range2) {
        return range1.isValidValue(range2.getMaximum())
                || range1.isValidValue(range2.getMinimum())
                || range2.isValidValue(range1.getMaximum())
                || range2.isValidValue(range1.getMinimum());
    }

    static ValueRange mergeRange(ValueRange range1, ValueRange range2) {
        long min = range2.getMinimum();
        long max = range2.getMaximum();
        if (range1.getMinimum() < range2.getMinimum()) {
            min = range1.getMinimum();
        }
        if (range1.getMaximum() > range2.getMaximum()) {
            max = range1.getMaximum();
        }

        return ValueRange.of(min, max);
    }
}


