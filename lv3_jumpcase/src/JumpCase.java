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
		// ¾Æ·¡´Â Å×½ºÆ®·Î Ãâ·ÂÇØ º¸±â À§ÇÑ ÄÚµåÀÔ´Ï´Ù.
		System.out.println(c.jumpCase(testCase));
	}
}
// dynamic programming
// 1Ä­ = 1; 2Ä­ = 2; ÃÊ±âÁ¶°Ç
// 3Ä­ = 2Ä­ + 1Ä­; 4Ä­ = 3Ä­ + 2Ä­ ; ....
// 5Ä­ÀÇ °æ¿ì 4Ä­À» °¡´Â °¢ °æ¿ìÀÇ ¼ö¸¶´Ù +1Ä­¾¿ °¡¸é µÇ´Â °Í