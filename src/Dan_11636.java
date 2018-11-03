import java.util.Scanner;


public class Dan_11636 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, count;
		count = 1;
		
		while (true) {
			n = sc.nextInt();
			if (n == -1) break;
			
			for (i = 0; Math.pow(2, i) < n; i++) {}
			
			System.out.printf("case %d: %d\n", count, i);
			count++;
		}
		
		sc.close();
	}
}
//Testing (Max)
