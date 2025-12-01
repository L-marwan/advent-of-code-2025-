package com.marouane.advent;

import com.marouane.advent.day1.Day1;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Run {

    static void main(String[] args) throws URISyntaxException, IOException {
        String resourceName = "day1.txt";
        ClassLoader cl = Run.class.getClassLoader();
        var filePath = cl.getResource(resourceName);

            if (filePath == null) {
                System.err.println("Resource not found: " + resourceName);
                return;
            }
            String input = Files.readString(Paths.get(filePath.toURI()), StandardCharsets.UTF_8);
            int result = Day1.part2(input);
            System.out.println(result);

    }
}
