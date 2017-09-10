import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String ary = "";
		ary = scan.nextLine();
		int a = Integer.parseInt(ary.split(" ")[0]);
		int b = Integer.parseInt(ary.split(" ")[1]);
		int num = 0;
		for (int i = a; i <= b; i++) {

			num += primeNum(i);
		}
		System.out.println(num);
	}

	private static int primeNum(int i) { // i를 집어넣어서 소인수를 구하고 소인수가 소수인 애들 개수 체크

		int j = 2;
		int cnt = 0;
		int ret = 0;
		while (i != 1) {
			if (i % j == 0) {
				i = i / j;
				cnt += isPrime(j);
				j = 2;
				continue;
			}
			j++;
		}
		if (isPrime(cnt) == 1 && cnt != 1)
			return 1;
		else
			return 0;
	}

	private static int isPrime(int j) { // 소수인지 아닌지 체크

		for (int i = 2; i <= j / 2; i++) {
			if (j % i == 0)
				return 0;
		}
		return 1;

	}
}

// 범위의 숫자들 중에 소수를 먼저 구해서 배열에 집어넣고 시작