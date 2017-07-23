public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	
    	String[] str1 = str.split(" ");
    	int min,max,n; // 최소값, 최대값, 배열값 받아올 변수
    	
    	min=max=Integer.parseInt(str1[0]);//배열의 첫 번째 값을 최대,최소값으로 설정
    	for(int i=0; i<str1.length;i++){
    		n = Integer.parseInt(str1[i]); // 배열값을 하나씩 받아옴
    		if(min>n) min = n; // 최소값보다 n이 작으면 n이 최소값이됨
    		if(max<n) max = n; // 최대값보다 n이 크면 n이 최대값이 됨
    	}
    	// min,max라는 변수에 변화하는 n의 값만 계속 집어넣는 형식
        return min+" "+max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}