package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
    
    public static int[] linearSearch(int arr[], int N, int key) {
        int comparisons = 0;
        // 1. decide key to be searched - key
        // 2. start traversing from one end of collection
        for (int i = 0; i < N - 1; i++) {
            comparisons++;
            // 3. compare key with each element of collection
            if (key == arr[i])
                // 4. if key is found then stop searching and return the index
                return new int[]{i, comparisons};
        }
        // 5. if key is not found compare with next element of collection till last element
        return new int[]{-1, comparisons};
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {88, 33, 66, 11, 77, 22, 11, 55, 99, 14};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key to be searched : ");
        int key = sc.nextInt();

        int[] result = linearSearch(arr, arr.length, key);
        int index = result[0];
        int comparisons = result[1];
        
        if (index != -1) {
            System.out.println("Key is found at index " + index);
            System.out.println("Number of comparisons: " + comparisons);
        } else {
            System.out.println("Key is not found");
            System.out.println("Number of comparisons: " + comparisons);
        }

        sc.close();
    }
}
