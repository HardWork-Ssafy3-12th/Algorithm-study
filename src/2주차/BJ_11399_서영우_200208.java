package 백준;

import java.util.Arrays;
import java.util.Scanner;

// 3 1 4 3 2
public class 백준Main_11399_서영우_ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		int[] used = new int[N];
		int sum = 0;
		
		for (int i = 0; i < N; i++) 
			num[i] = sc.nextInt();
		
		Arrays.sort(num);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				used[i] += num[j];
			}
			sum += used[i];
		}
		
		System.out.println(sum);
		
	}//end of main
}// end of class
