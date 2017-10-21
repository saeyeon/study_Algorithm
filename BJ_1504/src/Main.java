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

		for (int i = 1; i <= n; i++) { // ���İ��� ������
			for (int j = 1; j <= n; j++) { // �����ϴ� ������
				for (int k = 1; k <= n; k++) { // �����ϴ� ������
					if (w[j][i] + w[i][k] < w[j][k]) { // ���������� ���ļ� ������ ���� ��ΰ� ���ۿ��� �ٷ� ��η� ���� �ͺ��� ª����
						w[j][k] = w[j][i] + w[i][k]; // ���� ��ü����
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
