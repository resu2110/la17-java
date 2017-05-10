import java.util.Arrays;
import java.util.Scanner;

public class AnagramExample {

	private static boolean check(String A, String B){
		// Complete the function by writing your code here.        
		if(A.length()>50 && A.length()>50){
			return false;
		}        

		char[] copyA = A.toLowerCase().toCharArray();
		char[] copyB = B.toLowerCase().toCharArray();
		Arrays.sort(copyA);
		Arrays.sort(copyB);

		System.out.println(copyA);
		System.out.println(copyB);

		for(int i = 0 ; i < copyA.length ;i++){
			if(copyA[i] != copyB[i]){
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner skanner = new Scanner(System.in);
		String A = skanner.nextLine();
		String B = skanner.nextLine();
		System.out.println(check(A,B) ? "Yes" : "No" );
	}

}
