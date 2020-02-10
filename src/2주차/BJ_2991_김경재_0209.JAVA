
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		int p = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int pCnt =  check(p,a,b,c,d);
		int mCnt =  check(m,a,b,c,d);
		int nCnt =  check(n,a,b,c,d);
		
		sb.append(pCnt).append(" ").append(mCnt).append(" ").append(nCnt);
		
		System.out.println(sb);
	}
	public static int check(int i, int a, int b, int c, int d) {
		int cnt = 0;
		if(i%(a+b) > 0 && i%(a+b) <= a) cnt++;
		if(i%(c+d) > 0 && i%(c+d) <= c) cnt++;
		return cnt;
	}
}
