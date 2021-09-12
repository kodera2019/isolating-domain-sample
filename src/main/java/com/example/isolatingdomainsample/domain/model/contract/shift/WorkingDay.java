package com.example.isolatingdomainsample.domain.model.contract.shift;

import java.time.LocalDate;

/**
 * 勤務日
 */
public class WorkingDay {
  LocalDate date;
  StartingTime startingTime;
  EndingTime endingTime;
  BreakTime breakTime;
}
