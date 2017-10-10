import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int F = sc.nextInt();// 전체
		int S = sc.nextInt();// 시작지
		int G = sc.nextInt();// 목적지
		int U = sc.nextInt();// 위
		int D = sc.nextInt();// 아래
		boolean[] c = new boolean[F + 1];
		int[] d = new int[F + 1];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(S);

		while (!q.isEmpty()) {
			int now = q.poll();

			c[now] = true;
			int next = now + U;
			if (next >= 1 && next <= F && c[next] == false) {
				q.offer(next);
				c[next] = true;
				d[next] = d[now] + 1;
			}
			next = now - D;
			if (next >= 1 && next <= F && c[next] == false) {
				q.offer(next);
				c[next] = true;
				d[next] = d[now] + 1;
			}
		}
			if (S == G)
				System.out.println(0);
			else if (d[G] <= 0)
				System.out.println("use the stairs");

			else
				System.out.println(d[G]);
		
	}
}
