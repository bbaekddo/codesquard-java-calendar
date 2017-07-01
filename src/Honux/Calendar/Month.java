package Honux.Calendar;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {

		System.out.println("달을 입력하시오.");
		Scanner month = new Scanner(System.in);
		
		int a = month.nextInt();
		
		if( a % 2 == 0 ){
		    
			if( a == 2 ){
		    	System.out.println(a + "월은 28일까지 있습니다.");
		    }
			else if( a >= 8 & a < 13 ){
				System.out.println(a + "월은 31일까지 있습니다.");
			}
			else if( a == 0 | a > 12){
				System.out.println("월을 잘못 입력하셨습니다.");
			}
			else
				System.out.println(a + "월은 30일 까지 있습니다.");
			
		}
		else if( a % 2 == 1 ){
			
			if( a > 8 & a < 13){
				System.out.println(a + "월은 30일까지 있습니다.");
			}
			else if( a > 12 ){
				System.out.println("월을 잘못 입력하셨습니다.");
			}
			else
				System.out.println(a + "월은 31일까지 있습니다.");
		}
		else
			System.out.println("월을 잘못 입력하셨습니다.");
	}

}
