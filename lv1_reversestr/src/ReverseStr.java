import java.awt.List;
import java.util.Arrays;


public class ReverseStr {
	public String reverseStr(String str){
	
		char[] str3 = str.toCharArray(); // 쪼개서 배열에 집어넣는거
		Arrays.sort(str3);// 배열 정렬하는거
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

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}