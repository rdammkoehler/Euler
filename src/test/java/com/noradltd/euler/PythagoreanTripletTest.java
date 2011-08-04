package com.noradltd.euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.noradltd.euler.PythagoreanTriplet.Triplet;

public class PythagoreanTripletTest {

	/*
	 * A Pythagorean triplet is a set of three natural numbers, a b c, for
	 * which,
	 * 
	 * a^2 + b^2 = c^2 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */
	private static final Triplet ANSWER = new Triplet(200, 375, 425);
	private PythagoreanTriplet ptriple;

	@Before
	public void beforeTest() {
		ptriple = new PythagoreanTriplet();
	}

	@Test
	public void acceptsInputsWhosSumIsOneThousand() {
		assertThat(ptriple.accept(332, 333, 335), is(true));
	}

	@Test
	public void rejectsInputsWhosSumIsLessThanOneThousand() {
		assertThat(ptriple.accept(332, 333, 334), is(false));
	}

	@Test
	public void rejectsInputsWhosSumIsMoreThanOneThousand() {
		assertThat(ptriple.accept(332, 333, 336), is(false));
	}

	@Test
	public void acceptsInputsWhereALessThanBLessThanC() {
		assertThat(ptriple.accept(332, 333, 335), is(true));
	}

	@Test
	public void rejectsInputsWhereAGreaterThanBandLessThanC() {
		assertThat(ptriple.accept(333, 332, 335), is(false));
	}

	@Test
	public void rejectsInptusWhereBGreaterThanAandC() {
		assertThat(ptriple.accept(332, 335, 333), is(false));
	}

	@Test
	public void rejectsInputsWhereCLessThanAandB() {
		assertThat(ptriple.accept(335, 333, 332), is(false));
	}

	@Test
	public void acceptsSumOfSquaresOfAandBisSquareOfC() {
		assertThat(ptriple.isPythagorean(3, 4, 5), is(true));
	}

	@Test
	public void rejectsWhenSumOfSquarsOfAandBisNotSquareOfC() {
		assertThat(ptriple.isPythagorean(3, 4, 6), is(false));
	}

	@Test
	public void findsAcceptablePythagorean() {
		assertThat(ptriple.findPythagorean(), is(ANSWER));
	}
}
