import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] from={0,0,1,1,2,2};
	static int[] to = {1,2,0,2,0,1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Pair{
			int x;
			int y;
			
			Pair(int x, int y){
				this.x = x;
				this.y = y;
			}
		}
		Scanner sc = new Scanner(System.in);
		
		int[] cap = new int[3];
		
		for(int i=0;i<3;i++)
			cap[i] = sc.nextInt();
		
		Queue<Pair> q = new LinkedList<Pair>();
		
		Pair start = new Pair(0,0);
		q.offer(start);
		while(!q.isEmpty()){
			Pair now = q.poll();
			int x = now.x;
			int y = now.y;
			int z = cap[2]-x-y;
			
			for(int i=0;i<6;i++){
				int[] next = {x,y,z};
				next[to[i]] += next[from[i]];
				next[from[i]] = 0;
				if(next[to[i]]>=cap[to[i]]){
					next[from[i]] = next[to[i]] - cap[to[i]];
					next[to[i]] = cap[to[i]];
				}
				
			}
		}
	}

}
