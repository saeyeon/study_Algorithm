import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		String s = "";
		sc.nextLine();
		s = sc.nextLine();
		String[] ary = new String[c];
		ary = s.split(" ");
		Arrays.sort(ary);

		String pwd = "";
		int i = 0;
		go(l, ary, pwd, i);
	}

	private static void go(int l, String[] alpha, String pwd, int i) {
		// TODO Auto-generated method stub
		if (pwd.length() == l) {
			if (check(pwd)) {
				System.out.println(pwd);
			}
			return;
		}
		if (i >= alpha.length)
			return;
		go(l, alpha, pwd + alpha[i], i + 1);
		go(l, alpha, pwd, i + 1);
	}

	private static boolean check(String pwd) {
		// TODO Auto-generated method stub

		int mo = 0;
		int ja = 0;
		for (int i = 0; i < pwd.length(); i++) {
			if (pwd.charAt(i) == 'a' || pwd.charAt(i) == 'e' || pwd.charAt(i) == 'i' || pwd.charAt(i) == 'o'
					|| pwd.charAt(i) == 'u')
				mo += 1;
			else
				ja += 1;
		}
		if (mo >= 1 && ja >= 2)
			return true;
		else
			return false;
	}
}
