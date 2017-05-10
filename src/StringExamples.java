import java.util.StringTokenizer;

public class StringExamples {
	
	
	protected static int countingWords(String sentence){
		StringTokenizer stringTokenizer = new StringTokenizer(sentence," ");
		int count = 0;
		while(stringTokenizer.hasMoreTokens()){
			count++;
			System.out.println(stringTokenizer.nextToken());
		}
		return count;
	}
	
//	protected static String normalizeString(String source){
//		source.trim();
//		source.toLowerCase();
//		char[] target = source.toCharArray();
//		
//		for(int i = 0 ; i < target.length ; i++){
//			if(target[i] == ' ') String.
//		}
//		
//		
//	}
	
	public static void main(String[] args) {
		
		String exampleSentence = "I am awesome, do you know?";
		System.out.println(countingWords(exampleSentence));
		
		
		
	}
}
