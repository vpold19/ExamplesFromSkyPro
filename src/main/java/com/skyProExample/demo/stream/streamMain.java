package com.skyProExample.demo.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMain {
    public static void main(String[] args) {

        int[] array = new int[10];
        Arrays.stream(array);


        Stream.of(1);

        Stream.of(1, 2, 3, 4);

        Stream.builder().add(1).add(2).add(3).build();

        Stream.iterate(0, i -> i++);

        Stream.generate(() -> Math.random() % 123);

//        try (Stream<String> lines =
//                     Files.lines(Path.of("/usr/local/java/tutorial.txt"))) {
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Stream.of(1, 2, 3, 4, 5, 6)
                .parallel()
                .peek(i -> System.out.println("Peek " + i))
                .filter(i -> {
                    System.out.println("Filter " + i);
                    return true;
                })
                .limit(3)
                .forEach(i -> System.out.println("ForEach " + i));
    }
}
