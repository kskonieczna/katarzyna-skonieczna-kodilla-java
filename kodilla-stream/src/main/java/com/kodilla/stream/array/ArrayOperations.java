package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        IntStream.range(0,10).forEach(System.out::println);

        OptionalDouble averageNumber = IntStream.range(0, 10)
                .average();

        return averageNumber;
    }
}