import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String nSequence= input.nextLine();
        String[] numbers= nSequence.split(" ");
        ArrayList<Integer> nList = new ArrayList<>(n);
        for (String s: numbers){
            nList.add(Integer.parseInt(s));
        }
        Collections.sort(nList);
        for (int i=0; i<nList.size();i++) {
            System.out.printf("%d ", nList.get(i));
        }
    }
}
