import java.util.Scanner;

public class Main {

	static int[][] a;
	static int[][] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();

			a = new int[2][n + 1];
			d = new int[n + 1][3];
			for (int i = 0; i < 2; i++) {
				for (int j = 1; j <= n; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			for (int i = 1; i <= n; i++) {
				d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
				d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + a[0][i];
				d[i][2] = Math.max(d[i - 1][0], d[i - 1][1]) + a[1][i];

			}
			System.out.println(Math.max(d[n][0], Math.max(d[n][1], d[n][2])));
		}
	}

}
