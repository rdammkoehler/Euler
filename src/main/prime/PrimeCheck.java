package prime;

public class PrimeCheck {

	public boolean isPrime(int number) {
		boolean prime = true;
		for(int divisor = 2; divisor <= Math.sqrt(number) && prime; divisor++) {
			prime = number%divisor != 0;
		}
		return prime;
	}

}
