public class WaterMelon {
	public String watermelon(int n){
		if(n<0)
			return null;
		String str = "";
		for(int i=0;i<n;i++){
			if(i%2==0)
				str+="��";
			if(i%2==1)
				str+="��";		
		}
		return str;
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}