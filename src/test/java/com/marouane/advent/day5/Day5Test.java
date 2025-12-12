package com.marouane.advent.day5;

import org.junit.jupiter.api.Test;

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

}