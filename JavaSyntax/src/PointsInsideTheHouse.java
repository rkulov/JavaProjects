import java.util.Scanner;


public class PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float Px= input.nextFloat();
		float Py= input.nextFloat();
		double ABC;
		double ABP;
		double APC;
		double PBC;
		ABC = ((12.5*(8.5-3.5)+22.5*(3.5-8.5)+17.5*(8.5-8.5))/2);
		ABP = (12.5*(8.5-Py)+22.5*(Py-8.5)+Px*(8.5-8.5))/2;
		APC = (12.5*(Py-3.5)+Px*(3.5-8.5)+17.5*(8.5-Py))/2;
		PBC = (Px*(8.5-3.5)+22.5*(3.5-Py)+17.5*(Py-8.5))/2;

		if (ABC==ABP+APC+PBC){
			System.out.println("Inside");
		}		// nqkude ima greshka... 
		else{
			if ((Px>=12.5)&&(Px<=22.5)&&(Py>=8.5)&&(Py<=13.5)){
				if((Px<=17.5)&&(Px>=20)){
					System.out.println("Inside");
				}
				else{
					System.out.println("Outside");
				}
			}
		}
	}
}
