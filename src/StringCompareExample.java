import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCompareExample {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] copy = A.toCharArray();
        /* Enter your code here. Print output to STDOUT. */
        char[] charArray ={' '};
        
        for(int i = 0, j = copy.length-1 ; j>=0 ; i++,j--){
            charArray[i] = copy[j];
        }
        System.out.println(copy+"\n"+charArray);
        
        if(String.valueOf(copy) == String.valueOf(charArray)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}
