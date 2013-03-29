
public class Problem005 {

	public Problem005() {
		// TODO Auto-generated constructor stub
		
		int number = 2520;
		boolean found = false;
		while(!found) {
			number++;
			if(		number % 20 == 0 && // 20, 10, 5, 4, 2
					number % 19 == 0 && // prime
					number % 18 == 0 && // 9, 6, 3
					number % 17 == 0 && // prime
					number % 16 == 0 && // 8, 2
					number % 15 == 0 && // 5, 3 
					number % 14 == 0 && // 7, 2
					number % 13 == 0 && // prime
					number % 12 == 0 && // 6, 2
					number % 11 == 0 )  // prime
				found = true;
		}
		System.out.println(number);
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem005();
	}

}
