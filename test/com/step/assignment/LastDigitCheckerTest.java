package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

  @Test
  void hasSameLastDigit() {
    assertEquals(true,LastDigitChecker.hasSameLastDigit (41, 22, 71));
    assertEquals(true,LastDigitChecker.hasSameLastDigit (23, 32, 42));
    assertEquals(false,LastDigitChecker.hasSameLastDigit (9, 99, 999));
  }

  @Test
  void isValid() {
    assertEquals(true,LastDigitChecker.isValid(10));
    assertEquals(false,LastDigitChecker.isValid(7));
    assertEquals(true,LastDigitChecker.isValid(1000));
    assertEquals(false,LastDigitChecker.isValid(1001));
  }
}