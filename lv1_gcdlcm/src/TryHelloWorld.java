import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        int mod;
        int big = b;
        int small = a;
        while(true){
        	
        	mod = b%a;
        	if(mod == 0){
        		answer[0] = a;
        		break;
        	}
        	else{
        		b = a;
        		a = mod;
        	}
        	
        }
        answer[1] = (big*small)/answer[0];
        
        return answer;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
