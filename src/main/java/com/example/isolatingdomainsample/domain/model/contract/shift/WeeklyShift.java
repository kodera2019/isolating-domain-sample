package com.example.isolatingdomainsample.domain.model.contract.shift;

import com.example.isolatingdomainsample.domain.type.date.Week;

import java.time.LocalDate;
import java.util.List;

/**
 * 週間シフト
 */
public class WeeklyShift {
  Week week;
  List<WorkingDay> workingDays;

  public DayStatus dayStatus(LocalDate date) {
    // TODO: 指定の日の種別(労働日・休日)を判定して返却
    return DayStatus.労働日;
  }
}
