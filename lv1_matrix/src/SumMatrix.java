class SumMatrix {
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][A[0].length];

		if (A.length != B.length || A[0].length != B[0].length) {
			return null;
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				answer[i][j] = A[i][j] + B[i][j];
			}
		}

		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2, 1 }, { 2, 3, 2 } };
		int[][] B = { { 3, 4, 4 }, { 5, 6, 3 } };
		int[][] answer = c.sumMatrix(A, B);
		if (answer[0][0] == 4 && answer[0][1] == 6 && answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("�¾ҽ��ϴ�. ������ ���� ������");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�. �����ϴ°� ���ھ��");
		}
	}
}
