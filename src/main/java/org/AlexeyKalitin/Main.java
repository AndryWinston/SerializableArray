package org.AlexeyKalitin;


import java.util.Random;

public class Main {

    static int[] number;

    public static void main(String[] args) {

        number = Main.fillArray(50);

        //Получаем размер оригинального массива в битах
        int bitsPerElement = Integer.SIZE;
        int bitsInOriginalArray = number.length * bitsPerElement;

        //Получаем размер серилиазированного массива в битах
        ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers();
        String compressedArray = arrayOfNumbers.serialization(number);
        int sizeInBytes = compressedArray.getBytes().length;
        int bitsInCompressedArray = sizeInBytes * 8;

        double compressedProcent = (((double) bitsInCompressedArray * 100) / bitsInOriginalArray);
        System.out.println(100 - compressedProcent);
    }

    private static int[] fillArray(int arrayLength) {
        Random random = new Random();
        number = new int[arrayLength];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(0, 300);
        }
        return number;
    }
}