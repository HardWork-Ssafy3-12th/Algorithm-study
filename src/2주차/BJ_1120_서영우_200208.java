package 백준;

import java.util.Scanner;

//백준 1120 문자열 
//A 보다 B가 더 김, A앞뒤에 글자 추가해서 i를 제일 줄일것 
//현재 i와 한칸 뒤로 옮겼을때 i 비교 해서 작은경우에  B와 같은 문자 삽입  -> 길이가 같아질때까지 반복 
public class 백준Main_1120_서영우_문자열 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strX = sc.next();
		String strY = sc.next();
		char[] X = new char[strX.length()];
		char[] Y = new char[strY.length()];
		int n = strY.length()-strX.length();
		int ans=Integer.MAX_VALUE;
		
		//한글자씩 잘라서  저장
		for (int i = 0; i < strY.length(); i++) {
			if(i<X.length)
				X[i] = strX.charAt(i);
			Y[i] = strY.charAt(i);
		}
		

		//한칸씩 움직이면서 비교해서 최소값 찾기
		for (int i = 0; i <= n; i++) {
			int cnt =0;
			for (int j = 0; j < X.length; j++) {
				if(X[j] != Y[j+i])
					cnt++;
			}
			if(cnt < ans)
				ans = cnt;
		}
		
		System.out.println(ans);
		
	}//end of main
	/*
	 * A= 5  b=8 일때   앞은 0~4비교      뒤는 0~4와  B의 1~5만큼 비교
	 */
	

	
	
}//end of main
