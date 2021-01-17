package com.tts;

import java.util.Arrays;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println("There is power in numbers!");
        int[] values = {42, 53, 64, 75, 86};
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        System.out.println("The total sum: " + sum);

        double[] twiceArray = {3, 15, 6, 25, 7, 1};
        double max = twiceArray[0];
        int index = 0;
        for (int i = 1; i < twiceArray.length; i++) {
            if (twiceArray[i] > max) {
                max = twiceArray[i];
                index = i;
            }
        }
        System.out.println("The output is: " + index);

        int size = 7;
        int power = 3;
        double[] result = toPower(size, power);
    }

    public static double[] toPower(int size, int power) {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] =
                    pow(i, power);
        }
        System.out.print("Here are the results of your hard work: " + Arrays.toString(result));
        return result;
    }
}

