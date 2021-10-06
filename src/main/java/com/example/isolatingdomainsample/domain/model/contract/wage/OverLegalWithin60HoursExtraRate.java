package com.example.isolatingdomainsample.domain.model.contract.wage;

import com.example.isolatingdomainsample.domain.model.legislation.ExtraPayRate;

/**
 * 法定時間外労働 月60時間以内の時間外割増率
 */
public class OverLegalWithin60HoursExtraRate {
  ExtraPayRate value;

  @Deprecated
  public OverLegalWithin60HoursExtraRate() {
  }

  public OverLegalWithin60HoursExtraRate(Integer value) {
    this.value = new ExtraPayRate(value);
  }

  public static OverLegalWithin60HoursExtraRate regulation() {
    return new OverLegalWithin60HoursExtraRate(25);
  }

  public ExtraPayRate value() {
    return value;
  }
}
