import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean[] prime = new boolean[1000001];
		int M = sc.nextInt();
		int N = sc.nextInt();

		prime[0] = prime[1] = false;

		for (int i = 2; i < N; i++)
			prime[i] = true;

		for (int i = 4; i < N; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					prime[i] = false;
					break;
				}
			}
		}
		for (int i = M; i <= N; i++) {
			if (prime[i] == true)
				System.out.println(i);
		}
	}

}
