import java.util.Arrays;


public class Problem012 {

	private int upTo = 10000;
	private int[] primes;
	private int[] triNum;
	
	public Problem012() {
		// TODO Auto-generated constructor stub

		findTriNum();
		//findPrimes2();
		
		int NumOfDiv = 0;
		int pIndex = 0;
		int maybeDiv = 1;
		
		for(int i = 0; i < upTo; i++) {
			maybeDiv = 1;
			while(maybeDiv <= triNum[i]/2) {
				if(triNum[i] % maybeDiv == 0) {
					NumOfDiv++;
				}
				maybeDiv++;
			}
			
			System.out.println("Triangel Number " + triNum[i] + " has " + NumOfDiv + " divisors");
			if(NumOfDiv >= 499)
				break;
			NumOfDiv = 0;
			// NumOfDiv < 500 continue
			
		}
		
	}
	
	public void findTriNum() {
		triNum = new int[upTo];
		triNum[0] = 0;
		for(int i = 1; i < upTo; i++)
			triNum[i] = triNum[i - 1] + i;
	}
	
	public void findPrimes2() {
		boolean[] bArray = new boolean[upTo];
		Arrays.fill(bArray, true);
		bArray[0] = false;
		bArray[1] = false;
		int index = 2;
		while(index <= Math.sqrt(upTo)) { // indexOutOfBoundException
			if(bArray[index] == true)
				for(int i = index*index; i < upTo; i += index)
					bArray[i] = false;
			index++;
		}
		
		primes = new int[upTo];
		for(int i = 0; i < bArray.length; i++)
			if(bArray[i])
				primes[i] = i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem012();
	}

}
