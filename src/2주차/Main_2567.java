package algo.study.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2567 {
//	public static int[] dr = {-1,-1,-1, 0, 1,1,1, 0};
//	public static int[] dc = {-1,0,1, 1, 1,0,-1, -1};
	public static int[] dr = {-1,1,0,0};
	public static int[] dc = {0,0,1,-1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[][] board = new int[100][100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			int endC = c + 10;
			int endR = r + 10;
			for (int j = r; j < endR; j++) {
				for (int j2 = c; j2 < endC; j2++) {
					board[j][j2] = 1;
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j] == 1) {
					for (int k = 0; k < dr.length; k++) {
						int newR = i + dr[k];
						int newC = j + dc[k];
						
						if(newR < 0 || newR >= board.length || 
								newC < 0 || newC >= board.length || board[newR][newC] == 0) {
							count++;
						}
					}
				}
			}
		}
		
		System.out.println(count);
	} // end of main
} // end of class
