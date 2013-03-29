
public class Problem006 {

	public Problem006() {
		// TODO Auto-generated constructor stub
		int sumOfSquare = 0;
		int squareOfSum = 0;
		for(int i = 1; i <= 100; i++) {
			sumOfSquare += i * i;
			squareOfSum += i;
		}
		
		squareOfSum *= squareOfSum;
		int difference = squareOfSum - sumOfSquare;
		System.out.println(difference);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem006();
	}

}
