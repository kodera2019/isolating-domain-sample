package com.example.isolatingdomainsample.domain.model.legislation;

import com.example.isolatingdomainsample.domain.type.amount.Percentage;

/**
 * 割増率（％）
 */
public class ExtraPayRate {
  Percentage value;

  @Deprecated
  public ExtraPayRate() {
  }

  public ExtraPayRate(Integer value) {
    this.value = new Percentage(value);
  }

  public Percentage value() {
    return value;
  }
}
