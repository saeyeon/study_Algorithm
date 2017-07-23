import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		int n=0;
		int [] num =new int[array.length] ;
		for(int i=0; i<array.length;i++){
			if(array[i]%divisor==0){
				num[n] = array[i];
				n++;
			}
		}
		int [] ret = new int[n];
		for(int i=0;i<n;i++)
			ret[i] = num[i];
		
		return ret;
	}

	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}