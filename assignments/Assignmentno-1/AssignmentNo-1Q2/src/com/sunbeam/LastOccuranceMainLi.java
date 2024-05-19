package com.sunbeam;

import java.util.Scanner;

public class LastOccuranceMainLi {

	public static int linearSearch(int arr[], int N, int key) {
		//1. decide key to be searched - key
		//2. start traversing from one end of collection
		for(int i = N-1 ; i>=0 ; i--) {
			//3. compare key with each element of collection
			if(key == arr[i])
				//4. if key is found then stop searching and print/return the result
				return i;	
		}
		//5. if key is not found compare with next element of collection till last element
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {88, 33, 33, 66, 99, 11, 77, 22, 11, 55, 99, 14};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, arr.length, key);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}


}
