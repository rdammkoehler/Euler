package com.noradltd.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.noradltd.euler.SmallestDivisor;

public class SmallestTest {
	/*
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder. What is the smallest positive number
	 * that is evenly divisible by all of the numbers from 1 to 20?
	 */

	@Test
	public void baseLineFactAboutOneThruTen() {
		assertEquals(2520, new SmallestDivisor().findFor(1, 10));
	}

	@Test
	public void forOneThruTwo() {
		assertEquals(2, new SmallestDivisor().findFor(1, 2));
	}

	@Test
	public void forOneThruThree() {
		assertEquals(6, new SmallestDivisor().findFor(1, 3));
	}

	@Test
	public void forOneThruTwenty() {
		assertEquals(232792560, new SmallestDivisor().findFor(1, 20));
	}
}
