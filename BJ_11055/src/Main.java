import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			d[i] = a[i];
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j] && d[i] < d[j] + a[i]) {
					d[i] = d[j] + a[i];
				}
			}
		}
		Arrays.sort(d);
		System.out.println(d[n]);
	}
}
