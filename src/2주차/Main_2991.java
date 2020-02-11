package algo.study.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2991 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int dog1A = Integer.parseInt(st.nextToken());
		int dog1R = Integer.parseInt(st.nextToken());
		int dog2A = Integer.parseInt(st.nextToken());
		int dog2R = Integer.parseInt(st.nextToken());
		int full1 = dog1A + dog1R;
		int full2 = dog2A + dog2R;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			int count = 0;
			int P = Integer.parseInt(st.nextToken());
			int namu1 = P % full1;
			int namu2 = P % full2;
			if(namu1 != 0 && namu1 <= dog1A) {
				count++;
			}
			if(namu2 != 0 && namu2 <= dog2A) {
				count++;
			}
			
			
			System.out.println(count);
		}
	} // end of main
} // end of class
