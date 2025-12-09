package com.marouane.advent;

import com.marouane.advent.day3.Day3;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Run {

    static void main(String[] args) throws URISyntaxException, IOException {
        String resourceName = "day3.txt";
        ClassLoader cl = Run.class.getClassLoader();
        var filePath = cl.getResource(resourceName);

            if (filePath == null) {
                System.err.println("Resource not found: " + resourceName);
                return;
            }
            String input = Files.readString(Paths.get(filePath.toURI()), StandardCharsets.UTF_8);
            long result = Day3.part2(input);
            System.out.println(result);

    }
}
