import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N;
	static int[] pre;
	static int[] post;
	static boolean[] isPrime;
	static int[] dist; // check & 거리의 기능을 동시에 수행하네

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		init();

		for (int i = 0; i < N; i++) {

			for (int j = 1000; j < 10000; j++)
				dist[j] = -1;

			bfs(pre[i], post[i]);
		}
	}

	private static void bfs(int pre, int post) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(pre);
		dist[pre] = 0;
		while (!q.isEmpty()) {
			int now = q.poll();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j <= 9; j++) {
					int next = change(now, i, j);
					if (next == -1 || !isPrime[next] || dist[next] != -1)
						continue;
					dist[next] = dist[now] + 1;
					q.add(next);
				}
			}
		}
		if (dist[post] == -1)
			System.out.println("impossible");
		else
			System.out.println(dist[post]);
	}

	private static int change(int now, int index, int digit) {

		if (index == 0 && digit == 0)
			return -1;

		String s = String.valueOf(now);
		;
		char[] temp = new char[4];
		temp = s.toCharArray();
		s = "";
		temp[index] = (char) (digit + '0');
		for (int i = 0; i < temp.length; i++)
			s += temp[i];

		return Integer.parseInt(s);
	}

	private static void init() {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		pre = new int[N];
		post = new int[N];
		dist = new int[20000];
		isPrime = new boolean[10000];

		for (int i = 0; i < N; i++) {
			pre[i] = sc.nextInt();
			post[i] = sc.nextInt();
		}

		for (int i = 1001; i < 10000; i += 2) {
			isPrime[i] = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime[i] = false;
					break;
				}
			}
		}
	}
}
