package com.step.assignment;

import com.step.assignment.EvenDigitSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

  @Test
  void getEvenDigitSum() {
    assertEquals(20, EvenDigitSum.getEvenDigitSum(123456789));
    assertEquals(4,EvenDigitSum.getEvenDigitSum(252));
    assertEquals(-1,EvenDigitSum.getEvenDigitSum(-22));
  }
}