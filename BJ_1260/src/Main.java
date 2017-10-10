import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N;
	static int M;
	static int V;
	static int[][] graph;
	static boolean visited[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		graph = new int[1001][1001];
		visited = new boolean[10001];

		int a, b;

		for (int i = 1; i <= M; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			graph[a][b] = graph[b][a] = 1;
		}

		dfs(V);

		for (int j = 1; j <= N; j++)
			visited[j] = false;

		System.out.println();

		bfs(V);
	}

	private static void bfs(int v) {

		Queue<Integer> q = new LinkedList<Integer>();
		visited[v] = true;
		System.out.print(v + " ");
		q.offer(v);
		int temp;

		while (!q.isEmpty()) {
			temp = q.poll();
			for (int i = 0; i <= N; i++) {
				if (graph[v][i] == 1 && visited[i] == false) {
					q.offer(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}

	private static void dfs(int v) {

		visited[v] = true;
		System.out.print(v + " ");

		for (int i = 1; i <= N; i++) {
			if (graph[v][i] == 1 && visited[i] == false)
				dfs(i);
		}
	}
}
