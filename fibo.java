package cce105;

public class fibo {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(x +", ");
			
			int z = x + y;
			
			
								
			x=y;
			y=z;
		}

	}

}
