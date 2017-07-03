package Honux.Calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] maxOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public static Calendar cal = new Calendar();
    
	public static void showMonth(int month) {

		System.out.println("      일     월      화      수      목      금     토 ");
	    System.out.println(" --------------------------");
	    
	    for( int i=0; i<cal.getDaysOfMonth(month); i++){
	    		System.out.printf("%4d", i+1);
	    		
	    		if( (i+1) % 7 == 0){
	    			System.out.println();
	    		}
	    }
	    System.out.println();
	}

	public int getDaysOfMonth(int month) {

		return maxOfDays[month - 1];
	}

	public static void main(String[] args) {

		showMonth show = new showMonth();
		show.main(null);
	}
}
