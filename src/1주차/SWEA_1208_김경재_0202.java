import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			int numDump = sc.nextInt();
			int[] arr = new int[100];
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int i = 0; i < numDump; i++) {
				Arrays.sort(arr);	//����
				arr[99]--;			//���� ū���ڿ���
				arr[0]++;			//���� ���� ���ڷ�
			}
			
			Arrays.sort(arr);
			int result = arr[99]-arr[0];	//�����
			System.out.println("#"+test_case+" "+result);
		}
	}
}
