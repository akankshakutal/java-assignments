package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MegaBytesAndKiloBytesTest {

  @Test
  void printMegaBytesAndKiloBytes() {
    assertEquals("2500 KB = 2 MB and 452 KB",MegaBytesAndKiloBytes.printMegaBytesAndKiloBytes(2500));
    assertEquals("Invalid Value",MegaBytesAndKiloBytes.printMegaBytesAndKiloBytes(-1024));
    assertEquals("5000 KB = 4 MB and 904 KB",MegaBytesAndKiloBytes.printMegaBytesAndKiloBytes(5000));
  }
}