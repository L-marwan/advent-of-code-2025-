package com.marouane.advent.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {


    @Test
    void part1Test() {
        var input = """
L68
L30
R48
L5
R60
L55
L1
L99
R14
L82""";

        var expectedOutput = 3;

        assertEquals(expectedOutput, Day1.part1(input));
    }    @Test
    void part2Test() {
        var input = """
L68
L30
R48
L5
R60
L55
L1
L99
R14
L82""";

        var expectedOutput = 6;

        assertEquals(expectedOutput, Day1.part2(input));
    }

}