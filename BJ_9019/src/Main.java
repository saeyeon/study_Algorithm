import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int T;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		int[] pre = new int[T];
		int[] post = new int[T];

		for (int i = 0; i < T; i++) {
			pre[i] = sc.nextInt();
			post[i] = sc.nextInt();
		}
		for (int i = 0; i < T; i++)
			bfs(pre[i], post[i]);
	}

	private static void bfs(int pre, int post) {
		// TODO Auto-generated method stub

		int[] dist = new int[10001];
		int[] from = new int[10001];
		char[] how = new char[10001];
		boolean[] check = new boolean[10001];

		check[pre] = true;
		dist[pre] = 0;
		from[pre] = -1;

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(pre);

		while (!q.isEmpty()) {
			int now = q.poll();
			int next = (now * 2) % 10000;
			if (check[next] == false) {
				q.offer(next);
				check[next] = true;
				dist[next] = dist[now] + 1;
				from[next] = now;
				how[next] = 'D';
			}

			next = now - 1;
			if (next == -1)
				next = 9999;
			if (check[next] == false) {
				q.offer(next);
				check[next] = true;
				dist[next] = dist[now] + 1;
				from[next] = now;
				how[next] = 'S';
			}
			next = (now % 1000) * 10 + now / 1000;
			if (check[next] == false) {
				q.offer(next);
				check[next] = true;
				dist[next] = dist[now] + 1;
				from[next] = now;
				how[next] = 'L';
			}

			next = (now / 10) + (now % 10) * 1000;
			if (check[next] == false) {
				q.offer(next);
				check[next] = true;
				dist[next] = dist[now] + 1;
				from[next] = now;
				how[next] = 'R';
			}
		}

		String ans = "";
		String ret = "";
		while (post != pre) {
			ans += (how[post]);
			post = from[post];
		}

		for (int i = ans.length() - 1; i >= 0; i--)
			ret += ans.charAt(i);
		System.out.println(ret);
	}
}