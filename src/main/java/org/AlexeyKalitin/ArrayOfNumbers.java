package org.AlexeyKalitin;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayOfNumbers implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final int[] numbers;

    public ArrayOfNumbers(int[] arrayOfNumbers) {
        this.numbers = arrayOfNumbers;
    }

    public void serialization() {
        Arrays.sort(numbers);
        // Преобразовываем массив в строку, разделяя элементы запятой
        String serializedString = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));

        try (OutputStreamWriter outputStream = new OutputStreamWriter(
                new FileOutputStream("numbers.txt"), StandardCharsets.US_ASCII)) {
            for (int i = 0; i < serializedString.length(); i++) {
                outputStream.write(serializedString.charAt(i));
            }
            System.out.println("Serialization completed");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public char[] deserialization() {
        try (InputStreamReader inputStream = new InputStreamReader(
                new FileInputStream("numbers.txt"))) {
            int character;
            int max = 0;
            char[] desNumbers = new char[max];
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
                max++;
            }
            return desNumbers;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "ArrayOfNumbers{" +
                "arrayOfNumbers=" + Arrays.toString(numbers) +
                '}';
    }
}
