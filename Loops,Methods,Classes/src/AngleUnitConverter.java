import java.util.Scanner;


public class AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		Double[] result = new Double[n];
		String[] checkSum = new String[n];
		for (int i=0; i<n; i++){
			double value=input.nextDouble();
			String cKind = input.next();
			switch (cKind){
			case "rad" : value= (value*180/Math.PI);
						result[i]=value;
						checkSum[i]="r";break;
			case "deg" : value= (value*Math.PI/180);
						result[i]=value;
						checkSum[i]="d";break;
			}
		}
		for ( int j =0; j<n;j++){
			if (checkSum[j]=="r"){
			System.out.printf(" %.6f deg\n" ,result[j]);
			}
			else{
				System.out.printf(" %.6f rad\n" ,result[j]);
			}
	}

}
}
