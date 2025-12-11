package com.marouane.advent.day4;

import com.marouane.advent.day3.Day3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day4Test {

    @Test
    void part1() {
        var input= """
                ..@@.@@@@.
                @@@.@.@.@@
                @@@@@.@.@@
                @.@@@@..@.
                @@.@@@@.@@
                .@@@@@@@.@
                .@.@.@.@@@
                @.@@@.@@@@
                .@@@@@@@@.
                @.@.@@@.@.
                """;
        assertEquals(13, Day4.part1(input));
    }

    @Test
    void part2() {
        var input= """
                ..@@.@@@@.
                @@@.@.@.@@
                @@@@@.@.@@
                @.@@@@..@.
                @@.@@@@.@@
                .@@@@@@@.@
                .@.@.@.@@@
                @.@@@.@@@@
                .@@@@@@@@.
                @.@.@@@.@.
                """;
        assertEquals(43, Day4.part2(input));
    }
}