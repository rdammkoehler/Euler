package com.noradltd.euler;

public class PythagoreanTriplet {

	public boolean accept(int a, int b, int c) {
		return sumIsOneThousand(a, b, c) && isTriplet(a, b, c);
	}

	private boolean isTriplet(int a, int b, int c) {
		return a < b && b < c;
	}

	private boolean sumIsOneThousand(int a, int b, int c) {
		return a + b + c == 1000;
	}

	public boolean isPythagorean(int a, int b, int c) {
		return (a * a) + (b * b) == (c * c);
	}

	public Triplet findPythagorean() {
		Triplet triplet = null;
		for (int aIdx = 0; aIdx < 1000; aIdx++) {
			for (int bIdx = aIdx + 1; bIdx < 1000; bIdx++) {
				for (int cIdx = bIdx + 1; cIdx < 1000; cIdx++) {
					if (accept(aIdx, bIdx, cIdx) && isPythagorean(aIdx, bIdx, cIdx)) {
						triplet = new Triplet(aIdx, bIdx, cIdx);
					}
				}
			}
		}
		return triplet;
	}

	static class Triplet {
		int a, b, c;

		public Triplet(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		@Override
		public String toString() {
			return "Triplet [a=" + a + ", b=" + b + ", c=" + c + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + a;
			result = prime * result + b;
			result = prime * result + c;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Triplet other = (Triplet) obj;
			if (a != other.a)
				return false;
			if (b != other.b)
				return false;
			if (c != other.c)
				return false;
			return true;
		}

	}
}
