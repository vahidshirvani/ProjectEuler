
public class Problem002 {

	public Problem002() {
		
		int first = 1;
		int second = 2;
		int next = 0;
		int sumEven = 2;
		
		while(next < 4000000) {
			
			next = first + second;
			first = second;
			second = next;
			if(next % 2 == 0)
				sumEven += next;
		}
		
		System.out.println(sumEven);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem002();
	}

}
