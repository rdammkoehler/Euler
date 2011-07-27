package com.noradltd.euler;

import java.util.Stack;


public class PrimeFinder {

	public int findPrime(int index) {
		int lastPrime = 0;
		int count = 0;
		PrimeCheck primeChecker = new PrimeCheck();
		for(int num = 2; count < index; num++ ) {
			if ( primeChecker.isPrime(num) ) {
				lastPrime = num;
				count++;
			}
		}
		return lastPrime;
	}
	
	public int original_findPrime(int index) {
		Stack<Integer> primes = new Stack<Integer>();
		PrimeCheck primeChecker = new PrimeCheck();
		for(int num = 2; primes.size() < index; num++ ) {
			if ( primeChecker.isPrime(num) ) {
				primes.push(num);
			}
		}
		return primes.pop();
	}

}
