import java.util.ArrayList;

public class PrimeNumberSum {
	public static void main(String[] args) {
		int N = 7;
		int sum = 0;
		
		boolean isDecimal = true;
		
		ArrayList<Integer> decimalList = new ArrayList<Integer>();

		for (int i = 2; i <= N; i++) {
			for(int j = 0; j < decimalList.size(); j++) {
				if ( i % decimalList.get(j) == 0) {
					isDecimal = false;
					break;
				}
			}
						
			if (isDecimal == true) {
				decimalList.add(i);
				sum += i;
			}
			
			isDecimal = true;
		}
		
		System.out.println(sum);
	}
}
