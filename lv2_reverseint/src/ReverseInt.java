import java.util.Arrays;

public class ReverseInt {
	public int reverseInt(int n) {

		String str = n + "";
		int sum = 0;
		int[] num = new int[str.length()];
		int nnn = n;
		for (int i = 0; i < str.length(); i++) {
			num[i] = nnn % 10;
			nnn /= 10;
		}

		Arrays.sort(num);

		for (int i = num.length - 1; i >= 0; i--)
			sum += num[i] * Math.pow(10, i);

		return sum;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}
