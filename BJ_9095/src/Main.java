import java.util.Scanner;

public class Main {

	static int cnt;
	static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			cnt = 0;
			sum = 0;
			int ans = 0;

			ans += go(cnt, sum, n);

			System.out.println(ans);
		}
	}

	private static int go(int cnt, int sum, int n) {
		// TODO Auto-generated method stub
		if (sum > n)
			return 0;
		if (sum == n)
			return 1;

		int now = 0;

		for (int i = 1; i <= 3; i++) {
			now += go(cnt + 1, sum + i, n);
		}
		return now;
	}
}
