package ����;

import java.util.Scanner;

//���� 1120 ���ڿ� 
//A ���� B�� �� ��, A�յڿ� ���� �߰��ؼ� i�� ���� ���ϰ� 
//���� i�� ��ĭ �ڷ� �Ű����� i �� �ؼ� ������쿡  B�� ���� ���� ����  -> ���̰� ������������ �ݺ� 
public class ����Main_1120_������_���ڿ� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strX = sc.next();
		String strY = sc.next();
		char[] X = new char[strX.length()];
		char[] Y = new char[strY.length()];
		int n = strY.length()-strX.length();
		int ans=Integer.MAX_VALUE;
		
		//�ѱ��ھ� �߶�  ����
		for (int i = 0; i < strY.length(); i++) {
			if(i<X.length)
				X[i] = strX.charAt(i);
			Y[i] = strY.charAt(i);
		}
		

		//��ĭ�� �����̸鼭 ���ؼ� �ּҰ� ã��
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
	 * A= 5  b=8 �϶�   ���� 0~4��      �ڴ� 0~4��  B�� 1~5��ŭ ��
	 */
	

	
	
}//end of main
