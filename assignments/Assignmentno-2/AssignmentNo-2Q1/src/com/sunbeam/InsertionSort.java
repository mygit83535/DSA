package com.sunbeam;

public class InsertionSort {


	    public static int insertionSort(int[] arr) {
	        int comparisons = 0;
	        for (int i = 1; i < arr.length; i++) {
	            int temp = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > temp) {
	                arr[j + 1] = arr[j];
	                j--;
	                comparisons++;
	            }
	            arr[j + 1] = temp;
	        }
	        return comparisons;
	    }

	    public static void main(String[] args) {
	    	int arr[] = {55, 44, 22, 66, 11, 33};
	        int comparisons = insertionSort(arr);
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println("\nNumber of comparisons: " + comparisons);
	    }
	}


