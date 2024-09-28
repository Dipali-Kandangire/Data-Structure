package com.DataStructure;

public class Largest_SmallestArray {
    public static void getLargestAndSmallest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest value is: " + largest);
        System.out.println("Smallest value is: " + smallest);
    }

    public static void main(String[] args) {
        int numbers[] = {4, 5, 6, 7, 8, 9, 3};
        getLargestAndSmallest(numbers);
    }
}
