import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n;
	static long[][] w;
	static int max = Integer.MAX_VALUE;
	static int max_n = 800;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int e = sc.nextInt();
		w = new long[max_n+1][max_n + 1];
		
		for(int i=0;i<=max_n;i++){
			for(int j=0;j<=max_n;j++){
				w[i][j] = max;
			}
		}
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			w[a][b] = w[b][a] = c;
		}

		for (int i = 1; i <= n; i++) { // 거쳐가는 꼭지점
			for (int j = 1; j <= n; j++) { // 시작하는 꼭지점
				for (int k = 1; k <= n; k++) { // 도착하는 꼭지점
					if (w[j][i] + w[i][k] < w[j][k]) { // 시작점에서 거쳐서 도착점 가는 경로가 시작에서 바로 경로로 가는 것보다 짧으면
						w[j][k] = w[j][i] + w[i][k]; // 값을 대체해줌
					}
				}
			}
		}
		int p = sc.nextInt();
		int q = sc.nextInt();
		long ans = 0;
		w[p][p] = w[q][q] = 0;
		ans = Math.min(w[1][p] + w[p][q] + w[q][n], w[1][q] + w[q][p] + w[p][n]);
		if (ans >= max)
			System.out.println(-1);
		else
			System.out.println(ans);
	}

}
