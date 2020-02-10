import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			int oCnt = 0;
			int sum = 0;
			int result = 0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)=='O') {
					oCnt++;
				}
				else {	// n*(n+1)/2
					sum += oCnt*(oCnt+1)/2;				
					oCnt = 0;
				}
			}
			sum += oCnt*(oCnt+1)/2;
			System.out.println(sum);
		}
	}
}
