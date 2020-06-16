package com.company;

public class Main {

    public static void main(String[] args) {
        int result = add(6, 5, 1, 2, 4, 5, 99);
        System.out.println(result);
    }

    private static int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            System.out.println("element " + (i + 1) + " to " + value);
            sum += value;
        }
        return sum;
    }
}
