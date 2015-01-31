import java.util.Scanner;


public class CountsOfBitOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count=0;
		count = Integer.bitCount(n);
		System.out.println(count);
	}

}
