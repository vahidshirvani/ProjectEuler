
public class Problem003 {

	public Problem003() {
		
		int[] prime = new int[1000000]; //TODO size
		prime[0] = 2;
		prime[1] = 3;
		int lastIndex = 1;
		boolean flag = true;
		
		for(int counter = 4; counter < Math.sqrt(600851475143L); counter++) {
			for(int index = 0; index <= lastIndex; index++)
				if(counter % prime[index] == 0) {
					flag = false;
					break;
				}
			
			if(flag)
				prime[++lastIndex] = counter;
				
			flag = true;
		}
		
//		for(int i = 0; i <= lastIndex; i++)
//		System.out.println(prime[i]);
		
		for(int index = 0; index <= lastIndex; index++)
			if(600851475143L % prime[index] == 0) {
				System.out.println(prime[index]);
			}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem003();
	}
}
