package 백준;

import java.util.Scanner;

public class 백준Main_8958_서영우_OX퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int TC = 0; TC < T; TC++) {
			String input = sc.next();
			char[] c = new char[input.length()];
			for (int i = 0; i < c.length; i++) // 한글자씩 자름 
				c[i] = input.charAt(i);
			int sum =0;
			int point = 1;
			for (int i = 0; i < c.length; i++) {
				if(c[i] == 'O') {
					sum += point;
					point++;
				}
				else
					point=1;
			}
			System.out.println(sum);
		}//test case
		
	}//end of main
}//end of class
