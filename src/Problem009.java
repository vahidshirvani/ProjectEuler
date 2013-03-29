
public class Problem009 {

	public Problem009() {
		int c = 0;
		for(int a = 1; a <= 332; a++)
			for(int b = a + 1; b <= 500; b++) {
				c = 1000 - b - a;
				if(a*a + b*b == c*c) {
					System.out.println(a*b*c);
				}
			}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem009();
	}

}
