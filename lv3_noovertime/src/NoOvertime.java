import java.util.Arrays;

class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		// �߱� ������ �ּ�ȭ �Ͽ��� ���� �߱� ������ ���ϱ��?
		while (no != 0) {
			Arrays.sort(works);
			works[works.length - 1] -= 1;
			no -= 1;
		}
		for (int i = 0; i < works.length; i++)
			result += (int) Math.pow(works[i], 2);

		return result;
	}

	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int[] test = { 4, 3, 3 };
		System.out.println(c.noOvertime(4, test));
	}
}

// �߱� ����
// ȸ����� �����̴� ���� ���� �׿� �ֽ��ϴ�. �����̴� �߱��� �ּ�ȭ�ϱ� ���� ���� ���� �۾����� ���ڷ� �ޱ��, �Ͽ� ���� �߱� ������
// ���̱�� �����߽��ϴ�.
// �߱� ������ ���� ���� �۾����� �����Ͽ� ���� ���� �ǹ��մϴ�. �����̴� 1�ð� ���� ���� �� �� �ϳ��� ��� �۾��� 1��ŭ ó���� ��
// �ֽ��ϴ�.
// �������� ��ٱ��� ���� N �ð��� �� �Ͽ� ���� �۾����� ���� ��, noOvertime �Լ��� �����Ͽ� �������� �߱� ������ �ּ�ȭ ��
// ����� ����� �ּ���.
// ���� ���, N=4 �� ��, ���� ���� �۾����� [4, 3, 3] �̶�� �߱� ������ �ּ�ȭ�ϱ� ���� ���� �� ����� [2, 2, 2]��
// �ǰ� �߱� ������ 22 + 22 + 22 = 12�� �Ǿ� 12�� ��ȯ�� �ݴϴ�.