package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualByThreeDecimalPlacesTest {

  @Test
  void areEqualByThreeDecimalPlaces() {
    assertEquals(true,EqualByThreeDecimalPlaces.areEqualByThreeDecimalPlaces(10.125,20.125));
    assertEquals(false,EqualByThreeDecimalPlaces.areEqualByThreeDecimalPlaces(3.175, 3.176));
    assertEquals(true,EqualByThreeDecimalPlaces.areEqualByThreeDecimalPlaces(3.0, 3.0));
    assertEquals(true,EqualByThreeDecimalPlaces.areEqualByThreeDecimalPlaces(-3.123, 3.123));

  }
}