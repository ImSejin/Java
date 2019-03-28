package practice.date;

import java.time.*;

public class CalendarNewClass {
	
	private LocalDate inputDate = null;
	private String[] header = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };	// ���� ǥ��
	
	private int startDayOfWeek;				// �ش� ���� ���� ���� (MON: 1, ... , SUN: 7)
	private int endDate;					// �ش� ���� ������ ��¥
	private int tableCols = header.length;
	private int year;
	private int month;
	
	public CalendarNewClass(int year, int month) throws DateTimeException {
		
		// AD 1����� �����Ѵ�
		if(year < 1) {
			this.year = 1;
		} else {
			this.year = year;
		}
		
		// 1�� ~ 12���� �ƴϸ� ���ܸ� �߻��Ѵ�
		if(month < 1 || month > 12) {
			throw new DateTimeException("month���� 1 ~ 12�� ���� �� �� �ֽ��ϴ�.");
		} else {
			// parameter�� ���� year, month�� date�� �����Ѵ�
			this.month = month;
			inputDate = LocalDate.of(this.year, this.month, 1);
			
			int temp = inputDate.getDayOfWeek().getValue();
			startDayOfWeek = (temp == 7) ? 0 : temp;	// Sunday�� 0���� �����Ѵ�
			endDate = inputDate.lengthOfMonth();
		}
	}
	
public void printCalendar() {
		
		// year, month�� ����Ѵ�
		System.out.printf("%10d�� %5d��\r\n", year, month);

		// day of week�� ����Ѵ�
		for(int i=0; i<header.length; i++) {
			System.out.printf("%s ",header[i]);
		}
		System.out.println();
		
		// date�� ����Ѵ�
		int date = 1;
		outer_loop:
		while (true) {
			for(int j=0; j<tableCols; j++) {
				
				if( date == 1 && j < startDayOfWeek ) {
					// ���� ���� �������� ������ ����Ѵ�
					System.out.printf("%3s ", "");
				} else {
					System.out.printf("%3s ", date + "");
					
					if(date == endDate) {
						// �ش� ���� ������ ��¥�� �ٴٸ��� �Է��� �����Ѵ�
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
