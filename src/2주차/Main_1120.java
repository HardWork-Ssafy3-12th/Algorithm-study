package algo.study.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		int cha = str2.length() - str1.length();
		int min = 50;
		for (int i = 0; i <= cha; i++) {
			int count = 0;
			for (int j = 0; j < str1.length(); j++) {
				if(str1.charAt(j) != str2.charAt(i+j)) {
					count++;
				}
			}
			if(min > count) {
				min = count;
			}
		}
		
		System.out.println(min);
		
	} // end of main
} // end of class
