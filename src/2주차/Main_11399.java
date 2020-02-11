package algo.study.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ps = Integer.parseInt(br.readLine());
		
		int[] time = new int[ps];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < time.length; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		int timeS = 0;
		int sum = 0;
		for (int i = 0; i <= time.length-1; i++) {
			for (int j = i; j < time.length; j++) {
				if(time[i] > time[j]) {
					int temp = time[i];
					time[i] = time[j];
					time[j] = temp;
				}
			}
			sum += time[i];
			timeS += sum;
		}
		
		System.out.println(timeS);
	} // end of main
} // end of class
