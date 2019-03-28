package practice.date;

import java.time.Instant;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateClass {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		Instant ins = date.toInstant();
		System.out.println(ins);
		Date.from(ins);
		
		// compareTo(): before() + equals() + after()
		Date earlier = new Date(0);	// January 1, 1970, 00:00:00 GMT: the standard base time
		Date now = new Date();
		Date later = new Date(now.getTime() + 1000);
		System.out.println(now.compareTo(earlier));
		System.out.println(now.compareTo(later));
		
		// new Date().getTime() == System.currentTimeMillis()
		System.out.println(now.getTime());	// the standard base time으로부터 현재까지 몇 밀리초
		System.out.println(System.currentTimeMillis());	// the standard base time으로부터 현재까지 몇 밀리초
		
		// SimpleDateFormat.format()을 이용해 원하는 방식으로 Date를 출력할 수 있다
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy/hh:mm:ss a zzz");
		System.out.println(formatter.format(now));
	}
}
