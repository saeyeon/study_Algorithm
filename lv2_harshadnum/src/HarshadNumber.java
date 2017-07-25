public class HarshadNumber {
	public boolean isHarshad(int num) {

//		String str = num + "";
//		int length = str.length();
//		int index = 0;
//		int sum = 0;
//		int temp = num;
//		for (int i = length - 1; i > 0; i--) {
//			index = (int) (num / (Math.pow(10, i)));
//			num = (int) (num - (Math.pow(10, i)) * index);
//			sum += index;
//			if (num < 10) {
//				sum += num;
//				break;
//			}
//		}
//
//		if (temp % sum == 0)
//			return true;
//		else
//			return false;
		
		int n = num;
		int sum = 0;
		while(n!=0){
			sum += n%10;
			n /= 10;
		}
		if(num%sum==0)
			return true;
		else
			return false;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}
