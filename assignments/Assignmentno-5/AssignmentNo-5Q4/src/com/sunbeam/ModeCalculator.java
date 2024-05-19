package com.sunbeam;
import java.util.HashMap;
import java.util.Map;

	public class ModeCalculator {
	    public static void main(String[] args) {
	        int[] array = {4, 5, 6, 7, 5, 4, 5, 6, 7, 6, 4, 6, 4, 4};
	        
	        int mode = findMode(array);
	        
	        if (mode != -1) {
	            System.out.println("The mode of the array is: " + mode);
	        } else {
	            System.out.println("No mode found.");
	        }
	    }

	    public static int findMode(int[] array) {
	        if (array == null || array.length == 0) {
	            throw new IllegalArgumentException("Array is empty or null");
	        }
	        
	     
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        
	        for (int num : array) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }
	        
	       
	        int mode = array[0];
	        int maxCount = frequencyMap.get(mode);
	        
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxCount = entry.getValue();
	                mode = entry.getKey();
	            }
	        }
	        
	        
	        return mode;
	    }
	}



