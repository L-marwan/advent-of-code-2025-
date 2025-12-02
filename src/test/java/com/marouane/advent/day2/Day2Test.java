package com.marouane.advent.day2;

import com.marouane.advent.day1.Day1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {

    @Test
    void part1Test() {
        var input = "11-22,95-115,998-1012,1188511880-1188511890,222220-222224,1698522-1698528,446443-446449,38593856-38593862,565653-565659,824824821-824824827,2121212118-2121212124";
        var expectedOutput = 1227775554L;

        assertEquals(expectedOutput, Day2.part1(input));
    }

    @Test
    void part2Test() {
        var input = "11-22,95-115,998-1012,1188511880-1188511890,222220-222224,1698522-1698528,446443-446449,38593856-38593862,565653-565659,824824821-824824827,2121212118-2121212124";
        var expectedOutput = 4174379265L;

        assertEquals(expectedOutput, Day2.part2(input));
    }
}