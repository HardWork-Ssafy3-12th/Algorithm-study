package ����;

import java.util.Scanner;

public class ����Main_8958_������_OX���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int TC = 0; TC < T; TC++) {
			String input = sc.next();
			char[] c = new char[input.length()];
			for (int i = 0; i < c.length; i++) // �ѱ��ھ� �ڸ� 
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
