package com.sunbeam;
//1. Write all possibilites to check palindrome. Also do time and space complexity analysis.//



public class palindrome {
 
  public static boolean isPalindrome(int[] N) {
      int left = 0;
      int right = N.length - 1;
      
      while (left < right) {
          if (N[left] == N[right]) {
              return true;
          }
          left++;
          right--;
      }
      return false;
  }


public static void main(String[] args) {
  int[] nums = {1, 2, 3, 4, 3, 2, 1}; // Example array
  
  // Check if the array is a palindrome
  if (isPalindrome(nums)) {
      System.out.println("The array is a palindrome.");
  } else {
      System.out.println("The array is not a palindrome.");
  }
}
}



//1)Iterative Approach:
//Iterate over the string from both ends, comparing characters at each step.
//Time Complexity: O(n) where n is the length of the string.
//Space Complexity: O(1) because it doesn't use any extra space.

//2)Using Recursion:
//Recursively compare characters from both ends of the string.
//Time Complexity: O(n) where n is the length of the string.
//Space Complexity: O(n) due to recursive calls, as it uses the call stack.

//3)Reverse and Compare:
//Reverse the string and compare it with the original string.
//Time Complexity: O(n) where n is the length of the string.
//Space Complexity: O(n) because you need extra space to store the reversed string.

//4)Using Deque:
//Use a deque (double-ended queue) to efficiently check if the string is a palindrome.
//Time Complexity: O(n) where n is the length of the string.
//Space Complexity: O(n) because the deque needs extra space.

//*Each approach has its advantages and disadvantages. 
//The iterative approach is usually the most efficient one in terms of both time and space complexity. 
//However, the choice depends on factors like readability, simplicity, and specific requirements of the application.




