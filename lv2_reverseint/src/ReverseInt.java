import java.util.Arrays;

public class ReverseInt {
	public int reverseInt(int n) {

		String str = n + "";
		int sum = 0;
		int[] num = new int[str.length()];
		int nnn = n;
		for (int i = 0; i < str.length(); i++) {
			num[i] = nnn % 10;
			nnn /= 10;
		}

		Arrays.sort(num);

		for (int i = num.length - 1; i >= 0; i--)
			sum += num[i] * Math.pow(10, i);

		return sum;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}
