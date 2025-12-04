package com.marouane.advent.day3;

import org.junit.jupiter.api.Test;

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
    }
}