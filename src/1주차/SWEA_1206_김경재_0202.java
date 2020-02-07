import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			int n = sc.nextInt();	//������ ����
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}	//end of input
			
			int count = 0, max;
			boolean flag;
			//�� ���� �� ĭ�� �� ������ �� ĭ���� �ǹ��� �������� �ʴ´�
			for (int i = 2; i < arr.length - 2; i++) {	
				max = -1;
				flag = false;
				for (int j = i-2; j <= i+2; j++) {	// �¿� 2ĭ�� Ȯ��
					if(j == i)continue;	// ������ üũ ����
					else if(arr[j]>=arr[i]){ 	// ���� �ǹ����� ũ�ų� ���� �ǹ��������� x
						flag = false;
						break;
					}
					else if(max < arr[j]){	// ���� �ǹ����� ������ �ǹ� ���̸� üũ
						max = arr[j];	
						flag = true;
					}
				}
				if(flag){
					count += arr[i] - max;
				}
			}
			
			System.out.println("#"+testCase+" "+count);
		}
	}
}
