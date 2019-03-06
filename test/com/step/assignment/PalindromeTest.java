package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

  @Test
  void isPalindrome() {
    assertEquals(true,Palindrome.isPalindrome(707));
    assertEquals(false,Palindrome.isPalindrome(11212));
    assertEquals(true,Palindrome.isPalindrome(-1221));

  }
}