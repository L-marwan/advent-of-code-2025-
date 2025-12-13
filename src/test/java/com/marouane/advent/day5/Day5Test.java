package com.marouane.advent.day5;

import org.junit.jupiter.api.Test;

import java.time.temporal.ValueRange;

import static org.junit.jupiter.api.Assertions.*;

class Day5Test {


    @Test
    void part1Test(){
        var input = """
                3-5
                10-14
                16-20
                12-18
                
                1
                5
                8
                11
                17
                32
                """;

        assertEquals(3, Day5.part1(input,"\n"));
    }
    @Test
    void part2Test(){
        var input = """
                3-5
                10-14
                16-20
                12-18
                
                1
                5
                8
                11
                17
                32
                """;

        assertEquals(14, Day5.part2(input,"\n"));
    }

    @Test
    void mergeTest(){
        assertEquals(ValueRange.of(10,19), Day5.mergeRange(ValueRange.of(10,14), ValueRange.of(15,19)));
        assertEquals(ValueRange.of(10,30), Day5.mergeRange(ValueRange.of(10,30), ValueRange.of(15,19)));
        assertEquals(ValueRange.of(5,30), Day5.mergeRange(ValueRange.of(10,30), ValueRange.of(5,19)));
        assertEquals(ValueRange.of(5,30), Day5.mergeRange(ValueRange.of(10,30), ValueRange.of(5,12)));
    }

    @Test
    void overlapTest(){
        assertTrue(Day5.rangeOverlap(ValueRange.of(10,19), ValueRange.of(15,22)));
        assertTrue(Day5.rangeOverlap(ValueRange.of(10,19), ValueRange.of(15,18)));
        assertTrue(Day5.rangeOverlap(ValueRange.of(10,19), ValueRange.of(5,12)));
    }

}