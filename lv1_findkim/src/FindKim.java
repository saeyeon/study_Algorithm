public class FindKim {
	public String findKim(String[] seoul){
		
		int x = 0;

		for(int i=0;i<seoul.length;i++){
			if(seoul[i]=="Kim")
				x=i;
		}

		
		return "�輭���� "+ x + "�� �ִ�";
	}
	
	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
}
