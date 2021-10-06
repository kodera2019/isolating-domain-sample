package com.example.isolatingdomainsample.domain.model.contract.shift;

import com.example.isolatingdomainsample.domain.type.date.Month;

import java.util.List;

/**
 * 月間シフト
 */
public class MonthlyShift {
  Month month;
  List<WeeklyShift> weeklyShifts;
}
