import java.util.Scanner;


public class TheSmallestOF3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float buff;
		buff = (a>b) ? b:a;
		buff = (b>c) ? c:b;
		buff = (a>c) ? c:a;
		System.out.println(buff);
	}

}
