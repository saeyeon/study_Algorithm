import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[][] c = new int[100][100];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		for (int k = 0; k < a; k++) {
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					if (c[i][k] == 1 && c[k][j] == 1)
						c[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
