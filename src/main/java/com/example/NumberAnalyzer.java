package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("---------------------");
        System.out.println("---NUMBER ANALYZER---");
        System.out.println("---------------------");
        System.out.println("Enter your numbers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Wrong Input. Please enter an integer or 'done'.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
            return;
        }

        System.out.println("Count: " + numbers.size());
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Max: " + findMax(numbers));
    }

    public static int calculateSum(ArrayList<Integer> nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static double calculateAverage(ArrayList<Integer> nums) {
        return (double) calculateSum(nums) / nums.size();
    }

    public static int findMin(ArrayList<Integer> nums) {
        int min = nums.get(0);
        for (int n : nums) if (n < min) min = n;
        return min;
    }

    public static int findMax(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int n : nums) if (n > max) max = n;
        return max;
    }
}
