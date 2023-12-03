package com.br.javawars.kyu_7.smallestvalueofanarray;

public class SmallestValueInArray {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        int smallestValue = Integer.MAX_VALUE;
        int currentIndex = 0;
        int indexOfSmallestValue = 0;

        for (int number: numbers) {
            if (number < smallestValue) {
                smallestValue = number;
                indexOfSmallestValue = currentIndex;
            }
            currentIndex++;
        }

        return "index".equals(toReturn) ? indexOfSmallestValue : smallestValue;
    }
}
