import java.util.Scanner;


public class Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] l= input.nextLine().toCharArray();
		if (l.length==3){
			for ( int x =0; x<l.length; x++){
				for ( int y =0; y<l.length; y++){
					for ( int z =0; z<l.length; z++){
						System.out.printf(" %s%s%s",l[x],l[y],l[z]);
					}
				}
			}
		}
		if (l.length==2){
			char z=l[0];
			for ( int x =0; x<l.length; x++){
				for ( int y =0; y<l.length; y++){
						System.out.printf(" %s%s%s",l[x],l[y],z);
				}
			}
			z=l[1];
			for ( int x =0; x<l.length; x++){
				for ( int y =0; y<l.length; y++){
						System.out.printf(" %s%s%s",l[x],l[y],z);
				}
			}
		}
		if (l.length==1){
			System.out.printf(" %s%s%s",l[0],l[0],l[0]);
		}
	}

}
