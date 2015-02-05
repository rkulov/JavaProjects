import java.util.Scanner;


public class SequencesOfEqualStrings {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String sequence = in.nextLine();
        String[] seqArray= sequence.split(" ");
        System.out.print(seqArray[0]);
        for (int i= 1; i<seqArray.length; i++){

            System.out.printf("%s%s",seqArray[i].equals(seqArray[i-1])? " ":"\n", seqArray[i] );
        }
    }
}
