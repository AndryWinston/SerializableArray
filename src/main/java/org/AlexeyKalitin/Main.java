package org.AlexeyKalitin;

import java.lang.instrument.Instrumentation;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[300];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers(numbers);
        arrayOfNumbers.serialization();
        System.out.println(arrayOfNumbers.deserialization());

    }
}