package com.noradltd.euler;

public class SmallestDivisor {
	int smallest, largest;

	public int findFor(int smallest, int largest) {
		this.smallest = smallest;
		this.largest = largest;
		return check();
	}

	private int check() {
		int answer = largest;
		while (!evenlyDivisibleByAll(answer)) {
			answer++;
		}
		return answer;
	}

	private boolean evenlyDivisibleByAll(int answer) {
		boolean evenlyDivisibleByAll = true;
		// flag adds 4x performance
		for (int divisor = smallest; evenlyDivisibleByAll && divisor <= largest; divisor++) {
			evenlyDivisibleByAll &= answer % divisor == 0;
		}
		return evenlyDivisibleByAll;
	}

}
