package java005_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
	}//end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
	
		for(int i=2;i<num;i++) {
			if(num%i==0)
				System.out.printf(" %2d",i); 
		} // end for
		System.out.println();
	}// end primeNumber( )
}//end class