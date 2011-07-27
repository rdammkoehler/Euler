package divisors;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmallestTest {
	/*
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder. What is the smallest positive number
	 * that is evenly divisible by all of the numbers from 1 to 20?
	 */
	private long start = 0;

	@Before
	public void before() {
		start = System.nanoTime();
	}

	@After
	public void after() {
		System.out.println(System.nanoTime() - start + "ns");
	}

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
