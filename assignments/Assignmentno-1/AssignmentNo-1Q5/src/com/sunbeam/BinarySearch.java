package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int N, int key) {
		//1. decide key to be searched - key also decide left and right of the array
		int left = 0, right = N-1, mid;
		while(left <= right) {
			//2. find middle element of the array
			mid = (left + right)/2;
			//3. compare middle element with key
			if(key == arr[mid])
				//3.1 if key is matching, then return index of it
				return mid;
			//3.2 if key is less than middle element, then search it inside left partition
			else if(key > arr[mid])
				right = mid - 1;
			//3.3 if key is greater tha middle element, then search it inside right partition
			else
				left = mid + 1;
		}
		//4. if key is not found, then return -1
		return -1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {99, 88, 77, 66, 55, 44, 33, 22, 11};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
		
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();

	}

}











