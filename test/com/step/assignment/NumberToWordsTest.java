package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {

  @Test
  void reverse() {
    assertEquals(121,NumberToWords.reverse(-121));
    assertEquals(1212,NumberToWords.reverse(2121));
    assertEquals(1234,NumberToWords.reverse(4321));
    assertEquals(1,NumberToWords.reverse(100));
  }

  @Test
  void getDigitCount() {
    assertEquals(1,NumberToWords.getDigitCount(0));
    assertEquals(3,NumberToWords.getDigitCount(123));
    assertEquals(-1,NumberToWords.getDigitCount(-12));
    assertEquals(4,NumberToWords.getDigitCount(5200));

  }
}