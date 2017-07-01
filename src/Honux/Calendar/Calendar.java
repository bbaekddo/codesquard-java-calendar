package Honux.Calendar;

import java.util.Scanner;
public class Calendar {

	private static final int[] maxOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void SampleMonth(){
	
		System.out.println("  일     월      화      수      목      금     토 ");
		System.out.println(" --------------------------");
		System.out.println("  1   2   3   4   5   6   7");
		System.out.println("  8   9  10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");
		System.out.println(" 29  30  31");
	}
	
	public int getDaysOfMonth(int month){
		
		return maxOfDays[month - 1];
	}
	
	public static void main(String[] args) {

		System.out.println("달을 입력하시오.");
		Scanner whatMonth = new Scanner(System.in);
		Calendar cal = new Calendar();
	
		int a = whatMonth.nextInt();
		
		System.out.printf("%d월은 %d월까지 있습니다.", a, cal.getDaysOfMonth(a));

	}

};;
