package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {

  @Test
  void calculateArea() {
    assertEquals(78.53982,Area.calculateArea(5.0));
    assertEquals(-1.0,Area.calculateArea(-1));
    assertEquals(20.0,Area.calculateArea(5.0,4.0));
    assertEquals(-1.0,Area.calculateArea(-1.0,4.0));

  }
}