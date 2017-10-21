import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a= new int[n+1];
		int[][] d = new int[n+1][n+1];
		
		for(int i=1;i<=n;i++){
			a[i] = sc.nextInt();
		}
		d[1][1] = a[1];
		for(int i=2;i<=n;i++){
			d[i][2] = d[i-1][1] +a[i];
			d[i][1] = Math.max(d[i-2][1], d[i-2][2])+a[i];
		}
		System.out.println(Math.max(d[n][1], d[n][2]));
	}

}
