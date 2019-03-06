package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

  @Test
  void getGreatestCommonDivisor() {
    assertEquals(5,GCD.getGreatestCommonDivisor(25, 15));
    assertEquals(6,GCD.getGreatestCommonDivisor(12, 30));
    assertEquals(-1,GCD.getGreatestCommonDivisor(9, 18));
    assertEquals(9,GCD.getGreatestCommonDivisor(81, 153));
  }
}