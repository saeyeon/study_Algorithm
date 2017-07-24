import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class TryHelloWorld {
	public String getDayName(int a, int b) {

		String answer = "";
		int days[ ] = {31,29,31,30,31,30,31,31,30,31,30,31};
		String str[ ] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int sum = 0;
		for(int i=0; i<a-1; i++){
			sum += days[i];
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