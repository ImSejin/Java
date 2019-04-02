package practice;

import java.util.Scanner;

public class CalculatorClass {

	// �� �Ű������� ���Ѵ�
	private int plus(int x, int y) {
		return x + y;
	}

	// �� �Ű������� ����
	private int minus(int x, int y) {
		return x - y;
	}

	// �� �Ű������� ���Ѵ�
	private int multiply(int x, int y) {
		return x * y;
	}

	// �� �Ű������� ������
	private int divide(int x, int y) {
		return x / y;
	}

	// ���� 3�ڸ����� ,(comma)�� �����Ѵ�
	public String printComma(long value) {

		String result = "";
		String temp = String.valueOf(value);
		int len = temp.length();
		int header = len % 3;	// ù��° �޸� ��ġ
		char comma = ',';
		
		// comma�� ������ �ʿ䰡 ���� ��
		if (len < 4) {
			return temp;
		}
		
		// len�� 3�� ������ ó���� comma�� ���� �ʴ´�
		if (header != 0) {
			result += temp.substring(0, header);
			result += comma;
		}
		
		// 3�ڸ����� �����Ѵ�
		result += temp.substring(header, header + 3);
		for (int i=3; header+i+3<=len; i=i+3) {
			result += comma;
			result += temp.substring(header + i, header + i + 3);
		}
		
		return result;
	}

	// ����� �����Ѵ�
	public void calculate() {

		Scanner scanner = new Scanner(System.in);
		CalculatorClass cal = new CalculatorClass();

		String func = "";
		int x;
		int y;
		int result = 0;
		boolean isOperator = false;

		// ��Ģ�����ȣ�� �ùٸ��� �˻��Ѵ�
		while ( !isOperator ){
			System.out.print("��Ģ������ �����ϼ���.\n> ");
			func = scanner.nextLine();

			isOperator = func.equals("+") || func.equals("-") || func.equals("*") || func.equals("/");
		}

		// ����� �Ű������� �Է� �޴´�
		System.out.print("x���� �Է��ϼ���.\n> ");
		x = scanner.nextInt();
		System.out.print("y���� �Է��ϼ���.\n> ");
		y = scanner.nextInt();

		// �Է¹��� ����� �����Ѵ�
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