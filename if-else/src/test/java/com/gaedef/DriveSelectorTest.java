package com.gaedef;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DriveSelectorTest {

  private DriveSelector driveSelector = new DriveSelector();

  @Test
  @DisplayName("select a tricycle vehicle based in age")
  void shouldSelectTricycle() {
    driveSelector.setAge(4);
    assertEquals("TRICYCLE", driveSelector.getDrive());
  }

  @Test
  @DisplayName("select a bicycle vehicle based in age")
  void shouldSelectBicycle() {
    driveSelector.setAge(8);
    assertEquals("BICYCLE", driveSelector.getDrive());
  }
}
