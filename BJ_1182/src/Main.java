import java.util.Scanner;

public class Main {

	static int[] ary = new int[20];
	static int n;
	static int s;
	static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		s = sc.nextInt();

		for (int i = 0; i < n; i++)
			ary[i] = sc.nextInt();
		go(0, 0);
		if (s == 0)
			ans -= 1;
		System.out.println(ans);
	}

	private static void go(int i, int sum) {
		// TODO Auto-generated method stub

		if (i == n) {
			if (sum == s) {
				ans += 1;
			}
			return;
		}
		go(i + 1, sum + ary[i]);
		go(i + 1, sum);
	}

}
