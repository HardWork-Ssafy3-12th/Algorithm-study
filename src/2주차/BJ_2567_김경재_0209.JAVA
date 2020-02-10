
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[][] map;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());		
		int n =  Integer.parseInt(st.nextToken());	//색종이수	
		map = new int[100][100];
		
		for (int i = 0; i < n; i++) {	//input
			st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			for(int j = r; j < r + 10; j++) {
				Arrays.fill(map[j], c, c + 10, 1);				
			}
		}
		
		int count = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(map[i][j]==1) {
					for (int k = 0; k < dx.length; k++) {
						if(i+dx[k]<0 || i+dx[k]>=100 ||
								j+dy[k]<0 || j+dy[k]>=100) {	// 색종이가 끝에있는경우
							count++;
						}else if(map[i+dx[k]][j+dy[k]] == 0) {	// 사방탐색해서 0이 있는경우
							count++;
						}
					}
				}
			}
		}
		sb.append(count);
		System.out.println(sb);
		
	}//main
}
