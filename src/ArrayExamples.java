import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {
	
	private static void printArray(int[] numbers){
		for(int i = 0 ; i < numbers.length ; i++){
			System.out.println(numbers[i]);
		}
	}
	
	private static double getAverageValue(int[] numbers){		
		double sum = 0;
		for(int i = 0 ; i < numbers.length ; i++){
			sum += numbers[i];
		}
		
		return sum/numbers.length;
	}
	
	public static boolean isNegativeValue(int numbers){
		if(numbers < 0) return true;
		return false;
	}
	
	public static double getPositiveProduct(int[] numbers){
		double product = 1;
		for(int i = 0 ; i < numbers.length ;i++){
			if(!isNegativeValue(numbers[i])){
				product *= numbers[i];
			}
		}		
		return product;
	}
	
	public static boolean search(int number,int[] numbers){
		
		for(int i = 0 ; i < numbers.length ; i++){
			if(number == numbers[i]){
				System.out.println(number + " is at " + i + " position..");
				return true;
			}
		}
		System.out.println("-1");
		return false;		
	}
	
	public static int countElement(int element, int[] numbers){
		int count = 0;
		for(int i = 0 ; i < numbers.length ; i++){
			if(element == numbers[i]) count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0 ; i < numbers.length ; i++){
			numbers[i] = scanner.nextInt();
		}
		
		System.out.println("Negatives:");
		for(int i = 0 ; i < numbers.length ; i++){
			if(isNegativeValue(numbers[i])){
				System.out.println(numbers[i]);
			}
		}
		
		System.out.println("Positive product: "+getPositiveProduct(numbers));
		
		System.out.println("Average:"+getAverageValue(numbers));
//==============================================================================
		
		boolean[] isDuplicate = new boolean[numbers.length];
		
		System.out.println("non-duplicated: ");
		for(int i = 0 ; i < numbers.length-1 ; i++){
			for(int j = i+1 ; j < numbers.length ; j++){
				if(numbers[i] == numbers[j]){
					isDuplicate[i] = true;
					isDuplicate[j] = true;
					continue;	//extremely important 
				}
			}
			
		}			
		for(int i = 0 ; i < numbers.length ; i++){			
			if(!isDuplicate[i]){
				System.out.println(numbers[i]);
			}
		}
//		==============================================================================
		System.out.println("Element with freq = 2 : ");
		for(int i = 0 ; i < numbers.length ; i++){
			if(countElement(numbers[i], numbers) == 2){
				System.out.println(numbers[i]);
			}
		}
		 
//		=============================================================================		
		System.out.println("Element with freq: ");
		for(int i = 0 ; i < numbers.length ; i++){
			System.out.println(countElement(numbers[i], numbers));
		}
		
//		=============================================================================
		System.out.println("Sorted Arrays: ");
		Arrays.sort(numbers);
		printArray(numbers);
		
		scanner.close();
	}
	

}
