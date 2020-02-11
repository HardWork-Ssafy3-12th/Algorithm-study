package algo.study.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			int point = 0;
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				if(str.substring(j, j+1).equals("O")) {
					point++;
					sum += point;
				}else {
					point = 0;
				}
			}
			System.out.println(sum);
		}
	} // end of main
} // end of class
