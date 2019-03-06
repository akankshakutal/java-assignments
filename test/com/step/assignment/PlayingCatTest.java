package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {
  @Test
  void isCatPlaying() {
    assertEquals(false,PlayingCat.isCatPlaying(true,10));
    assertEquals(false,PlayingCat.isCatPlaying(false,36));
    assertEquals(true,PlayingCat.isCatPlaying(false,35));
  }
}