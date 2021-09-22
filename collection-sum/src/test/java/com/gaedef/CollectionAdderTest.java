package com.gaedef;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionAdderTest {

  private CollectionAdder collectionAdder = new CollectionAdder();

  @Test
  @DisplayName("should sum a collection")
  void shouldSumCollection() {
    assertEquals(35, collectionAdder.sum(Arrays.asList(1,7,8,9,10)));
  }
}
