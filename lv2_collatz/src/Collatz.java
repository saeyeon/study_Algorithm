class Collatz {
	public int collatz(long num) {
		int answer = 0;
		int index = 0;
		while (true) {
			if (num % 2 == 0)
				num /= 2;
			else
				num = num * 3 + 1;
			index += 1;
			if (index >= 500) {
				index = -1;
				break;
			}
			if (num == 1)
				break;
		}
		return index;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}