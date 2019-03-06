package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

  @Test
  void isLeapYear() {
    assertEquals(false,LeapYear.isLeapYear(-1600));
    assertEquals(true,LeapYear.isLeapYear(1600));
    assertEquals(false,LeapYear.isLeapYear(2017));
    assertEquals(true,LeapYear.isLeapYear(2000));

  }

  @Test
  void getDaysInMonth() {
    assertEquals(31,LeapYear.getDaysInMonth(1, 2020));
    assertEquals(29,LeapYear.getDaysInMonth(2, 2020));
    assertEquals(-1,LeapYear.getDaysInMonth(-1, 2020));
    assertEquals(-1,LeapYear.getDaysInMonth(1, -2020));

  }
}