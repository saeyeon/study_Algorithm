import java.util.Scanner;

public class Main {

	static int n;
	static int ans;
	static boolean[][] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new boolean[100][100];
		ans = 0;
		calc(0);
		System.out.println(ans);
	}

	private static void calc(int r) {
		// TODO Auto-generated method stub

		if (r == n) {
			ans += 1;
		}
		for (int c = 0; c < n; c++) {
			a[r][c] = true;
			if (check(r, c)) {
				calc(r + 1);
			}
			a[r][c] = false;
		}
	}

	private static boolean check(int r, int c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			if (i == r)
				continue;
			if (a[i][c]) {
				return false;
			}
			int x = r - 1;
			int y = c - 1;
			while (x >= 0 && y >= 0) {
				if (a[x][y] == true) {
					return false;
				}
				x--;
				y--;
			}
			x = r - 1;
			y = c + 1;
			while (x >= 0 && y >= 0) {
				if (a[x][y] == true) {
					return false;
				}
				x--;
				y++;
			}
		}
		return true;
	}

}
