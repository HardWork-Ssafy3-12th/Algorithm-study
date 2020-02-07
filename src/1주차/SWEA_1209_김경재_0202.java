import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static int[][] arr = new int[100][100];
	
	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}// end of input
			
			int max = 0;
			int sumRow, sumCol, sumCross = 0;
			
			//����
			for (int i = 0; i < 100; i++) {
				sumRow = 0;
				for (int j = 0; j < 100; j++) {
					if(i==j){	// �밢��
						sumCross += arr[i][j];
					}
					sumRow += arr[i][j];
				}
				if(max < sumRow){
					max = sumRow;
				}
			}	
			if(max < sumCross){	// ù �밢�� ��
				max = sumCross;
			}
			sumCross = 0;	//�밢�� �� �ʱ�ȭ
			
			//����			
			for (int j = 0; j < 100; j++) {
				sumCol = 0;
				for (int i = 0; i < 100; i++) {
					if(i==j){	// �밢��
						sumCross += arr[i][j];
					}
					sumCol += arr[i][j];
				}
				if(max < sumCol){
					max = sumCol;
				}
			}
			if(max < sumCross){	// �ι�° �밢�� ��
				max = sumCross;
			}
			
			System.out.println("#"+test_case+" "+max);
			
		}
	}
}
