import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int temp = 0;
		int num = 0;

		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		int[] dp = new int[num + 1];

		for (int i = 2; i <= num; i++) { // dp[1] = 0;

			dp[i] = dp[i - 1] + 1;

			if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
				dp[i] = dp[i / 2] + 1;
			}
			if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
				dp[i] = dp[i / 3] + 1;
			}

		}

		System.out.println(dp[num]);
	}

}
