package org.AlexeyKalitin;

import java.io.*;
import java.util.Arrays;

public class ArrayOfNumbers implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public String serialization(int[] number) {
        String result = "";
        for (int j : number) {
            result += j;
        }
        return result;
    }

    public int[] deserialization(String str) {
        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

}
