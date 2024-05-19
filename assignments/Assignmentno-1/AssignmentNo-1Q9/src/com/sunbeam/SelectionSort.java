package com.sunbeam;


import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int arr[], int N) {
		int passes = 0, comps = 0;
		for(int i = 0 ; i < N-1 ; i++) {
			passes++;
			//1. select one position from array (0 to N-1) --> i
			//2. compare selected position element with all other elements one by one
			for(int j = i + 1 ; j < N ; j++) {
				comps++;
				//3. if selected position element is greater than other element, then swap both
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("No of passes: " +passes);
		System.out.println("No of comps: " +comps);
	}

	public static void main(String[] args) {
		int arr[] = {44, 11, 55, 22, 66, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}

