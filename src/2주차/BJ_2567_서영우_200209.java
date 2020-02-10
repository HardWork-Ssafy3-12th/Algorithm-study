package ����;

import java.util.Arrays;
import java.util.Scanner;

//���� 2567�� 
/*
 * ������ 10*10 ũ�� , �迭�� 100*100 
 * ������ ���� �Ʒ� ��ǥ �־���
 */
public class ����Main_2567_������_������2 {
	static char map[][] = new char[101][101]; //������ ���� ��, 0�� �Ⱦ�
	static int garo[] = {1,-1,0,0}; //��������
	static int sero[] = {0,0,1,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		boolean map[][] = new boolean[101][101]; //������ ���� ��, 0�� �Ⱦ�

		int N = sc.nextInt();
		int mr=0, mc=0; // Ž���� �ִ� ���� ���� �뵵
		int length = 0; // ����
		
		for (int i = 0; i < map.length; i++) { //�� �ʱ�ȭ
			Arrays.fill(map[i], 'F');
		}

		for (int i = 0; i < N; i++) { //��ǥ �޾Ƽ� �Է�
			int row = sc.nextInt();
			int col = sc.nextInt();
			if(row > mr)
				mr = row;
			if(col > mc)
				mc = col;
			
			for (int a = row; a < row+10; a++) { //������ ǥ��
				for (int b = col; b < col+10; b++) {
					map[a][b] = 'T';
				}
			}
		}// end of input
		
		print(mr, mc);
		
		//Ž��, 3���⸸ T�̸� ���� 1, 2���⸸ T�̸� ���� 2
		for (int row = 0; row < mr+10; row++) {
			for (int col = 0; col < mc+10; col++) {
				//T�϶� �����¿� Ž���ؼ� T�� 2���̸� ���� 2, 3���̸� ���� 1 
				int T = 0;
				if(map[row][col]=='T')
					T = check(row, col);
				if(T == 2)
					length += 2;
				else if(T==3)
					length++;	
			}
		}
		System.out.println(length);
	}//end of main
	
	//�����¿� Ž���ؼ� T�ΰ�� ī��Ʈ +1 �ؼ� ��ȯ
	static int check(int r, int c) {
		int T = 0;
		for (int i = 0; i < 4; i++) {
			int row = r + sero[i];
			int col = c + garo[i];
			if(row>0 && col>0 && row < 101 && col < 101) { //���� ���϶� 
				if(map[row][col] == 'T')
					T++;
			}
		}
		return T;
	}
	
	static void print(int mr, int mc) {
		for (int i = 1; i < mr+11; i++) {
			for (int j = 1; j < mc+11; j++) {
				System.out.print(map[i][j]+"");
			}
			System.out.println();
		}
	}
}//end of class
