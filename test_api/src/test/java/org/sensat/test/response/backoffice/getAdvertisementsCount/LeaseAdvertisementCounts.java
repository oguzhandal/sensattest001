package org.sensat.test.response.backoffice.getAdvertisementsCount;

import java.util.List;
import lombok.Data;

@Data
public class LeaseAdvertisementCounts{
	private int total;
	private List<MonthlyCountsItem> monthlyCounts;
	private int currentMonthCount;
	private int currentWeekCount;
	private int currentDayCount;
	private List<DailyCountsItem> dailyCounts;
}
