class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		long num0= 0;
		long num1 = 1;
		if(num == 0 || num == 1)
			answer = num;
		
		else{
				for(int i=0; i<num-1; i++){

					answer =num0 + num1 ;
					num0 = num1;
					num1 = answer;
				}
		}
		return answer;
	}

  // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 10;
		System.out.println(c.fibonacci(testCase));
	}
}
