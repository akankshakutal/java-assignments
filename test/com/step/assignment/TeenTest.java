package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenTest {

  @Test
  void hasTeen() {
    assertEquals(true,Teen.hasTeen(9,99,19));
    assertEquals(true,Teen.hasTeen(23,15,42));
    assertEquals(false,Teen.hasTeen(22,23,34));
    assertEquals(false,Teen.hasTeen(9));
    assertEquals(true,Teen.hasTeen(13));

  }
}