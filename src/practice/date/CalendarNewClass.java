package practice.date;

import java.time.*;

public class CalendarNewClass {
	
	private LocalDate inputDate = null;
	private String[] header = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };	// 요일 표시
	
	private int startDayOfWeek;				// 해당 월의 시작 요일 (MON: 1, ... , SUN: 7)
	private int endDate;					// 해당 월의 마지막 날짜
	private int tableCols = header.length;
	private int year;
	private int month;
	
	public CalendarNewClass(int year, int month) throws DateTimeException {
		
		// AD 1년부터 시작한다
		if(year < 1) {
			this.year = 1;
		} else {
			this.year = year;
		}
		
		// 1월 ~ 12월이 아니면 예외를 발생한다
		if(month < 1 || month > 12) {
			throw new DateTimeException("month에는 1 ~ 12의 값만 들어갈 수 있습니다.");
		} else {
			// parameter로 받은 year, month와 date를 세팅한다
			this.month = month;
			inputDate = LocalDate.of(this.year, this.month, 1);
			
			int temp = inputDate.getDayOfWeek().getValue();
			startDayOfWeek = (temp == 7) ? 0 : temp;	// Sunday를 0으로 변경한다
			endDate = inputDate.lengthOfMonth();
		}
	}
	
public void printCalendar() {
		
		// year, month를 출력한다
		System.out.printf("%10d년 %5d월\r\n", year, month);

		// day of week를 출력한다
		for(int i=0; i<header.length; i++) {
			System.out.printf("%s ",header[i]);
		}
		System.out.println();
		
		// date를 출력한다
		int date = 1;
		outer_loop:
		while (true) {
			for(int j=0; j<tableCols; j++) {
				
				if( date == 1 && j < startDayOfWeek ) {
					// 시작 요일 전까지는 공백을 출력한다
					System.out.printf("%3s ", "");
				} else {
					System.out.printf("%3s ", date + "");
					
					if(date == endDate) {
						// 해당 월의 마지막 날짜에 다다르면 입력을 종료한다
						break outer_loop;
					}
					date++;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		CalendarNewClass cnc = new CalendarNewClass(2020, 2);
		cnc.printCalendar();
	}
}
