package prac2;

public class ack {
	

	private static double ackermann(int m, double n) {
	
		if(m==0) return n+1;
		else 
		{
			if(m>0 && n==0) return ackermann(m-1,1);
			
			else return ackermann(m-1, ackermann(m,n-1));
			}
		
	}

	
	public static void main(String[] args) {
		
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		System.out.println(ackermann(m,n));
	}

}
