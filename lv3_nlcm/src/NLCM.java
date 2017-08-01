import java.util.Arrays;

class NLCM {
	public long nlcm(int[] num) {
		long answer = 1;
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			answer = lcm(answer, num[i]);
		}
		return answer;
	}

	private long lcm(long num, long num2) {

		long gcd = 0;
		long mod = 0;
		long small = num;
		long large = num2;
		long ret = 0;
		while (true) {
			mod = num2 % num;
			if (mod == 0) {
				gcd = num;
				break;
			} else {
				num2 = num;
				num = mod;
			}
		}
		return small * large / gcd;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.nlcm(ex));
	}
}

// �� ���� �ּҰ����(Least Common Multiple)�� �Էµ� �� ���� ��� �� ������ �Ǵ� ���� ���� ���ڸ� �ǹ��մϴ�. ����
// ��� 2�� 7�� �ּҰ������ 14�� �˴ϴ�.
// ���Ǹ� Ȯ���ؼ�, n���� ���� �ּҰ������ n ���� ������ ��� �� ������ �Ǵ� ���� ���� ���ڰ� �˴ϴ�. nlcm �Լ��� ���� n����
// ���ڰ� �ԷµǾ��� ��, �ּҰ������ ��ȯ�� �ּ���.
// ������� [2,6,8,14] �� �Էµȴٸ� 168�� ��ȯ�� �ָ� �˴ϴ�.