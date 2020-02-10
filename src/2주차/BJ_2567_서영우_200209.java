package 백준;

import java.util.Arrays;
import java.util.Scanner;

//백준 2567번 
/*
 * 색종이 10*10 크기 , 배열은 100*100 
 * 색종이 왼쪽 아래 좌표 주어짐
 */
public class 백준Main_2567_서영우_색종이2 {
	static char map[][] = new char[101][101]; //색종이 붙일 곳, 0번 안씀
	static int garo[] = {1,-1,0,0}; //동서남북
	static int sero[] = {0,0,1,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		boolean map[][] = new boolean[101][101]; //색종이 붙일 곳, 0번 안씀

		int N = sc.nextInt();
		int mr=0, mc=0; // 탐색할 최대 범위 지정 용도
		int length = 0; // 길이
		
		for (int i = 0; i < map.length; i++) { //맵 초기화
			Arrays.fill(map[i], 'F');
		}

		for (int i = 0; i < N; i++) { //좌표 받아서 입력
			int row = sc.nextInt();
			int col = sc.nextInt();
			if(row > mr)
				mr = row;
			if(col > mc)
				mc = col;
			
			for (int a = row; a < row+10; a++) { //색종이 표시
				for (int b = col; b < col+10; b++) {
					map[a][b] = 'T';
				}
			}
		}// end of input
		
		print(mr, mc);
		
		//탐색, 3방향만 T이면 길이 1, 2방향만 T이면 길이 2
		for (int row = 0; row < mr+10; row++) {
			for (int col = 0; col < mc+10; col++) {
				//T일때 상하좌우 탐색해서 T가 2개이면 길이 2, 3개이면 길이 1 
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
	
	//상하좌우 탐색해서 T인경우 카운트 +1 해서 반환
	static int check(int r, int c) {
		int T = 0;
		for (int i = 0; i < 4; i++) {
			int row = r + sero[i];
			int col = c + garo[i];
			if(row>0 && col>0 && row < 101 && col < 101) { //범위 안일때 
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
