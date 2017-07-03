package Honux.Calendar;

import java.util.Scanner;

public class showMonth {

	public static void main(String[] args) {

		Calendar cal = new Calendar();
		String prompt = "cal => ";

		int a = 0;
		while (true) {

			System.out.println("달을 입력하시오.");
			System.out.print(prompt);
			Scanner month = new Scanner(System.in);
			a = month.nextInt();

			if (a == -1) {
				System.out.println("Have a nice day!");
				break;
			} else if (a <= 0 | a > 12) {
				System.out.println("입력값이 잘못되었습니다. 다시하세요.\n");
				continue;
			}

			cal.showMonth(a);
		}
	}

}
