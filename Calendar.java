package Honux.Calendar;

import java.util.Scanner;

public class Calendar {

    public int[] maxOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public static Calendar cal = new Calendar();
    
	public void showMonth(int year, int month, int alldays) {
		
		System.out.printf("        <<%d년 %d월>>\n", year, month);
		System.out.println("      일     월      화      수      목      금     토 ");
	    System.out.println(" ---------------------------");
	    
	    int standard = alldays % 7;                        // 총 일자를 7로 나눈 나머지, 기준 수치
	    
	    if (alldays == 0){
	    	
	    	for (int i=0; i<cal.getDaysOfMonth(month); i++){	
	        	
		    	System.out.printf("%4d", i+1);		    	
		    	if ((i+1) % 7 == 0){
		    		System.out.println();
		    	}
		    }                                              // 1년 1월의 경우 따로 출력
	    } else {                                           
	    	
	    	for (int j=0; j<standard * 4; j++){
	    		System.out.print(" ");
	    	}                                              // 시작하는 요일 앞 공백
	    	
	    	for (int k=0; k<cal.getDaysOfMonth(month); k++){	
	        	
		    	System.out.printf("%4d", k+1);
		    	
		    	if ((k+1+standard) % 7 == 0){
		    		System.out.println();
		    	}
		    }                                              // 평년의 월별 달력 출력
	    }
	    
	    System.out.println();
	}                                                      

	public int allDays(int year, int month){
		
        int countdays = 0;
        int pastdays, monthdays = 0;
	    
        if (year > 1){
	        
        	pastdays = (year - 1)*365 + (year - 1)/4 -(year - 1)/100 +(year - 1)/400;
        	
        	for (int j=0; j<(month - 1); j++){
        		monthdays += maxOfDays[j];
        	}
        	
        	countdays = pastdays + monthdays;              // 구하고자 하는 달 전의 총 일자
        	
        } else if (year == 1){
        	
        	if (month > 1){
        		for (int i=0; i<(month - 1); i++){
            		countdays += maxOfDays[i];
            	}
        	} else {
        		countdays = 0;
        	}
        }    	                                           // 서기 1년 1월 이상인 경우 합계 계산, 1월인 경우 0으로 처리
        return countdays;
	}                                                      // 전년도 총 일자 계산
	
	
	public int getDaysOfMonth(int month) {

		return maxOfDays[month - 1];
	}                                                      // 월별 최대 일수 

	public static void main(String[] args) {

		showMonth show = new showMonth();
		show.main(null);
	}                                                      // showMonth 클래스에서 불러오기
}
