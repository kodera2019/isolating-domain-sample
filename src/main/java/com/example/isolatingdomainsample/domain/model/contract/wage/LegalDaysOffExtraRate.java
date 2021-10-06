package com.example.isolatingdomainsample.domain.model.contract.wage;

import com.example.isolatingdomainsample.domain.model.legislation.ExtraPayRate;

/**
 * 法定休日労働 時間外割増率
 */
public class LegalDaysOffExtraRate {
  ExtraPayRate value;

  @Deprecated
  public LegalDaysOffExtraRate() {
  }

  public LegalDaysOffExtraRate(Integer value) {
    this.value = new ExtraPayRate(value);
  }

  public static LegalDaysOffExtraRate regulation() {
    return new LegalDaysOffExtraRate(35);
  }

  public ExtraPayRate value() {
    return value;
  }
}
