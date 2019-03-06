package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddTest {

  @Test
  void isOdd() {
    assertEquals(true,Odd.isOdd(3));
    assertEquals(false,Odd.isOdd(4));
  }

  @Test
  void sumOdd() {
    assertEquals(2500,Odd.sumOdd(1,100));
    assertEquals(-1,Odd.sumOdd(-1,100));
    assertEquals(0,Odd.sumOdd(100,100));
    assertEquals(-1,Odd.sumOdd(100,-100));
    assertEquals(247500,Odd.sumOdd(100,1000));
  }
}