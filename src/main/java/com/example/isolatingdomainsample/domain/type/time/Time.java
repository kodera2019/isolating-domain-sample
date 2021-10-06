package com.example.isolatingdomainsample.domain.type.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 時刻を時分単位で表す
 */
public class Time {

  LocalTime value;

  @Deprecated
  public Time() {
  }

  public Time(String value) {
    this.value = LocalTime.parse(value, DateTimeFormatter.ofPattern("H:m"));
  }

  public Time(LocalTime value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return DateTimeFormatter.ofPattern("HH:mm").format(value);
  }

  public boolean isAfter(Time other) {
    return value.isAfter(other.value);
  }

  public boolean isBefore(Time other) {
    return value.isBefore(other.value);
  }

  public LocalTime value() {
    return value;
  }
}
