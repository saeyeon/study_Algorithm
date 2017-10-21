import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[] ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n + 1];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int l = 0;
		int r = 0;
		int sum = a[0];
		int ans = n + 1;

		while (l <= r && r < n) {
			if (sum < m) {
				r++;
				sum += a[r];
			} else if (sum == m) {
				ans = Math.min(r - l + 1, ans);
				r++;
				sum += a[r];
			} else if (sum > m) {
				ans = Math.min(r - l + 1, ans);
				sum -= a[l];
				l++;
			}
		}

		if (ans > n)
			ans = 0;
		System.out.println(ans);
	}

}
