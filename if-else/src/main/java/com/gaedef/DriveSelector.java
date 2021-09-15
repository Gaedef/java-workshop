package com.gaedef;

public class DriveSelector {

  private int age;

  public void setAge(int age) {
    this.age = age;
  }

  public String getDrive() {
    if (age < 6) {
      return "TRICYCLE";
    } else {
      return "BICYCLE";
    }
  }
}
