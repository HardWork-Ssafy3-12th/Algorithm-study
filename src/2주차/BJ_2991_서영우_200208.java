package ����;

import java.util.Scanner;

//���� 2991 �糪�
/*
 * �� 1 : A�� ������, B�� �޽�
 * �� 2 : C�� ����, D�� �޽�
 * �����ð� : ��ü��(P), �Ź�(N), ����(M)
 * ��ħ ����(0), ������ �����ð� : �����ð� 
 * ���� 3 �̸� 3���� ����Ǵ� �߿� ����
 * ��ü��, ����, �Ź� ������ ����� ������ ���ݹ޴��� ���
 */
public class ����Main_2991_������_�糪� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int[] arrive = new int[3];
		for (int i = 0; i < 3; i++) 
			arrive[i] = sc.nextInt();
				
		//  i(����+�޽�) <= i*�����ð� <= ���ݽð� + i(����+�޽Ľð�) -> �������� �ð�
		// �� 2 4 =>  ~2 6~8 12~14 18~20 24 ...   30~32 36       
		//���� 35 
		for (int i = 0; i < 3; i++) {
			int dog = 0;
			int D1 = arrive[i] % (A+B);
			int D2 = arrive[i] % (C+D);
			
			// 0�� �ƴϰ� ���ݽð����� ������ dog++;
			if(D1 != 0 && D1 <= A) // ��1���� ���ݹ޾�����
				dog++;
			if(D2 != 0 && D2 <= C) // ��2���� ���ݹ޾�����
				dog++;
			
//			int D1 = arrive[i]/(A+B); // ��1 
//			int D2 = arrive[i]/(C+D); // ��2 
//			//
//			if(D1*(A+B) < arrive[i] && arrive[i] <=D2*(A+B)+A)
//				dog++;
//			if(D2*(C+D) < arrive[i] && arrive[i] <=D2*(C+D)+C)
//				dog++;
			
			System.out.println(dog);
		}
		
		
	}// end of main
}// end of class
