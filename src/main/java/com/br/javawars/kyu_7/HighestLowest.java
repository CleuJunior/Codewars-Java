package com.br.javawars.kyu_7;

import java.util.Arrays;

public class HighestLowest {

    private static int[] stringArrayToIntArraySorted(String numbers){
        String[] stringToArray = numbers.split(" ");
        int[] intToArray = new int[stringToArray.length];

        for (int i = 0; i < stringToArray.length; i++) { intToArray[i] = Integer.parseInt(stringToArray[i]); }

        Arrays.sort(intToArray);
        return intToArray;

    }

    private static String[] intArrayToStringArray(int[] arrayOfInt){
        String[] stringToReturnAsArray = new String[arrayOfInt.length];

        for (int i = 0; i < arrayOfInt.length; i++) { stringToReturnAsArray[i] = Integer.toString(arrayOfInt[i]); }

        return stringToReturnAsArray;
    }
    public static String highAndLow(String numbers) {
        String[] stringComplete = intArrayToStringArray(stringArrayToIntArraySorted(numbers));

        return stringComplete[stringComplete.length-1] + " " + stringComplete[0];
    }
}
