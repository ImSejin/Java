package practice.date;

import java.util.Calendar;

public class CalendarClass {

	private Calendar cal = null;
	private String[] header = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };	// ���� ǥ��
	
	private int startDayOfWeek;				// �ش� ���� ���� ���� (SUN: 1, ... , SAT: 7)
	private int endDate;					// �ش� ���� ������ ��¥
	private int tableRows;					// �ش� ���� �� ����
	private int tableCols = header.length;
	private int year;
	private int month;
	
	public CalendarClass(int year, int month) throws Exception {
		
		// AD 1����� �����Ѵ�
		if(year < 1) {
			this.year = 1;
		} else {
			this.year = year;
		}
		
		// 1�� ~ 12���� �ƴϸ� ���ܸ� �߻��Ѵ�
		if(month < 1 || month > 12) {
			throw new Exception("month���� 1 ~ 12�� ���� �� �� �ֽ��ϴ�.");
		} else {
			// parameter�� ���� year, month�� date�� �����Ѵ�
			this.month = month;
			cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, this.year);
			cal.set(Calendar.MONTH, this.month - 1);
			cal.set(Calendar.DATE, 1);
			
			tableRows = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
			startDayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
			endDate = cal.getActualMaximum(Calendar.DATE);		// DATE�� DAY_OF_MONTH�� ����.
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
		for(int i=0; i<tableRows; i++) {
			for(int j=0; j<tableCols; j++) {
				
				if( i == 0 && j < (startDayOfWeek - 1) ) {
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

	public static void main(String[] args) throws Exception {
		
		CalendarClass cal = new CalendarClass(2020, 2);
		cal.printCalendar();
	}
}
