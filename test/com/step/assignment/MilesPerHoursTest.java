package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilesPerHoursTest {

  @Test
  void shouldReturnNegativeNumber() {
    assertEquals(-1,MilesPerHours.toMilesPerHour(-10.20));
  }

  @Test
  void shouldReturnConvertedValue() {
    assertEquals(1,MilesPerHours.toMilesPerHour(1.5));
    assertEquals(6,MilesPerHours.toMilesPerHour(10.25));
    assertEquals(-1,MilesPerHours.toMilesPerHour(-5.6));
    assertEquals(16,MilesPerHours.toMilesPerHour(25.42));
    assertEquals(47,MilesPerHours.toMilesPerHour(75.114));

  }

}