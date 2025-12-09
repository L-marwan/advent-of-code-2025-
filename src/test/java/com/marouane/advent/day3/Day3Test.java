package com.marouane.advent.day3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Day3Test {

    @Test
    void part1() {
        var input = """
                987654321111111
                811111111111119
                234234234234278
                818181911112111""";
        var expected = 357;

        assertEquals(expected, Day3.part1(input));
    }

    @Test
    void part2() {
        var input = """
                987654321111111
                811111111111119
                234234234234278
                818181911112111""";

        var expected = 3121910778619L;

        assertEquals(expected, Day3.part2(input));
    }

    @Test
    void getMaxTest() {
        assertEquals("987654321111", Day3.getMax(Arrays.stream("987654321111111".split("")).mapToInt(Integer::parseInt).toArray()));
        assertEquals("811111111119", Day3.getMax(Arrays.stream("811111111111119".split("")).mapToInt(Integer::parseInt).toArray()));
        assertEquals("434234234278", Day3.getMax(Arrays.stream("234234234234278".split("")).mapToInt(Integer::parseInt).toArray()));
        assertEquals("888911112111", Day3.getMax(Arrays.stream("818181911112111".split("")).mapToInt(Integer::parseInt).toArray()));

    }
}