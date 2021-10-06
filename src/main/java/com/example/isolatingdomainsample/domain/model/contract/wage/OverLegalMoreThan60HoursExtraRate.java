package com.example.isolatingdomainsample.domain.model.contract.wage;

import com.example.isolatingdomainsample.domain.model.legislation.ExtraPayRate;

/**
 * 法定時間外労働 月60時間超の時間外割増率
 */
public class OverLegalMoreThan60HoursExtraRate {
  ExtraPayRate value;

  @Deprecated
  public OverLegalMoreThan60HoursExtraRate() {
  }

  public OverLegalMoreThan60HoursExtraRate(Integer value) {
    this.value = new ExtraPayRate(value);
  }

  public static OverLegalMoreThan60HoursExtraRate regulation() {
    return new OverLegalMoreThan60HoursExtraRate(50);
  }

  public ExtraPayRate value() {
    return value;
  }
}
