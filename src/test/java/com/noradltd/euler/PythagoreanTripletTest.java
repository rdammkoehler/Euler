package com.noradltd.euler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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

	@Test
	public void acceptsInputsWhosSumIsOneThousand() {
		assertThat(ANSWER.accept(332, 333, 335), is(true));
	}

	@Test
	public void rejectsInputsWhosSumIsLessThanOneThousand() {
		assertThat(ANSWER.accept(332, 333, 334), is(false));
	}

	@Test
	public void rejectsInputsWhosSumIsMoreThanOneThousand() {
		assertThat(ANSWER.accept(332, 333, 336), is(false));
	}

	@Test
	public void acceptsInputsWhereALessThanBLessThanC() {
		assertThat(ANSWER.accept(332, 333, 335), is(true));
	}

	@Test
	public void rejectsInputsWhereAGreaterThanBandLessThanC() {
		assertThat(ANSWER.accept(333, 332, 335), is(false));
	}

	@Test
	public void rejectsInptusWhereBGreaterThanAandC() {
		assertThat(ANSWER.accept(332, 335, 333), is(false));
	}

	@Test
	public void rejectsInputsWhereCLessThanAandB() {
		assertThat(ANSWER.accept(335, 333, 332), is(false));
	}

	@Test
	public void acceptsSumOfSquaresOfAandBisSquareOfC() {
		assertThat(ANSWER.isPythagorean(3, 4, 5), is(true));
	}

	@Test
	public void rejectsWhenSumOfSquarsOfAandBisNotSquareOfC() {
		assertThat(ANSWER.isPythagorean(3, 4, 6), is(false));
	}

	@Test
	public void findsAcceptablePythagorean() {
		assertThat(new PythagoreanTriplet().findPythagorean(), is(ANSWER));
	}
}
