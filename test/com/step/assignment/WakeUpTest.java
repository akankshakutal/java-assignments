package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WakeUpTest {

  @Test
  void shouldWakeUp() {
    assertEquals(true,WakeUp.shouldWakeUp(true,1));
    assertEquals(false,WakeUp.shouldWakeUp(false,2));
    assertEquals(false,WakeUp.shouldWakeUp(true,8));
    assertEquals(false,WakeUp.shouldWakeUp(true,-1));
  }
}