package practice;

import static java.lang.System.out;

//import java.math.BigInteger;
//import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainClass {

	public static void main(String[] args) {
//		BigInteger num = new BigInteger("123456789012345678901234567890");
//		BigDecimal number = new BigDecimal(num);
		CalculatorClass cal = new CalculatorClass();
		long l = (long)Math.pow(2, 62.999999999999997);
		String result = cal.printComma(l);
		
		out.println(result);
		
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		out.println(formatter.format(l));
		
		out.printf("%,d", l);
		out.println();
		out.println(String.format("%,d", l));
	}

}
