class NLCM {
	public long nlcm(int[] num) {
		long answer = 0;

		return answer;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.nlcm(ex));
	}
}

//�� ���� �ּҰ����(Least Common Multiple)�� �Էµ� �� ���� ��� �� ������ �Ǵ� ���� ���� ���ڸ� �ǹ��մϴ�. ���� ��� 2�� 7�� �ּҰ������ 14�� �˴ϴ�.
//���Ǹ� Ȯ���ؼ�, n���� ���� �ּҰ������ n ���� ������ ��� �� ������ �Ǵ� ���� ���� ���ڰ� �˴ϴ�. nlcm �Լ��� ���� n���� ���ڰ� �ԷµǾ��� ��, �ּҰ������ ��ȯ�� �ּ���.
//������� [2,6,8,14] �� �Էµȴٸ� 168�� ��ȯ�� �ָ� �˴ϴ�.