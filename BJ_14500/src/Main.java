import java.util.Scanner;

public class Main {

	static final int[] d_row = { 0, -1, 0, 1 };// ��,��
	static final int[] d_col = { -1, 0, 1, 0 };// ��,�Ʒ�
	// static final�� ������ �����ϳ� ���� ������ �Ұ����� ����
	static int N, M; // static�� ���� �� ��ȭ�� ������ ����
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
	
			if (nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= M) // �����¿��
				continue;
			if (visited[row][col]) // �湮������ ���� node��
				continue;
		
			dfs(depth + 1, nextRow, nextCol, sum + ary[row][col]);
		}
		visited[row][col] = false;
	}

}
