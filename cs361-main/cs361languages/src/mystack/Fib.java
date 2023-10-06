package mystack;

public class Fib {
	
	public static int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n needs to be >= 0");
		}
		else if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static int factorial(int n) {
		if (n < 0 || n > 12	) {
			throw new IllegalArgumentException("n needs to be >= 0");
		}
		else if (n == 0) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("fact(" + i + ") = " + Fib.factorial(i));
		}
		
		
	}
}
