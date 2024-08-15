package com.br.javawars.kyu_6;

public class ArithmeticProgression {

    public static int findMissing(int[] numbers) {
        int abs = 0;
        int missing = 0;

        for (int i = numbers.length - 1; i > 0; i--) {
            abs = numbers[i] - numbers[i - 1];

            if (missing == 0) {
                missing = abs;
            }

            if (abs > missing) {
                return numbers[i] - missing;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 1};
        System.out.println(findMissing(numbers));
    }
}
