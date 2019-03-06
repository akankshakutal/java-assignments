package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

  @Test
  void hasSharedDigit() {
    assertEquals(true,SharedDigit.hasSharedDigit(12,23));
    assertEquals(false,SharedDigit.hasSharedDigit(9,99));
    assertEquals(true,SharedDigit.hasSharedDigit(15,55));

  }
}