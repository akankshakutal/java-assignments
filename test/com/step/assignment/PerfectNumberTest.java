package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

  @Test
  void isPerfectNumber() {
    assertEquals(true,PerfectNumber.isPerfectNumber(6));
    assertEquals(true,PerfectNumber.isPerfectNumber(28));
    assertEquals(false,PerfectNumber.isPerfectNumber(5));
    assertEquals(false,PerfectNumber.isPerfectNumber(-1));

  }
}