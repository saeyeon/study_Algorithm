class JumpCase {

	public int jumpCase(int num) {
		int answer = 0;
		int[] n = new int[num];
		n[0] = 1;
		n[1] = 2;

		for (int i = 2; i < num; i++)
			n[i] += n[i - 2] + n[i - 1];
		answer = n[num-1];
		return answer;
	}

	public static void main(String[] args) {
		JumpCase c = new JumpCase();
		int testCase = 5;
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.jumpCase(testCase));
	}
}
// dynamic programming
// 1ĭ = 1; 2ĭ = 2; �ʱ�����
// 3ĭ = 2ĭ + 1ĭ; 4ĭ = 3ĭ + 2ĭ ; ....
// 5ĭ�� ��� 4ĭ�� ���� �� ����� ������ +1ĭ�� ���� �Ǵ� �� + 3ĭ�� ��츦 �����ִ� ������ +2 �� ����� ���� �ֱ� ������
// �Ǻ���ġ ���� ?