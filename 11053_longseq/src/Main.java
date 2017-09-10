import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String ary = "";
		int cnt = scan.nextInt();
		scan.nextLine();
		ary = scan.nextLine();
		int[] seq = new int[cnt];
		int[] dp = new int[cnt + 1];

		for (int i = 0; i < cnt; i++) {
			seq[i] = Integer.parseInt(ary.split(" ")[i]);
		}
		for (int i = 0; i < cnt; i++) {
			dp[i] = 1;
			for (int j = 0; j < cnt; j++) {
				if (seq[i] > seq[j] && dp[i] < dp[j] + 1)
					dp[i] = dp[j] + 1;
			}
		}
		int max = 0;

		for (int i = 0; i < cnt; i++) {
			if (max < dp[i])
				max = dp[i];
		}

		System.out.println(max);
	}
}
