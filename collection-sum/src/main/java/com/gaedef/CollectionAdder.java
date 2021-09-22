package com.gaedef;

import java.util.List;

public class CollectionAdder {
  public int sum(List<Integer> numbers) {
    int sum = 0;
    for (Integer i : numbers) {
      sum += i;
    }
    return sum;
  }
}
