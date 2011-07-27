package com.noradltd.euler;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.noradltd.euler.PrimeFinder;


public class PrimeFinderTest {
	/*
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10001st prime number?
	 */
	
	@Test
	public void firstPrimeNumberIsTwo() {
		int actual = new PrimeFinder().findPrime(1);
		
		assertThat(actual, is(2));
	}
	
	@Test
	public void thirdPrimeNumberIsFive() {
		int actual = new PrimeFinder().findPrime(3);
		
		assertThat(actual, is(5));
	}
	
	@Test
	public void sixthPrimeNumberIsThirteen() {
		int actual = new PrimeFinder().findPrime(6);
		
		assertThat(actual, is(13));
	}
	
	
	@Test
	public void tenThousandAndFirstPrimeIsReallyBig() {
		int actual = new PrimeFinder().findPrime(10001);
		
		assertThat(actual, is(104743));
	}

}
