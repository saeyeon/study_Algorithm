class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// �Լ��� �ϼ��ϼ���.
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
		// if (asc[i] <= 90 && asc[i] >= 65) {// �빮��
		// if (asc[i] + mod <= 90)
		// asc[i] += mod-1;
		// else
		// asc[i] = asc[i] + mod - 25;
		// }
		//
		// if (asc[i] >= 97) {// �ҹ���
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
		System.out.println("s�� 'a B z', n�� 4�� ���: " + c.caesar("a B z", 4));
	}
}

// � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
//
// A�� 3��ŭ �и� D�� �ǰ� z�� 1��ŭ �и� a�� �˴ϴ�. ������ �������� �ʽ��ϴ�.
//
// ���� ���ڿ� s�� �󸶳� ���� �˷��ִ� n�� �Է¹޾� ��ȣ���� ����� ceasar �Լ��� �ϼ��� ������.
//
// ��a B z��,4�� �Է¹޾Ҵٸ� ��e F d���� �����մϴ�.