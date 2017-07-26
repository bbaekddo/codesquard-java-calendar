package Honux.Calendar;

import java.util.Scanner;

public class Calendar {

    public int[] maxOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public static Calendar cal = new Calendar();
    public String[] whatDays = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };
    
	public void showMonth(int year, int month, String day) {
		
		System.out.printf("        <<%4d년%3d월>>\n", year, month);
		System.out.println("      일     월      화      수      목      금     토 ");
	    System.out.println(" ---------------------------");
	    
	    int dayNum = 0;
	    
	    for (int i=0; i<whatDays.length; i++){
	    	
	    	if (day.equals(whatDays[i])){
	    		dayNum = i;
	    	}
	    }                                                  // 입력받을 요일을 차례대로 0~6으로 변환
	    
	    for (int k=0; k<(dayNum * 4); k++){
        	System.out.print(" ");
        }                                                  // 입력받은 요일의 시작점을 공백으로 메움
	    
	    for (int j=0; j<cal.getDaysOfMonth(month); j++){	
	        	
	    	System.out.printf("%4d", j+1);
	    	
	    	if ((j+1+dayNum) % 7 == 0){
	    		System.out.println();
	    	}
	    }                                                  // 요일의 시작에 따라 달력 출력
	    System.out.println();
	}                                                      // 달력 출력

	public int getDaysOfMonth(int month) {

		return maxOfDays[month - 1];
	}                                                      // 월별 최대 일수 

	public static void main(String[] args) {

		showMonth show = new showMonth();
		show.main(null);
	}                                                      // showMonth 클래스에서 불러오기
}
