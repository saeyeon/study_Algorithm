import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[100];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int l = 0;
		int r = 0;
		int sum = a[0];
		int ans = 0;
		while (r < n) {
			if (sum < m) {
				r++;
				sum += a[r];
			} else if (sum == m) {
				ans++;
				r++;
				sum += a[r];
			} else if (sum > m) {
				sum -= a[l];
				l++;
			}
		}
		System.out.println(ans);
	}

}
