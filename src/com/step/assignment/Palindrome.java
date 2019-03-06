package com.step.assignment;

public class Palindrome {
  public static boolean isPalindrome (int number){
    int reverse = 0;
    int reminder = 0;
    int numberCopy = number;
    while (number != 0){
      reminder = number %10;
      reverse = reverse * 10 + reminder;
      number = number / 10;
    }
    if(reverse == numberCopy){
      return true;
    }
    return false;
  }
}
