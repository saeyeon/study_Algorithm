class TryHelloWorld {
	public int nextBigNumber(int n) {
		int answer = 0;
		int index = 0;

		index = getCount(n);
		for (int i = n + 1; i < 1000000; i++) {
			if (getCount(i) == index) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	private int getCount(int i) {

		int index = 0;
		while (i != 0) {
			if (i % 2 == 1)
				index += 1;
			i /= 2;
		}
		return index;
	}

	public static void main(String[] args) {
		TryHelloWorld test = new TryHelloWorld();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}
}