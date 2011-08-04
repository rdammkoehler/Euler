package com.noradltd.euler;

public class PythagoreanTriplet {

	public Triplet findPythagorean() {
		Triplet triplet = new Triplet(0, 0, 0);
		for (int aIdx = 0; limitA(aIdx) && !triplet.isValid(); aIdx++) {
			for (int bIdx = aIdx + 1; limitB(aIdx, bIdx) < 1000 && !triplet.isValid(); bIdx++) {
				for (int cIdx = bIdx + 1; limitC(aIdx, bIdx, cIdx) < 1000 && !triplet.isValid(); cIdx++) {
					triplet = new Triplet(aIdx, bIdx, cIdx);
				}
			}
		}
		return triplet;
	}

	private boolean limitA(int aIdx) {
		return (3 * aIdx) < 1000;
	}

	private int limitB(int aIdx, int bIdx) {
		return aIdx + (2 * bIdx) - 1;
	}

	private int limitC(int aIdx, int bIdx, int cIdx) {
		return aIdx + bIdx + cIdx - 1;
	}

	static class Triplet {
		int a, b, c;

		public Triplet(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		public boolean isValid() {
			return accept(a, b, c) && isPythagorean(a, b, c);
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

	}
}
