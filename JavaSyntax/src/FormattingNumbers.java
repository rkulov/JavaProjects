import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Integer a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		System.out.format("|%-10X", a);
		System.out.format("|%010d|", Integer.parseInt((Integer.toBinaryString(a))));	
		System.out.format("%10.2f",b);
		System.out.format("|%-10.3f",c);
	}

}
