public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	
    	String[] str1 = str.split(" ");
    	int min,max,n; // �ּҰ�, �ִ밪, �迭�� �޾ƿ� ����
    	
    	min=max=Integer.parseInt(str1[0]);//�迭�� ù ��° ���� �ִ�,�ּҰ����� ����
    	for(int i=0; i<str1.length;i++){
    		n = Integer.parseInt(str1[i]); // �迭���� �ϳ��� �޾ƿ�
    		if(min>n) min = n; // �ּҰ����� n�� ������ n�� �ּҰ��̵�
    		if(max<n) max = n; // �ִ밪���� n�� ũ�� n�� �ִ밪�� ��
    	}
    	// min,max��� ������ ��ȭ�ϴ� n�� ���� ��� ����ִ� ����
        return min+" "+max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
    }
}