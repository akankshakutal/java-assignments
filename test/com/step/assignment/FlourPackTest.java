package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlourPackTest {

  @Test
  void canPack() {
    assertEquals(false,FlourPack.canPack(1,0,4));
    assertEquals(true,FlourPack.canPack(1,0,5));
    assertEquals(true,FlourPack.canPack(0,5,4));
    assertEquals(false,FlourPack.canPack(-3,2,12));
    assertEquals(true,FlourPack.canPack(2,1,5));
    assertEquals(true,FlourPack.canPack(4,18,19));


  }
}