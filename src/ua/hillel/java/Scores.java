package ua.hillel.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class Scores {

    public static void main(String[] args) {
        int firstLevel = 3;
        int secondLevel = 4;
        int[][] score = new int[firstLevel][secondLevel];
        int[] result = new int[firstLevel];

        for (int i = 0; i < firstLevel; i++) {
            int sum = 0;
            for (int j = 0; j < secondLevel; j++) {
                score[i][j] = 10 * (i + 1) + j;
                sum += score[i][j];
            }
            result[i] = sum;
        }

        System.out.println(Arrays.toString(result));
    }
}
