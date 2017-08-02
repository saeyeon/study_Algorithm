class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
		int mod = n % 26;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch))
				ch = (char) ((ch - 'A' + mod) % 26 + 'A');
			else if (Character.isLowerCase(ch))
				ch = (char) ((ch - 'a' + mod) % 26 + 'a');
			result += ch;
		}
		// String[] str = new String[s.length()];
		// int[] asc = new int[s.length()];
		// int mod = n % 26;
		// for (int i = 0; i < s.length(); i++) {
		// str[i] = s.split("")[i];
		// asc[i] = (int) str[i].charAt(0);
		// System.out.println(s.length());
		// if (asc[i] <= 90 && asc[i] >= 65) {// 대문자
		// if (asc[i] + mod <= 90)
		// asc[i] += mod-1;
		// else
		// asc[i] = asc[i] + mod - 25;
		// }
		//
		// if (asc[i] >= 97) {// 소문자
		// if (asc[i] + mod <= 122)
		// asc[i] += mod;
		// else
		// asc[i] = asc[i] + mod - 25;
		// }
		//
		// if(asc[i] == 32)
		// asc[i] = 32;
		// result += (char) asc[i];
		// }
		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}

// 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
//
// A를 3만큼 밀면 D가 되고 z를 1만큼 밀면 a가 됩니다. 공백은 수정하지 않습니다.
//
// 보낼 문자열 s와 얼마나 밀지 알려주는 n을 입력받아 암호문을 만드는 ceasar 함수를 완성해 보세요.
//
// “a B z”,4를 입력받았다면 “e F d”를 리턴합니다.