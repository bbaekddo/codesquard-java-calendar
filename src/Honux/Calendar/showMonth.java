package Honux.Calendar;

import java.util.Scanner;

public class showMonth extends Calendar {                  // Calendar 클래스 상속받음

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

	public void showLeap(boolean leapYear, int year, int month, String day) {

		if (leapYear = true) {

			System.out.printf("        <<%4d년%3d월>>\n", year, month);
			System.out.println("      일     월      화      수      목      금     토 ");
			System.out.println(" --------------------------");

			int dayNum = 0;
		    
		    for (int i=0; i<whatDays.length; i++){
		    	
		    	if (day.equals(whatDays[i])){
		    		dayNum = i;
		    	}
		    }                                                  // 입력받을 요일을 차례대로 0~6으로 변환
		    
		    for (int k=0; k<(dayNum * 4); k++){
	        	System.out.print(" ");
	        }                                                  // 입력받은 요일의 시작점을 공백으로 메움
		    
		    for (int j=0; j<29; j++){	
		        	
		    	System.out.printf("%4d", j+1);
		    	
		    	if ((j+1+dayNum) % 7 == 0){
		    		System.out.println();
		    	}
		    }                                                  // 요일의 시작에 따라 달력 출력
		}   
		System.out.println();
	}

	public static void main(String[] args) {

		Calendar cal = new Calendar();
		showMonth cal2 = new showMonth();
		String y = "Year => ";
		String m = "Month => ";
        
		int a, b = 0;
		String c = null;
		
		while (true) {

			System.out.println("출력할 해와 달을 입력하시오.");
			System.out.print(y);
			Scanner month = new Scanner(System.in);
			a = month.nextInt();
			System.out.print(m);
			Scanner month2 = new Scanner(System.in);
			b = month2.nextInt();
			
			System.out.println("첫번째 요일을 입력하시오. {SU, MO,,, SA} ");
			Scanner month3 = new Scanner(System.in);
			c = month3.nextLine();                         // 1일을 어디로 시작할 지 입력

			cal2.leapYear(a);                              // 윤년인지 확인

			if (b == -1) {
				System.out.println("Have a nice day!");
				break;
			} else if (b <= 0 | b > 12) {
				System.out.println("입력값이 잘못되었습니다. 다시하세요.\n");
				continue;
			} else if (b == 2) {
                  
				if(cal2.leapYear(a) == true) {
					cal2.showLeap(true, a, b, c);
				}                                          // 윤년 날짜를 어떻게 시작할건지 적어야함
				else {
					cal.showMonth(a, b, c);                // 2월이지만 평년인 연도 출력
				}
			} else
				cal.showMonth(a, b, c);                    // 2월이 아닌 일반 연도 출력
			
			System.out.println();
		}
	}

}
