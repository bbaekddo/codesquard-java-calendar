package Honux.Calendar;

import java.util.Scanner;

public class showMonth extends Calendar {                  // Calendar 클래스 상속받음
	
	public static showMonth cal2 = new showMonth();
	public boolean leapYear(int year) {

		boolean leap = false;
		if (year % 4 == 0) {
			leap = true;

			if (year % 100 == 0) {
				leap = false;

				if (year % 400 == 0) {
					leap = true;
				}
			}
		}
		return leap;
	}                                                      // 윤년 판단

	public void showLeap(int year, int month, int alldays) {

		int standard = alldays % 7;                        // 총 일자를 7로 나눈 나머지, 기준 수치
		int newStandard = (alldays + 1) % 7;               // 윤년의 2월 후 총 일자	
		
		System.out.printf("        <<%4d년%3d월>>\n", year, month);
		System.out.println("      일     월      화      수      목      금     토 ");
		System.out.println(" --------------------------");
		
		if (month == 1){
				
			for (int j=0; j<standard * 4; j++){
		    System.out.print(" ");
			}                                              // 시작하는 요일 앞 공백
		    	
		    for (int k=0; k<cal.getDaysOfMonth(month); k++){	
		        	
			System.out.printf("%4d", k+1);
			    	
			    if ((k+1+standard) % 7 == 0){
			    	System.out.println();
			    }
			}                                              // 윤년의 1월 출력
				
		} else if (month == 2){
				
			for (int j=0; j<standard * 4; j++){
		    	System.out.print(" ");
		    }                                              // 시작하는 요일 앞 공백
				
			for (int k=0; k<29; k++){	
		        	
			    System.out.printf("%4d", k+1);
			    	
			    if ((k+1+standard) % 7 == 0){
			    	System.out.println();
			    }
			}                                              // 윤년의 2월 출력
				
		} else {
			
			for (int j=0; j<newStandard * 4; j++){
		    	System.out.print(" ");
		    }                                              // 시작하는 요일 앞 공백
				
            for (int k=0; k<cal.getDaysOfMonth(month); k++){	
		        	
		    	System.out.printf("%4d", k+1);
			    	
		    	if ((k+1+newStandard) % 7 == 0){
		    		System.out.println();
		    	}
		    }
		}                                                  // 윤년의 3~12월 출력
			System.out.println();
	}   
		
	public static void main(String[] args) {

		String y = "Year => ";
		String m = "Month => ";
        
		int a, b = 0;
		int c;
		
		while (true) {

			System.out.println("출력할 해와 달을 입력하시오.");
			System.out.print(y);
			Scanner year = new Scanner(System.in);
			a = year.nextInt();
			System.out.print(m);
			Scanner month = new Scanner(System.in);
			b = month.nextInt();

			cal2.leapYear(a);                              // 윤년인지 확인
            
            
			if (a < 1){
				
				System.out.println("연도가 잘못되었습니다. 다시 입력하세요.\n");
				continue;
				                                           // 1년 미만일 경우 재입력
			} else {
				
				if (b == -1) {
					
					System.out.println("Have a nice day!");
					break;
					
				} else if (b <= 0 | b > 12) {
					
					System.out.println("월이 잘못되었습니다. 다시 입력하세요.\n");
					continue;
					
				} else {
					
					c = cal.allDays(a, b);                 // 전년 총 일자 계산 (서기 1년은 전월만 계산)
					
					if(cal2.leapYear(a) == true) {
						cal2.showLeap(a, b, c);
					}                                          
					else {
						cal.showMonth(a, b, c);
				    }                                      // 당해가 윤년인지 아닌지 판단해서 출력
			    }
			System.out.println();
	        }
        }
    }                                                      // main class 종료
}