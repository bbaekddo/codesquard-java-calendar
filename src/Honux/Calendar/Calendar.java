package Honux.Calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] maxOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void showMonth(int month) {

	    if( month == 2){
	    	
	    	System.out.println("  일     월      화      수      목      금     토 ");
		    System.out.println(" --------------------------");
		    System.out.println("  1   2   3   4   5   6   7");
		    System.out.println("  8   9  10  11  12  13  14");
		    System.out.println(" 15  16  17  18  19  20  21");
		    System.out.println(" 22  23  24  25  26  27  28");
	    }
	    else if( month == 4 | month == 6 | month == 9 | month == 11){
	    	
	    	System.out.println("  일     월      화      수      목      금     토 ");
		    System.out.println(" --------------------------");
		    System.out.println("  1   2   3   4   5   6   7");
		    System.out.println("  8   9  10  11  12  13  14");
		    System.out.println(" 15  16  17  18  19  20  21");
		    System.out.println(" 22  23  24  25  26  27  28");
		    System.out.println(" 29  30");
	    }
	    
	    else{
	    	
	    	System.out.println("  일     월      화      수      목      금     토 ");
		    System.out.println(" --------------------------");
		    System.out.println("  1   2   3   4   5   6   7");
		    System.out.println("  8   9  10  11  12  13  14");
		    System.out.println(" 15  16  17  18  19  20  21");
		    System.out.println(" 22  23  24  25  26  27  28");
		    System.out.println(" 29  30  31");
	    }
	}

	public int getDaysOfMonth(int month) {

		return maxOfDays[month - 1];
	}

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
