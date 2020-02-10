
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
길이가 N으로 같은 문자열 X와 Y가 있을 때, 두 문자열 X와 Y의 차이는 X[i] ≠ Y[i]인 i의 개수이다. 
예를 들어, X=”jimin”, Y=”minji”이면, 둘의 차이는 4이다.

두 문자열 A와 B가 주어진다. 이때, A의 길이는 B의 길이보다 작거나 같다. 
이제 A의 길이가 B의 길이와 같아질 때 까지 다음과 같은 연산을 할 수 있다.

A의 앞에 아무 알파벳이나 추가한다.
A의 뒤에 아무 알파벳이나 추가한다.
이때, A와 B의 길이가 같으면서, A와 B의 차이를 최소로 하는 프로그램을 작성하시오.
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
		
		
		// b[0]에서부터 a의 길이 만큼 b와 a를 비교
		// 다른 알파벳 갯수 체크
		// 이후 b[1]부터 a 길이 만큼 b와 a비교
		// b-a+1횟수만큼 반복.
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
