import java.awt.List;
import java.util.Arrays;


public class ReverseStr {
	public String reverseStr(String str){
	
		char[] str3 = str.toCharArray(); // �ɰ��� �迭�� ����ִ°�
		Arrays.sort(str3);// �迭 �����ϴ°�
//		String[] str1 = str.split("");
//		Arrays.sort(str1);
//		String temp = "";
//		String str2 ="";
//		for(int i=0; i<str1.length/2;i++){
//			temp = str1[i];
//			str1[i] = str1[str1.length-1-i];
//			str1[str1.length-1-i] = temp;
//		}
//		for(int i=0;i<str1.length;i++)
//			str2 +=str1[i];
		
		return new StringBuilder(new String(str3)).reverse().toString();
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}