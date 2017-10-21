import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[][] a = new long[101][101];
		long[][] d = new long[101][101];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		d[1][1] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (a[i][j] == 0)
					continue;

				if (j + a[i][j] <= n)
					d[i][(int) (j + a[i][j])] += d[i][j];
				if (i + a[i][j] <= n)
					d[(int) (i + a[i][j])][j] += d[i][j];
			}
		}
		System.out.println(d[n][n]);
	}

}
