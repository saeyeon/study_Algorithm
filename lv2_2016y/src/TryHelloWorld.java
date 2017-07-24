import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class TryHelloWorld {
	public String getDayName(int a, int b) {
		System.out.println(a+""+b);
		String answer = "";
		int days[ ] = {31,29,31,30,31,30,31,31,30,31,30,31};
		String str[ ] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int sum = 0;
		for(int i=0; i<a-1; i++){
			sum = days[i];
		}
		sum += b-1;
		return str[sum%7];
	}

	public static void main(String[] args) {
		TryHelloWorld test = new TryHelloWorld();
		int a = 5, b = 24;
		System.out.println(test.getDayName(a, b));
	}
}

// 2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� A�� B���� ���� �����ϱ��? �� �� A,B�� �Է¹޾� A�� B���� ���� �������� ����ϴ�
// getDayName �Լ��� �ϼ��ϼ���. ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ����
//
// SUN,MON,TUE,WED,THU,FRI,SAT
//
// �� ������ָ� �˴ϴ�. ���� ��� A=5, B=24�� �Էµȴٸ� 5�� 24���� ȭ�����̹Ƿ� TUE�� ��ȯ�ϸ� �˴ϴ�.