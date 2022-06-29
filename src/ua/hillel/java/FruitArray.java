package ua.hillel.java;

import java.sql.Array;
import java.util.Arrays;

public class FruitArray {

    public static void main(String[] args) {
        String[] fruits = {"Apples", "Oranges", "Pears", "Grapes", "Watermelons", "Plumes", "Bananas", "Raspberries"};

        String[] food;
        food = Arrays.copyOf(fruits, fruits.length);

        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
    }
}
