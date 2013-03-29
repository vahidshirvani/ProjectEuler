
public class Problem001 {

	public Problem001() {
		
		int sum3 = 0;
		for(int counter = 0; counter < 334; counter++)
			sum3 += 3 * counter;
		
		int sum5 = 0;
		for(int counter = 0; counter < 200; counter++)
			sum5 += 5 * counter;
		
		int sum35 = 0;
		for(int counter = 0; counter < 67; counter++)
			sum35 += 3 * 5 * counter;
		
		int sum = sum3 + sum5 - sum35;
		
		/*
		int[] array3 = new int[334];
		for(int counter = 0; counter < 334; counter++)
			array3[counter] = 3 * counter;
		
		int[] array5 = new int[200];
		for(int counter = 0; counter < 200; counter++)
			array5[counter] = 5 * counter;
		
		int[] array35 = new int[534];
		int index3 = 0;
		int index5 = 0;
		int index35 = 0;
		
		if(array3[index3] < array5[index5]) {
			array35[index35++] = array3[index3++];
		} else if(array5[index5] < array3[index3]) {
			array35[index35++] = array5[index5++];
		} else {
			array35[index35++] = array5[index5++];
			index3++;
		}
		
		int sum = 0;
		for(int counter = 0; counter < 534; counter++)
			sum += array35[counter];
		*/
		System.out.println(sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Problem001();
	}

}
