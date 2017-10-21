import java.util.Scanner;

public class Main {

	static final int[] d_row = { 0, -1, 0, 1 };// 왼,오
	static final int[] d_col = { -1, 0, 1, 0 };// 위,아래
	// static final은 접근은 가능하나 값의 변경이 불가능한 변수
	static int N, M; // static은 접근 및 변화가 가능한 변수
	static int[][] ary = new int[501][501];
	static boolean[][] visited = new boolean[501][501];
	static int maxVal = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				ary[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				dfs(0, i, j, 0);
			}
		}
		
	}

	static void dfs(int depth, int row, int col, int sum) {
		
		if (depth == 3) {
			sum += ary[row][col];

			maxVal = Math.max(maxVal, sum);
		}
		visited[row][col] = true;

		for (int i = 0; i < 4; i++) {

			int nextRow = row + d_row[i];
			int nextCol = col + d_col[i];
	
			if (nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= M) // 상하좌우로
				continue;
			if (visited[row][col]) // 방문했으면 다음 node로
				continue;
		
			dfs(depth + 1, nextRow, nextCol, sum + ary[row][col]);
		}
		visited[row][col] = false;
	}

}
