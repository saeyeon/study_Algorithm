class StringExercise{
    String getMiddle(String word){

    	String[] str = word.split("");
    	int len = str.length;
    	String ret = "";
   
    	if(len%2==0)
    		ret = str[len/2 -1]+str[len/2];
    		
    		
    	if(len%2==1)
    		ret = str[len/2];
  
    	
    	return ret;    
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}