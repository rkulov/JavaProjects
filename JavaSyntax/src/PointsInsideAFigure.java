import java.util.Scanner;


public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float pointX = input.nextFloat();
		float pointY = input.nextFloat();
		if ((pointY>=6)&&(pointY<=13.5)&&(pointX>=12.5)&&(pointX<=22.5)){
			if ((pointY>8.5)&&(pointX>17.5)&&(pointX<20)){
				System.out.println("Outside");
			}
			else{
				System.out.println("Inside");
			}
			
		}
		else{
			System.out.println("Outside");
		}
		
	}

}
