import java.util.Scanner;


public class CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String nBin= Integer.toBinaryString(n);
		String[] nBinArr = nBin.split("");
		int count=0;
		for (int i = 1;i<nBinArr.length;i++){
			if ( nBinArr[i-1].equals(nBinArr[i])){
				count = count+1;
			}
		}
		System.out.println(count);
	}

}
