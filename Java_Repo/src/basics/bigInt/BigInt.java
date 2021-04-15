package basics.bigInt;

import java.math.BigInteger;

public class BigInt {

	public static void main(String[] args) {

		//Declaration
		BigInteger A,B;
		
		//Initialization
		int a = 20;
		A = BigInteger.valueOf(a);
		String s = "123456789";
		B = new BigInteger(s);
		
		//Mathematical Operation
		System.out.println(A.add(B));
		System.out.println(A.multiply(B));
		System.out.println(A.subtract(B));
		System.out.println(A.divide(B));
		
		//Value extraction
		a = B.intValue();
		s = A.toString();
		
		//Comparison
		System.out.println(A.compareTo(B) > 0);
		
		//factorial function
		BigInteger C = fact(100);
		System.out.println(C);
	}
	

	private static BigInteger fact(int n) {
		BigInteger N = BigInteger.valueOf(1);
		
		for(int i=1; i<=n; i++) {
			N = N.multiply(BigInteger.valueOf(i));
		}
		
		return N;
	}

}
