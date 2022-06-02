package test_01;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정숫값:");
		int a = stdIn.nextInt();	
		
		if(a>0)
			System.out.println("값이 양수입니다.");
		else if (a<0) 
			System.out.println("값이 음수입니다.");
		else
			System.out.println("값이 0입니다.");
	}
}
