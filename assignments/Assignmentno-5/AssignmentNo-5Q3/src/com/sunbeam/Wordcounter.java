package com.sunbeam;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Wordcounter 
{

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a line of text:");
	        String input = scanner.nextLine();
	        
	     
	        Map<String, Integer> wordCountMap = countWordOccurrences(input);
	        
	     
	        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        scanner.close();
	    }

	    public static Map<String, Integer> countWordOccurrences(String input) {
	        Map<String, Integer> wordCountMap = new HashMap<>();
	        
	        
	        String[] words = input.split("\\W+");
	        
	      
	        for (String word : words) {
	            if (word.isEmpty()) {
	                continue;
	            }
	            word = word.toLowerCase();
	            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	        }
	        
	        return wordCountMap;
	    }
	}


