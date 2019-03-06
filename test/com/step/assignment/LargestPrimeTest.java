package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeTest {

  @Test
  void getLargestPrime() {
    assertEquals(7,LargestPrime.getLargestPrime(21));
    assertEquals(31,LargestPrime.getLargestPrime(217));
    assertEquals(-1,LargestPrime.getLargestPrime(0));
    assertEquals(-1,LargestPrime.getLargestPrime(-1));
    assertEquals(5,LargestPrime.getLargestPrime(45));

  }
}