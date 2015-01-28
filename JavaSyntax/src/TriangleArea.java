import java.util.Scanner;


public class TriangleArea {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int Ax = input.nextInt();
		int Ay = input.nextInt();
		int Bx = input.nextInt();
		int By = input.nextInt();
		int Cx = input.nextInt();
		int Cy = input.nextInt();
		double area;
		area = (Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2;
		if (area<0){
			area= area*-1;
		}
		System.out.println((int)area);
		
	}
}
