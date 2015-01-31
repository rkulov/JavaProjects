import java.util.Scanner;


public class SymetricNumbersInRange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
			if (start<0||start>end||start>999){
				System.out.println("Invalid value of start,"
						+ " please input new value");
				start = input.nextInt();
			}
			if (end<0||end>999||end<start){
				System.out.println(" Invalid value of end, please input new value");
				end = input.nextInt();
			}
			for ( int i=start; i<=end; i++){
				if (i<10){
					System.out.print(i+" ");
				}
				else if (i<100&&i/10==i%10){
					System.out.print(i+" ");
				}
				else if(i>100&&i/100==i%10){
					System.out.print(i+" ");
				}
			}
	}
}
