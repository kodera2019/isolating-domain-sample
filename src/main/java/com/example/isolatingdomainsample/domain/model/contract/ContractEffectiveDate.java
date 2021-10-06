package com.example.isolatingdomainsample.domain.model.contract;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 契約開始日
 */
public class ContractEffectiveDate {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  LocalDate value;

  @Deprecated
  public ContractEffectiveDate() {
  }

  public ContractEffectiveDate(String value) {
    this.value = LocalDate.parse(value, DateTimeFormatter.ISO_DATE);
  }

  public ContractEffectiveDate(LocalDate value) {
    this.value = value;
  }

  public static ContractEffectiveDate none() {
    return new ContractEffectiveDate(distanceFuture());
  }

  public static LocalDate distanceFuture() {
    return LocalDate.of(9999, 12, 31);
  }

  @Override
  public String toString() {
    if (notAvailable()) {
      return "未確定";
    }
    return value.format(DateTimeFormatter.ofPattern("uuuu年M月d日"));
  }

  private boolean notAvailable() {
    return value.equals(distanceFuture());
  }

  public boolean isAfter(LocalDate date) {
    return value.isAfter(date);
  }

  public LocalDate value() {
    return value;
  }
}
