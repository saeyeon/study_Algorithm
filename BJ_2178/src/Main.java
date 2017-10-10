import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static boolean[][] check;
	static int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		map = new int[N + 1][M + 1];
		check = new boolean[100][100];
		length = 0;
		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= M; j++)
				map[i][j] = sc.nextInt();

	}

	private static void bfs(int start) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		int i = 1;
		int j = 1;
		while (!q.isEmpty()) {
			int now = q.poll();
			
			if (map[i + 1][j] == 1 && check[i + 1][j] == false) {
				q.offer(map[i + 1][j]);
				check[i + 1][j] = true;
			}
			if (map[i][j + 1] == 1 && check[i][j + 1] == false) {
				q.offer(map[i][j + 1]);
				check[i + 1][j] = true;
			}
		}

	}

}
