public class HelloNumbers {
	public static void main(String[] args) {
		int cumulativeSum = 0;
		for (int i = 1; i < 10; i ++) {
			System.out.print(cumulativeSum + " ");
			cumulativeSum += i;
		}
		System.out.println(cumulativeSum);
	}
}