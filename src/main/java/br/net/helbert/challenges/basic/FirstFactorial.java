package br.net.helbert.challenges.basic;

public class FirstFactorial {
	
	public static int firstFactorial(final int num) {
		
		int result = 1;
		
		final int sign = Integer.signum(num);
		int module = Math.abs(num);
		
		while (module > 1) {		
			result *= module--;	
		} 
		
		result *= sign;
		return result; 
	}	

}
