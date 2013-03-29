
public class Problem007 {

	public Problem007() {
		// TODO Auto-generated constructor stub
		int[] prime = new int[100000]; //TODO size
		prime[0] = 2;
		prime[1] = 3;
		int lastIndex = 1;
		boolean flag = true;
		
		for(int counter = 4; counter < 1000000000; counter++) {
			for(int index = 0; index <= lastIndex; index++)
				if(counter % prime[index] == 0) {
					flag = false;
					break;
				}
			
			if(flag)
				prime[++lastIndex] = counter;
			if(lastIndex > 10000)
				break;
			
			flag = true;
		}
		System.out.println(prime[10000]);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem007();
	}

}
