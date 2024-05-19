package com.sunbeam;
public class LinearSearch {
    public static int findNthOccurrence(int[] arr, int target, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == n) {
                    return i; // Return the index of the nth occurrence
                }
            }
        }
        return -1; // If nth occurrence is not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 2, 8, 2, 3, 9};
        int target = 2;
        int n = 3;

        int index = findNthOccurrence(arr, target, n);
        if (index != -1) {
            System.out.println("The " + n + "th occurrence of " + target + " is at index " + index);
        } else {
            System.out.println("The " + n + "th occurrence of " + target + " is not found.");
        }
    }
}

