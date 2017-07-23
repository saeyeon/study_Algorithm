public class PrintTriangle {
	public String printTriangle(int num) {

		String ret = "";
		String star = "*";
		for (int i = 0; i < num; i++) {
			ret += star + "\n";
			star += "*";
		}

//		for (int j = 0; j < num; j++) {
//			for (int k = 0; k < j + 1; k++) {
//				ret += "*";
//			}
//			ret += "\n";
//		}

		return ret;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println(pt.printTriangle(3));
	}
}