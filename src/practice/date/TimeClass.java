package practice.date;

import java.time.*;

public class TimeClass {

	public static void main(String[] args) throws DateTimeException {
		
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println("rightNow: " + rightNow);
		System.out.println();

		// LocalDate.getMonthValue() == Month.getValue()
		LocalDate enlistment = LocalDate.of(2016, Month.NOVEMBER, 14);
		Month month = enlistment.getMonth();
		System.out.println(month.getValue());
		System.out.println(enlistment.getMonthValue());
		System.out.println();
		
		// convert LocalDate to LocalDateTime
		LocalDateTime earlier = enlistment.atStartOfDay();
		earlier = enlistment.atTime(0, 0, 0);
//		earlier = LocalDateTime.from(enlistment);	// DateTimeException ¹ß»ý
		int result = enlistment.compareTo(LocalDate.of(2016, 11, 13));		// -1, 0, 1
		System.out.println("result: " + result);
		System.out.println("LocalDateTime: " + earlier);
		System.out.println();
		
		// convert LocalDateTime to LocalDate
		LocalDate ld = earlier.toLocalDate();
		ld = LocalDate.from(earlier);
		System.out.println("LocalDate: " + ld);
		int result2 = rightNow.compareTo(earlier);		// -3, 0, 3
		System.out.println("result2: " + result2);
		System.out.println();
		
		// convert LocalTime to LocalDateTime
		LocalTime noon = LocalTime.of(12, 0, 0);
		System.out.println("noon: " + noon);
		LocalDateTime noonOfToday = noon.atDate(enlistment);
		System.out.println("LocalTimeDate: " + noonOfToday);
		LocalTime midnight = LocalTime.of(0, 0, 0);
		int result3 = noon.compareTo(midnight);		// -1, 0, 1
		System.out.println("result3: " + result3);
		System.out.println();
		
		// convert LocalDateTime to LocalTime
		LocalTime noon2 = noonOfToday.toLocalTime();
		noon2 = LocalTime.from(noonOfToday);
		System.out.println("LocalTime: " + noon2);
		System.out.println();
		
		rightNow = LocalDateTime.of(2018, 11, 9, 12, 1, 32);
		System.out.println("rightNow: " + rightNow);
		System.out.println();
		
		LocalTime timePoint = LocalTime.parse("00:00:01");
		System.out.println("timePoint: " + timePoint);
	}
}
