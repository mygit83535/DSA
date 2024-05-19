package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	static int comparisons = 0;
	public static int binarySearch(int arr[], int N, int key) {
		

		
		int left = 0, right = N-1, mid;
		
		while(left <= right) {
		
			mid = (left + right)/2;
			comparisons++;
			
			if(key == arr[mid])
			
				return mid;
		
			else if(key < arr[mid])
				right = mid - 1;
			
			else
				left = mid + 1;
		}
		
		
		 return -1;
	}


	public static void main(String[] args) {
	
        int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
	
		 
        if (index != -1) {
            System.out.println("Key is found at index " + index);
           
        } else {
            System.out.println("Key is not found");
         
        }
        System.out.println("Number of comparisons: " + comparisons);

        sc.close();
	}


	}


