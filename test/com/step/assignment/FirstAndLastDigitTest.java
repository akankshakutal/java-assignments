package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastDigitTest {

  @Test
  void sumFirstAndLastDigit() {
    assertEquals(4,FirstAndLastDigit.sumFirstAndLastDigit(252));
    assertEquals(9,FirstAndLastDigit.sumFirstAndLastDigit(257));
    assertEquals(0,FirstAndLastDigit.sumFirstAndLastDigit(0));
    assertEquals(10,FirstAndLastDigit.sumFirstAndLastDigit(5));
    assertEquals(-1,FirstAndLastDigit.sumFirstAndLastDigit(-10));

  }
}