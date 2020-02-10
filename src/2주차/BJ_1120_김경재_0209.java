
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
���̰� N���� ���� ���ڿ� X�� Y�� ���� ��, �� ���ڿ� X�� Y�� ���̴� X[i] �� Y[i]�� i�� �����̴�. 
���� ���, X=��jimin��, Y=��minji���̸�, ���� ���̴� 4�̴�.

�� ���ڿ� A�� B�� �־�����. �̶�, A�� ���̴� B�� ���̺��� �۰ų� ����. 
���� A�� ���̰� B�� ���̿� ������ �� ���� ������ ���� ������ �� �� �ִ�.

A�� �տ� �ƹ� ���ĺ��̳� �߰��Ѵ�.
A�� �ڿ� �ƹ� ���ĺ��̳� �߰��Ѵ�.
�̶�, A�� B�� ���̰� �����鼭, A�� B�� ���̸� �ּҷ� �ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
/**
input :
adaabc aababbc
z cccdses
 */
public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine()," ");
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		
		// b[0]�������� a�� ���� ��ŭ b�� a�� ��
		// �ٸ� ���ĺ� ���� üũ
		// ���� b[1]���� a ���� ��ŭ b�� a��
		// b-a+1Ƚ����ŭ �ݺ�.
		int count, minCount = Integer.MAX_VALUE;
		for(int i = 0; i < b.length() - a.length() + 1; i++) {
			count = 0;
			for (int j = 0; j < a.length(); j++) {
				if(b.charAt(i+j)!=a.charAt(j)) count++;
			}
			if(minCount > count) minCount = count;
		}
		System.out.println(minCount);
		
	}
}
