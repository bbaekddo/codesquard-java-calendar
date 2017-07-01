package Honux.Calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		int a, b;
		String s1, s2;
		
		System.out.println("두 개의 숫자를 입력하세요.");
		Scanner first = new Scanner(System.in);
        s1 = first.next();
        s2 = first.next();
        
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        
        System.out.println("두 숫자의 합은 : " +( a + b));
        
	}

}
