
public class Problem004 {

	public Problem004() {
		// TODO Auto-generated constructor stub
		int[] array = new int[9801];
		int index = 0;
		for(int i = 999; i > 900; i--)
			for(int j = 999; j > 900; j--) {
				array[index++] = i * j;
				//System.out.println(array[index - 1]);
			}
		
		boolean found = false;
		String first = "";
		String second = "";
		index = 0;
		while(!found) {
			first = String.valueOf(array[index++]);
			second = new StringBuilder(first).reverse().toString();
			if(first.equals(second) || index >= array.length)
				found = true;
		}
		System.out.println(first + " " + second);
		
//		boolean flag = true;
//		while(index < array.length) {
//			
//			if(found)
//		}
//		
//		for(int charIndex = 0; charIndex < sNumber.length() / 2; charIndex++)
//			if(sNumber.charAt(charIndex) != sNumber.charAt(sNumber.length() - 1 - charIndex)) {
//				flag = false;
//				break;
//			}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem004();
	}

}
