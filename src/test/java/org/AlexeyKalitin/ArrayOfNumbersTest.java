package org.AlexeyKalitin;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayOfNumbersTest {
    ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers();

    private int[] fillArray(int arrayLength) {
        Random random = new Random();
        int[] number = new int[arrayLength];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(0, 300);
        }
        return number;
    }

    @Test
    void serializationOn50() {
        //Получаем наполненный массив
        ArrayOfNumbersTest arrayOfNumbersTest = new ArrayOfNumbersTest();
        int[] number = arrayOfNumbersTest.fillArray(50);

        //Получаем размер оригинального массива в битах
        int bitsPerElement = Integer.SIZE;
        int bitsInOriginalArray = number.length * bitsPerElement;

        //Получаем размер серилиазированного массива в битах
        String compressedArray = arrayOfNumbers.serialization(number);
        byte[] bytes = compressedArray.getBytes();
        int bitsInCompressedArray = bytes.length * 8;

        double compressedProcent = 100 - (((double) bitsInCompressedArray * 100) / bitsInOriginalArray);
        boolean isTrue = compressedProcent < 50;

        assertTrue(isTrue);
    }
    @Test
    void serializationOn100() {
        //Получаем наполненный массив
        ArrayOfNumbersTest arrayOfNumbersTest = new ArrayOfNumbersTest();
        int[] number = arrayOfNumbersTest.fillArray(100);

        //Получаем размер оригинального массива в битах
        int bitsPerElement = Integer.SIZE;
        int bitsInOriginalArray = number.length * bitsPerElement;

        //Получаем размер серилиазированного массива в битах
        String compressedArray = arrayOfNumbers.serialization(number);
        byte[] bytes = compressedArray.getBytes();
        int bitsInCompressedArray = bytes.length * 8;

        double compressedProcent = 100 - (((double) bitsInCompressedArray * 100) / bitsInOriginalArray);
        boolean isTrue = compressedProcent < 50;

        assertTrue(isTrue);
    }
    @Test
    void serializationOn500() {
        //Получаем наполненный массив
        ArrayOfNumbersTest arrayOfNumbersTest = new ArrayOfNumbersTest();
        int[] number = arrayOfNumbersTest.fillArray(500);

        //Получаем размер оригинального массива в битах
        int bitsPerElement = Integer.SIZE;
        int bitsInOriginalArray = number.length * bitsPerElement;

        //Получаем размер серилиазированного массива в битах
        String compressedArray = arrayOfNumbers.serialization(number);
        byte[] bytes = compressedArray.getBytes();
        int bitsInCompressedArray = bytes.length * 8;

        double compressedProcent = 100 - (((double) bitsInCompressedArray * 100) / bitsInOriginalArray);
        boolean isTrue = compressedProcent < 50;

        assertTrue(isTrue);
    }
    @Test
    void serializationOn1000() {
        //Получаем наполненный массив
        ArrayOfNumbersTest arrayOfNumbersTest = new ArrayOfNumbersTest();
        int[] number = arrayOfNumbersTest.fillArray(1000);

        //Получаем размер оригинального массива в битах
        int bitsPerElement = Integer.SIZE;
        int bitsInOriginalArray = number.length * bitsPerElement;

        //Получаем размер серилиазированного массива в битах
        String compressedArray = arrayOfNumbers.serialization(number);
        byte[] bytes = compressedArray.getBytes();
        int bitsInCompressedArray = bytes.length * 8;

        double compressedProcent = 100 - (((double) bitsInCompressedArray * 100) / bitsInOriginalArray);
        boolean isTrue = compressedProcent < 50;

        assertTrue(isTrue);
    }
}