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
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}