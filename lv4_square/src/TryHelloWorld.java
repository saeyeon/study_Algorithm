class TryHelloWorld {
	public int findLargestSquare(char[][] board) {
		int maxCol = board.length;
		int maxRow = board[0].length;
		int col = 0;
		int row = 0;
		int max = 0;
		int[][] dp = new int[maxCol][maxRow];

		for (col = 0; col < maxCol; col++) {
			if (board[col][0] == 'X')
				dp[col][0] = 0;
			else
				dp[col][0] = 1;
		}
		for (row = 0; row < maxRow; row++) {
			if (board[0][row] == 'X')
				dp[0][row] = 0;
			else
				dp[0][row] = 1;
		}
		for (col = 1; col < maxCol; col++) {
			for (row = 1; row < maxRow; row++) {
				if (board[col][row] == 'O')
					dp[col][row] = min(dp[col][row - 1], dp[col - 1][row], dp[col - 1][row - 1]) + 1;
					if (dp[col][row] > max)
						max = dp[col][row];
			}
		}

		return max * max;
	}

	private int min(int i, int j, int k) {
		int ary[] = { i, j, k };
		int min = ary[0];
		for (int n = 0; n < ary.length; n++) {
			if (ary[n] < min)
				min = ary[n];
		}

		return min;
	}

	public static void main(String[] args) {
		TryHelloWorld test = new TryHelloWorld();
		char[][] board = { { 'X', 'O', 'O', 'O', 'X' }, { 'X', 'O', 'O', 'O', 'O' }, { 'X', 'X', 'O', 'O', 'O' },
				{ 'X', 'X', 'O', 'O', 'O' }, { 'X', 'X', 'X', 'X', 'X' } };

		System.out.println(test.findLargestSquare(board));
	}

}