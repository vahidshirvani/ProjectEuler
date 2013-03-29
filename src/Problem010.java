import java.util.Arrays;


public class Problem010 {

	private int n = 2000000; // exclusive
	private int size = 1000000;
	private int[] prime = new int[size]; //TODO size
	private int lastIndex = 0;
	
	public Problem010() {
		
		findPrimes2();
//		findPrimes1();
//		
//		int sum = 0;
//		for(int i = 0; i < lastIndex; i++) {
//			//System.out.println(prime[i]);
//			sum += prime[i];
//		}
//		
//		System.out.println(sum);
	}
	
	public void findPrimes1() {
		prime[0] = 2;
		prime[1] = 3;
		lastIndex = 2;
		boolean flag = true;
		
		for(int counter = 5; counter < n; counter += 2) {
			for(int index = 0; index < lastIndex; index++)
				if(counter % prime[index] == 0) {
					flag = false;
					break;
				}
			
			if(flag)
				prime[lastIndex++] = counter;
			if(lastIndex >= size) {
				System.out.println("overflow");
				break;
			}
			
			flag = true;
		}
	}
	
	public void findPrimes2() {
		boolean[] bArray = new boolean[n];
		Arrays.fill(bArray, true);
		bArray[0] = false;
		bArray[1] = false;
		int index = 2;
		while(index <= Math.sqrt(n)) { // indexOutOfBoundException
			if(bArray[index] == true)
				for(int i = index*index; i < n; i += index)
					bArray[i] = false;
			index++;
		}
		
		long sum = 0;
		for(int i = 0; i < bArray.length; i++)
			if(bArray[i])
				sum += i;
		System.out.println(sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem010();
	}

}
