import java.util.Scanner;
import java.util.Arrays;
public class SortArrayOfStrings {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		String[] words = new String[n];
		for (int i = 0; i <n; i++){
			words[i] = read.next();
		}
		Arrays.sort(words);
		for ( int j=0; j<n; j++){
			System.out.println(words[j]);
		}
	}
}
