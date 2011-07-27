package com.noradltd.euler;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.noradltd.euler.PrimeCheck;

public class PrimeTest {
	/*
	 * For any given number 1,2,3,4,5,6,7 ... let me know if that number is a prime.
	 */
	private PrimeCheck primeChecker = new PrimeCheck();
	
	@Test
	public void oneIsPrime() {
		isPrime(1);
	}
	
	@Test
	public void twoIsPrime() {
		isPrime(2);
	}
	
	@Test
	public void threeIsPrime() {
		isPrime(3);
	}
	
	@Test
	public void fourIsNotPrime() {
		isNotPrime(4);
	}
	
	@Test
	public void twentyThreeIsPrime() {
		isPrime(23);
	}
	
	@Test
	public void fortyTwoIsNotPrime() {
		isNotPrime(42);
	}
	
	private void isPrime(int number) {
		assertThat(primeChecker.isPrime(number),is(true));
	}
	
	private void isNotPrime(int number) {
		assertThat(primeChecker.isPrime(number),is(false));
	}
	
}
