package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumTest {

  @Test
  void hasEqualSum() {
    assertEquals(false,EqualSum.hasEqualSum(1,1,1));
    assertEquals(true,EqualSum.hasEqualSum(1,1,2));
    assertEquals(true,EqualSum.hasEqualSum(1,-1,0));

  }
}