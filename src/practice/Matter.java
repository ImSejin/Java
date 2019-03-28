package practice;

import java.util.Scanner;

public class Matter {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("변수값 입력:");
			int n = scan.nextInt(); //
			int cen = (2 * n - 1) / 2; // 가운데 행 위치지정
			int n1 = 2 * n - 1; // 마름모가 그려질 가로, 세로 길이
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < cen - i + n - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 0; i < n1 / 2; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (2 * n1 - 1) - 2 * i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			int n2 = n - 1;
			for (int i = 0; i < n2; i++) {
				System.out.print(" ");
				for (int j = 0; j < n2 - 1 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < n2 - i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < 1 + 4 * i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < n2 - i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < n2 - 1 - i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
//		scan.close();
	}
}