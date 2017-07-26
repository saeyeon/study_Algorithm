class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		int[] num = new int[n];
		int index = 0;
		for (int i = 0; i < n - 1; i++)
			num[i] = 2 + i;

		for (int i = 0; i < n - 1; i++) {
			index += 1;
			for (int j = 2; j <= num[i] / 2; j++) {
				if (num[i] % j == 0) {
					index -= 1;
					break;
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(10));
	}

}
