package 백준;

import java.util.Scanner;

//백준 2991 사나운개
/*
 * 개 1 : A분 공격적, B분 휴식
 * 개 2 : C분 공격, D분 휴식
 * 도착시간 : 우체부(P), 신문(N), 우유(M)
 * 아침 시작(0), 시작후 지난시간 : 도착시간 
 * 도착 3 이면 3분이 진행되는 중에 도착
 * 우체부, 우유, 신문 순으로 몇마리의 개에게 공격받는지 출력
 */
public class 백준Main_2991_서영우_사나운개 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int[] arrive = new int[3];
		for (int i = 0; i < 3; i++) 
			arrive[i] = sc.nextInt();
				
		//  i(공격+휴식) <= i*도착시간 <= 공격시간 + i(공격+휴식시간) -> 공격적인 시간
		// 개 2 4 =>  ~2 6~8 12~14 18~20 24 ...   30~32 36       
		//도착 35 
		for (int i = 0; i < 3; i++) {
			int dog = 0;
			int D1 = arrive[i] % (A+B);
			int D2 = arrive[i] % (C+D);
			
			// 0이 아니고 공격시간보다 작으면 dog++;
			if(D1 != 0 && D1 <= A) // 개1한테 공격받았을때
				dog++;
			if(D2 != 0 && D2 <= C) // 개2한테 공격받았을때
				dog++;
			
//			int D1 = arrive[i]/(A+B); // 개1 
//			int D2 = arrive[i]/(C+D); // 개2 
//			//
//			if(D1*(A+B) < arrive[i] && arrive[i] <=D2*(A+B)+A)
//				dog++;
//			if(D2*(C+D) < arrive[i] && arrive[i] <=D2*(C+D)+C)
//				dog++;
			
			System.out.println(dog);
		}
		
		
	}// end of main
}// end of class
