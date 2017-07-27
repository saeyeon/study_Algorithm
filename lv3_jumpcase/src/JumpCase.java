class JumpCase {

	public int jumpCase(int num) {
		int answer = 0;
		int[] n = new int[num];
		n[0] = 1;
		n[1] = 2;

		for (int i = 2; i < num; i++)
			n[i] += n[i - 2] + n[i - 1];
		answer = n[num-1];
		return answer;
	}

	public static void main(String[] args) {
		JumpCase c = new JumpCase();
		int testCase = 5;
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.jumpCase(testCase));
	}
}
// dynamic programming
// 1칸 = 1; 2칸 = 2; 초기조건
// 3칸 = 2칸 + 1칸; 4칸 = 3칸 + 2칸 ; ....
// 5칸의 경우 4칸을 가는 각 경우의 수마다 +1칸씩 가면 되는 것 + 3칸의 경우를 더해주는 이유는 +2 의 경우의 수도 있기 때문에
// 피보나치 수열 ?