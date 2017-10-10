import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static final int[] dx = { 0, 0, -1, 1 };
	static final int[] dy = { 1, -1, 0, 0 };
	static int[][] d;
	static boolean[][] check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Point {
			int x;
			int y;

			Point(int x, int y) {
				this.x = x;
				this.y = y;
			}
		}
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		d = new int[N + 1][M + 1];
		char[][] map = new char[N + 1][M + 1];
		check = new boolean[N + 1][M + 1];
		String[] s = new String[N];
		sc.nextLine();
		for(int i=0;i<N;i++){
			s[i] = sc.nextLine();
		}
		for (int i =1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				map[i][j] = s[i-1].charAt(j-1);
			}
		}
		Queue<Point> q = new LinkedList<Point>();
		Point p = new Point(1, 1);
		q.offer(p);
		check[1][1] = true;

		while (!q.isEmpty()) {
			Point now = q.poll();
			for (int k = 0; k < 4; k++) {
				int nx = now.x + dx[k];
				int ny = now.y + dy[k];

				if (nx < 1 || nx > N || ny < 1 || ny > M)
					continue;

				if (map[nx][ny] == '1' && check[nx][ny] == false) {
					Point next = new Point(nx, ny);
					q.offer(next);
					check[nx][ny] = true;
					d[nx][ny] = d[now.x][now.y] + 1;
					continue;
				}
			}
		}
		System.out.println(d[N][M] + 1);
	}
}
