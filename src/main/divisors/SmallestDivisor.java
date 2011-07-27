package divisors;

public class SmallestDivisor {

	public int findFor(int smallest, int largest) {
		int answer = 0;
		boolean evenlyDivisibleByAll = false;
		while (!evenlyDivisibleByAll) {
			evenlyDivisibleByAll = true;
			answer++;
			for (int divisor = smallest; divisor <= largest; divisor++) {
				evenlyDivisibleByAll &= answer % divisor == 0;
			}
		}
		return answer;
	}
}
