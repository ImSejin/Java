package practice;

import java.util.Scanner;

public class CalculatorClass {

	// 두 매개변수를 더한다
	private int plus(int x, int y) {
		return x + y;
	}

	// 두 매개변수를 뺀다
	private int minus(int x, int y) {
		return x - y;
	}

	// 두 매개변수를 곱한다
	private int multiply(int x, int y) {
		return x * y;
	}

	// 두 매개변수를 나눈다
	private int divide(int x, int y) {
		return x / y;
	}

	// 숫자 3자리마다 ,(comma)로 구분한다
	public String printComma(long value) {

		String result = "";
		String temp = String.valueOf(value);
		int len = temp.length();
		int header = len % 3;	// 첫번째 콤마 위치
		char comma = ',';
		
		// comma로 구분할 필요가 없을 때
		if (len < 4) {
			return temp;
		}
		
		// len이 3의 배수라면 처음의 comma를 찍지 않는다
		if (header != 0) {
			result += temp.substring(0, header);
			result += comma;
		}
		
		// 3자리마다 구분한다
		result += temp.substring(header, header + 3);
		for (int i=3; header+i+3<=len; i=i+3) {
			result += comma;
			result += temp.substring(header + i, header + i + 3);
		}
		
		return result;
	}

	// 계산을 수행한다
	public void calculate() {

		Scanner scanner = new Scanner(System.in);
		CalculatorClass cal = new CalculatorClass();

		String func = "";
		int x;
		int y;
		int result = 0;
		boolean isOperator = false;

		// 사칙연산기호가 올바른지 검사한다
		while ( !isOperator ){
			System.out.print("사칙연산을 선택하세요.\n> ");
			func = scanner.nextLine();

			isOperator = func.equals("+") || func.equals("-") || func.equals("*") || func.equals("/");
		}

		// 계산할 매개변수를 입력 받는다
		System.out.print("x값을 입력하세요.\n> ");
		x = scanner.nextInt();
		System.out.print("y값을 입력하세요.\n> ");
		y = scanner.nextInt();

		// 입력받은 계산을 수행한다
		switch (func) {
			case "+" : result = cal.plus(x, y); 	break;
			case "-" : result = cal.minus(x, y); 	break;
			case "*" : result = cal.multiply(x, y); break;
			case "/" : result = cal.divide(x, y); 	break;
		}

		System.out.println("result: " + result);
		scanner.close();
	}
	
}