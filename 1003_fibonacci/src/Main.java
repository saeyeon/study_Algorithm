import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int cnt = scan.nextInt();

		int[] ary = new int[cnt];

		int max = 0;
		for (int i = 0; i < cnt; i++) {
			ary[i] = scan.nextInt();
			if (max < ary[i])
				max = ary[i];
		}

		int[] dp0 = new int[max + 1];
		int[] dp1 = new int[max + 1];

		dp0[0] = 1;
		dp0[1] = 0;
		dp1[0] = 0;
		dp1[1] = 1;

		for (int i = 2; i <= max; i++) {
			dp0[i] = dp0[i - 1] + dp0[i - 2];
			dp1[i] = dp1[i - 1] + dp1[i - 2];
		}
		for (int i = 0; i < cnt; i++)
			System.out.println(dp0[ary[i]] + " " + dp1[ary[i]]);
	}

}
